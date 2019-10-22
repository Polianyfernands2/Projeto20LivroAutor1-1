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
public class Projeto20LivroAutor11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Livro objLivro = new Livro();
    objLivro.setTitulo("Harry Potter");
    objLivro.setEditora( "Rocco" );
    objLivro.setAno( 2001 );
    
    Autor objAutor = new Autor();
    objAutor.setNome("J.K.Rowling");
    objAutor.setAnoNasc( 1970 );
    objAutor.setEmail( "j.k.rowling@gmail.com" );
    objAutor.setObra(objLivro);
    objLivro.setEscritor(objAutor);
    System.out.println("Livro: "  +objLivro.getTitulo( ) 
             +objLivro.getEditora( ) 
             +objLivro.getAno( ));
    System.out.println("Autor: " +objAutor.getNome( )+ 
             objAutor.getAnoNasc( )+ 
             objAutor.getEmail( ));
    }
}
