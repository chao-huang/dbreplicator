package com.daffodilwoods.graph;

import java.util.*;

/**
    Instances of this class act as edges in the graph. Instances of this
    class always "hang" from a <CODE>JbListElement</CODE> instance. They
  have a <CODE>int weight</CODE> and a link to the vertex object to
  which they lead. Null target vertices are not supported.
 */

public class JbEdge {

  //-----------
  // Variables
  //-----------

  /**
   The weight of this edge.
   */
  private int weight;

  /**
          The vertex where the edge leads to.
   */
  public JbVertex targetVertex;

  //-------------
  // Constructor
  //-------------
  private ArrayList listOfAttributes;

  /**
          An edge object leading from one vertex to another.
     Edges are unique, there can only be one edge
     from vertex A to vertex B. The weight cannot be changed
     after the object is constructed.
     @param target The <CODE>JbVertex</CODE> instance where
     this edge leads to.
     @param weightValue The integer weight of this edge
   */
  public JbEdge(JbVertex target, int weightValue, ArrayList listOfAttributes) {
    this.weight = weightValue;
    targetVertex = target;
    this.listOfAttributes = listOfAttributes;
  }

  public JbEdge(JbVertex target, int weightValue) {
    this.weight = weightValue;
    targetVertex = target;
    listOfAttributes = new ArrayList();
  }

  //------------
  // Methods
  //------------

  /**
   Return the weight of the edge.
   */

  public int whatIsWeight() {
    return this.weight;
  }

  public void addAttribute(String[] attributes) {
    if(listOfAttributes ==null)
      listOfAttributes= new ArrayList();
    listOfAttributes.add(attributes);
  }

  public ArrayList getAttributesList() {
    return this.listOfAttributes;
  }
}

