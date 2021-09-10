package com;

public class DoubleNode {

    private int valor;
    private DoubleNode next;
    private DoubleNode previous;

    public DoubleNode (int valor){
        this.valor = valor;

    }

    public int getValor(){
        return this.valor;

    }

    public void setNext ( DoubleNode next){
        this.next = next;

    }

    public void setPrevious (DoubleNode previous){
        this.previous = previous;

    }

    public DoubleNode getNext(){

        return this.next;
    }

    public DoubleNode getPrevious(){

        return this.previous;
    }
}
