package com;

public class Main {

    public static void main(String[] args){

        Queue queue = new Queue();

        queue.enqueue(150); //añadiendo un elemento inicial

        System.out.println("Elementos en cola:"); //imprimiendo este elemento
        queue.displayQueue();

        System.out.println("Agregando elementos a la cola"); //añadiendo los elementos solicitados
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(3);
        queue.enqueue(12);
        queue.enqueue(0);
        queue.enqueue(89);
        queue.enqueue(77);

        System.out.println("Elementos en cola:");
        queue.displayQueue();

        System.out.println("Desencolando elementos");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("Elementos en cola:")   ;
        queue.displayQueue();

    }
}
