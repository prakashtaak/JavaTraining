package com.java.test;

public class BSTTree {

    Node head;


    public static void main(String[] args) {



    }

    Node insert(Node node,int data){

        if(node==null){
        return new Node(null,null,data);

        }

        if(node.data >data ){
           node.left =  insert(node.right,data);
        }else{
            node.right = insert(node.left,data);

        }
        return node;


    }

    class Node{

        Node left;
        Node right;
        int data;

        public Node(Node left, Node right, int data) {
            this.left = left;
            this.right = right;
            this.data = data;
        }
    }
}


