package challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {
    Node<T> front;
    Node<T> rear;

    public Queue(){
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T value){
        Node<T> newNode = new Node<>(value);
        if (this.isEmpty()){ // if queue is empty set the front node
            this.front = newNode;
        }else{ //else set the next rear node to the new node
            this.rear.next = newNode;
        }
        this.rear = newNode; // when the queue isn't empty set a new rear node
    }

    public T dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        T data = this.front.value;
        if(rear == front){ // if there's only one Node in the queue reset the rear node
            rear = null;
        }
        this.front = this.front.next;
        return data;
    }
    public T peek(){
        if(this.isEmpty()){
            throw new NoSuchElementException();
        }else{
            return this.front.value;
        }
    }

    public boolean isEmpty(){
        return this.front == null;
    }

    @Override
    public String toString() {
        return front.toString();
    }


    public void enquque(T dog) {
    }
}
