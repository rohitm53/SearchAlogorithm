package com.rohit.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {


    public void traverse(Vertex root){

        Queue<Vertex> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);

        while (!queue.isEmpty()){

            Vertex actualVertext = queue.remove();
            System.out.println("Actual visited vertex : "+actualVertext);

            for(Vertex vertex : actualVertext.getNeighbor()){
                if(!vertex.isVisited()){
                    vertex.setVisited(true);
                    queue.add(vertex);
                }
            }
        }

    }

}
