package com.rohit.bfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visited;
    private List<Vertex> adjacentList;

    public Vertex(String name) {
        this.name = name;
        this.adjacentList=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbor() {
        return adjacentList;
    }

    public void addNeighbor(Vertex vertex) {
        this.adjacentList.add(vertex);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
