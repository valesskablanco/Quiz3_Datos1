package com;

public class DoubleLinkedList{

    private DoubleNode start;
    private DoubleNode end;
    private int size = 0;

    public DoubleLinkedList(){
        this.start = null;
        this.end = null;
    }

    public int getSize(){
        return this.size;

    }

    public boolean isEmpty(){
        if (this.start == null && this.end == null){
            return true;
        } else{
            return false;
        }
    }

    public void insertLast(int num){
        DoubleNode doubleNode = new DoubleNode(num);
        this.end.next = doubleNode;
        doubleNode.previous = this.end;
        doubleNode.next = null;
        this.end = doubleNode;
        this.size++;
    }

    public DoubleNode deleteFirst(){
        if (this.start != null){
            DoubleNode del = this.start;
            this.start = this.start.next;
            this.start.previous = null;
            this.size--;
            return del;
        } else{
            return null;
        }
    }

    public void returnList(){
        DoubleNode current = this.start;
        while (current != null){
            System.out.println(current.getValor());
            current = current.next;
        }
    }

    public DoubleNode getStart(){
        if (this.start == null && this.end == null){
            return null;
        } else {
            return this.start;
        }
    }

}
