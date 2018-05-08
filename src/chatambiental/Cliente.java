package chatambiental;

import View.TelaChat;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * Classe onde vai ocorrer toda a parte de comunicação do Usuario com o
 * servidor.
 *
 * @author Math
 */
public class Cliente {

    /**
     *
     *
     *
     */
    private static Socket cli;
    private static PrintStream out;
    private static BufferedReader in;
    private static String usuario;
    private static ObjectOutputStream oos;
    private static ObjectInputStream ois;

    /**
     *
     * cli cria um Socket(parametro de conexão: ip e porta utilizadas ) out
     * (manda para o servidor) in (recebe do servidor) intputline (recebe do
     * cliente)
     *
     */
      public static void iniciar() {
        try {
            cli = new Socket("localhost", 2222);
            out = new PrintStream(cli.getOutputStream());
            in = new BufferedReader(new InputStreamReader(cli.getInputStream()));
            //ois = new ObjectInputStream(cli.getInputStream());
            //oos = new ObjectOutputStream(cli.getOutputStream());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void enviar(String mensagem) {
        try {
            if(oos == null)
                oos = new ObjectOutputStream(cli.getOutputStream());
            oos.writeObject(new Mensagem(mensagem));
            oos.flush();
            //out.println(mensagem);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static String receber() {
        Mensagem recebido = null;
        try{
            if(ois == null)
                ois = new ObjectInputStream(cli.getInputStream());
        recebido = (Mensagem) ois.readObject();
        
        }catch(Exception e){
            e.printStackTrace();
        }
        return recebido.mensagem;
    }
    
    public static void iniciarThreadResposta() {
        new Thread(new RespostaServidor(cli, out, in, ois)).start();
    }
    
    public static void armazenarUsuario(String user){
    usuario = user;
    }
    
    public static String devolverUsuario(){
    return usuario;
    }

}
