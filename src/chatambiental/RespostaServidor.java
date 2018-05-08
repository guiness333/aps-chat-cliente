/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatambiental;

import View.TelaChat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author Aluno*/

public class RespostaServidor extends Thread {

    String response;
    private Socket cli;
    private PrintStream out;
    private BufferedReader in;
    private ObjectInputStream ois;
    

    public RespostaServidor(Socket pCli, PrintStream pOut, BufferedReader pIn, ObjectInputStream ois) {
        this.cli = pCli;
        this.out = pOut;
        this.in = pIn;
        this.ois = ois;
    }

    public void run() {
        try {
            while ((response = this.in.readLine()) != null) {
                TelaChat.atualizar(response);
                System.out.println(response);
            }
        } catch (IOException ex) {
            System.out.println("Erro");
        }
    }
}
