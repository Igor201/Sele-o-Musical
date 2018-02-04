/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades;


/**
 *
 * @author Igor
 */
public class Musica {
    
    private int id;
    private String nome;
    private String autor;
    private String tom;
    private String conteudo;

    public Musica(){
        
    }
    
    public Musica(String nome, String autor, String tom, String conteudo) {
        this.nome = nome;
        this.autor = autor;
        this.tom = tom;
        this.conteudo = conteudo;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTom() {
        return tom;
    }

    public void setTom(String tom) {
        this.tom = tom;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    
}
