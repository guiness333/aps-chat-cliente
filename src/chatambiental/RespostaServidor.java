/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatambiental;

import View.TelaChat;
import View.TelaLogin;
import View.TelaOnlines;
import View.TelaPrincipal;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.net.Socket;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.concurrent.Task;
import javax.swing.JOptionPane;
import javax.swing.ProgressMonitor;

/**
 *
 * @author Aluno*/

public class RespostaServidor extends Thread {

    Mensagem response;
    private Socket cli;
    public  String path = "E:\\Projetos\\Downloads\\";
    private PrintStream out;
    private BufferedReader in;
    private ObjectInputStream ois;
    private static ArrayList<String> online;
    public RespostaServidor(Socket pCli, PrintStream pOut, BufferedReader pIn, ObjectInputStream ois) {
        this.cli = pCli;
        this.out = pOut;
        this.in = pIn;
        this.ois = ois;
    }
    public void run() {
        try {
            while ((response = (Mensagem)this.ois.readObject()) != null) {
                if(response.arquivo == null){
                    if(response.mensagem.startsWith("353535")){
                        TelaChat.online(response.mensagem.substring(5));
                    }else{
                        TelaChat.atualizar(response.mensagem);
                        System.out.println(response.mensagem);
                    }
                }else{
                    byte[] fl = response.arquivo;
                    FileOutputStream ww = new FileOutputStream(path+response.nomeArquivo);
                    ww.write(fl);
                    TelaChat.atualizar(response.remetente+": Enviou um Arquivo\n"
                            + " gravado em: "+ path+response.nomeArquivo);
                    
                }
            }
        } catch (IOException ex) {
            System.out.println("Erro");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RespostaServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
