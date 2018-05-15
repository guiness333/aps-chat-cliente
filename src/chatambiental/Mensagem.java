/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatambiental;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author Aluno
 */
public class Mensagem implements Serializable{
    static long serialVersionUID = 10100;
    private String extensao = "";
    public byte[] arquivo = null;
    public String mensagem = "";
    private String caminho = "";
    public String nomeArquivo;

    public Mensagem(String pMensagem) {
        this.mensagem = pMensagem;
    }

    public Mensagem(byte[] pArquivo, String pNome, String pExtensao) {
        this.nomeArquivo = pNome;
        this.arquivo = pArquivo;
        setCaminho(extensao);
    }

    private void setCaminho(String extensao) {
        if(extensao.equals(".mp3")) {
            this.caminho = "//arquivos//mp3";
        } else if(extensao.equals(".mp4")) {
            this.caminho = "//arquivos//mp4";
        }
    }

}
