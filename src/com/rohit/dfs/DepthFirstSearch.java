package com.rohit.dfs;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    private Stack<Vertex> stack;

    public DepthFirstSearch() {
        this.stack = new Stack<>();
    }

    public void dfs(List<Vertex> vertixList){

        for(Vertex v : vertixList){
            if(!v.isVisited()){
                v.setVisited(true);
//                dfsWithStack(v);
                dfsRecursive(v);
            }
        }

    }

    private void dfsWithStack(Vertex root) {

        this.stack.add(root);
        root.setVisited(true);

        while (!stack.isEmpty()){
            Vertex actualVertex = stack.pop();
            System.out.println(actualVertex+" ");

            for(Vertex v : actualVertex.getNeighborList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    stack.push(v);
                }
            }
        }

    }

    private void dfsRecursive(Vertex vertex){

        System.out.println(vertex+" ");

        for(Vertex neighbor : vertex.getNeighborList()){
            if(!neighbor.isVisited()){
                neighbor.setVisited(true);
                dfsRecursive(neighbor);
            }
        }
    }
}
