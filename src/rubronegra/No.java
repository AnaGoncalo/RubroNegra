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
public class No {
    private int elemento;
    private No pai;
    private No filhoE;
    private No filhoD;
    private String cor;
    private Boolean duplo;

    public No() {
    }

    public No(No pai, int elemento) {
        this.pai = pai;
        this.elemento = elemento;
        this.cor = "Rubro";
        this.duplo = false;
    }
    
    public No getIrmao()
    {
        if(this.ehFilhoD())
            return pai.getFilhoE();
        else
            return pai.getFilhoD();
    }

    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }
    
    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public No getFilhoE() {
        return filhoE;
    }

    public void setFilhoE(No filhoE) {
        this.filhoE = filhoE;
    }

    public No getFilhoD() {
        return filhoD;
    }

    public void setFilhoD(No filhoD) {
        this.filhoD = filhoD;
    }
    
    //Retorna se o No é raiz (não tem pai)
    public boolean isRoot()
    {
        return this.pai == null;
    }
    
    public boolean hasFilhoE(){
        return this.filhoE != null;
    }
    
    public boolean hasFilhoD(){
        return this.filhoD != null;
    }
    
    //Retorna se o No é interno (tem filho)
    public boolean isInternal()
    {
        return this.filhoE != null || this.filhoD != null;
    }
    //Retorna se o No é externo (não tem filho)
    public boolean isExternal()
    {
        return this.filhoD == null && this.filhoE == null;
    }
    
    //Retorna se o No é filho esquerdo
    public boolean ehFilhoE()
    {
        return this.elemento <= this.pai.getElemento();
    }
    
    //Retorna se o No é filho direito
    public boolean ehFilhoD()
    {
        return this.elemento >= this.pai.getElemento();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getDuplo() {
        return duplo;
    }

    public void setDuplo(Boolean duplo) {
        this.duplo = duplo;
    }
    
}
