package com.rohit.iddfs;

public class IddfsApp {

    public static void main(String[] args) {

        Node vertex0 = new Node("A");
        Node vertex1 = new Node("B");
        Node vertex2 = new Node("C");
        Node vertex3 = new Node("D");
        Node vertex4 = new Node("E");


        vertex0.addNeighbor(vertex1);
        vertex0.addNeighbor(vertex2);
        vertex1.addNeighbor(vertex3);
        vertex3.addNeighbor(vertex4);

        Algorithm algorithm = new Algorithm(vertex1);
        algorithm.runDeepeningSearch(vertex0);


    }


}
