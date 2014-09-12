/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria2;

/**
 *
 * @author 20131024110332
 */
public class Livraria2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    private String idLivro;
    private String titulo;
    private String autores;
    private int ano;
    private double preco;
    private int quantidade;
    private String descricao;

    public Livro() {
    }

    public String getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(String idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    }
}
