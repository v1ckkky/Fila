package com.eng;

public class Fila {
    private static Fila instancia; 

    private Fila(){

    }

    public static Fila getInstancia(){
        if(instancia ==null){
        instancia = new Fila();
        }
        return instancia; 
    }

    public void imprimeDocumentos(){
        System.out.println("Imprimindo documento");
    }

    public void removeDocumentos(){
        System.out.println("Removendo documento");
    }

    public void removeTodosDocumentos(){
        System.out.println("Removendo todos os documentos");
    }
}
