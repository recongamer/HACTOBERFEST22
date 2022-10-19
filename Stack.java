package com.array;
class stack {
    int[] arr;
    int topofStack;

    stack(int size) {
        this.arr = new int[size];
        this.topofStack = -1;
        System.out.println("the stack is created with size of: " + size);
    }

    public boolean isEmpty() {
        if (topofStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (topofStack == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("the stack is full!");

        } else {
            arr[topofStack + 1] = value;
            topofStack++;
            System.out.println("successfully inserted");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        } else {
            int topstack = arr[topofStack];
            topofStack--;
            return topstack;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        } else {
            return arr[topofStack];

        }
    }

    public void delete() {
        arr = null;
        topofStack=-1;
        System.out.println("successfully deleted");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        }else{
            for (int i = topofStack; i >=0 ; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}

    public class Main {
        public static void main(String[] args) {
            stack nl = new stack(4);
            System.out.println(nl.isEmpty());
            nl.push(1);
            nl.push(2);
            nl.push(3);
            nl.push(4);
            nl.push(5);
            nl.display();
            System.out.println(" ");
            System.out.println(nl.pop());
            System.out.println(nl.pop());

            System.out.println(nl.peek());
            System.out.println("  ");
             nl.display();
            nl.delete();
            System.out.println(nl.arr);
            System.out.println(nl.topofStack);
            nl.display();
        }
    }

