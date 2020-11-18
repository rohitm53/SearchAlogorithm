package com.rohit.iddfs;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String name;
    private int depthLevel = 0;
    private List<Node> adjacentList;

    public Node(String name) {
        this.name = name;
        adjacentList=new ArrayList<>();
    }

    public void addNeighbor(Node node){
        this.adjacentList.add(node);
    }

    public int getDepthLevel() {
        return depthLevel;
    }

    public void setDepthLevel(int depthLevel) {
        this.depthLevel = depthLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getAdjacentList() {
        return adjacentList;
    }


    @Override
    public String toString() {
        return name;
    }
}
