/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto20livroautor1.pkg1;

/**
 *
 * @author aluno
 */
public class Livro {
    protected String titulo;
    protected String editora;
    protected int ano;
    protected Autor escritor;
    
    public Livro (){
        
    }

    public Livro(String titulo, String editora, int ano, Autor escritor) {
        this.titulo = titulo;
        this.editora = editora;
        this.ano = ano;
        this.escritor = escritor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }
    
    
}
