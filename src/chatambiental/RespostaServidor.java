/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatambiental;

import View.TelaChat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author Aluno*/

public class RespostaServidor extends Thread {

    String response;
    private static Socket cli;
    private static PrintStream out;
    private static BufferedReader in;

    public RespostaServidor(Socket pCli, PrintStream pOut, BufferedReader pIn) {
        this.cli = pCli;
        this.out = pOut;
        this.in = pIn;
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
