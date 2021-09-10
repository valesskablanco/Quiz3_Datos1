package com;

public class Queue {

    private DoubleLinkedList queue;

    public Queue(){
        this.queue = new DoubleLinkedList();

    }

    public void enqueue(int num){
        if (this.queue.isEmpty()){
            this.queue.insertFirst(num);

        } else{
            this.queue.insertLast(num);
        }
    }

    public DoubleNode dequeue(){
        return this.queue.deleteFirst();

    }

    public void displayQueue(){
        this.queue.returnList();

    }

    public void peek(){
        System.out.println(this.queue.getStart());

    }
}
