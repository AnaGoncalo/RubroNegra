/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubronegra;

/**
 *
 * @author Ana Gonçalo
 */
public class RubroNegra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArvoreRN tree = new ArvoreRN();
        No raiz = new No(null, 7);
        tree.setRaiz(raiz);
        tree.incluir(5);
        tree.incluir(9);
        tree.incluir(8);
        tree.incluir(10);
        /*tree.incluir(70);
        tree.incluir(120);
        tree.incluir(60);
        tree.incluir(80);
        tree.incluir(110);
        tree.incluir(130);
        */
        System.out.println("removendo");
        tree.remover(9);
        
        tree.exibirArvore(tree.getRaiz());
    }
    
}
