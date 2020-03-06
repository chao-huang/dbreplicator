package com.daffodilwoods.graph;

    /**
        Instances of this class act as elements of a linked list. It is used for keeping
        <CODE>JbVertex</CODE>-instances and <CODE>JbEdge</CODE>-instances in order.
	<UL><LI>The collision management strategy of the hash table,</LI>
	<LI>the general vertex list of the graph,</LI>
	<LI>and the edges of a single vertex</LI>
	</UL>are all kept in a linked list of of <CODE>JbListElement</CODE> instances.
    */

    public class JbListElement{

        //-----------
        // Variables
        //-----------

        /**
		A link to the next element in the linked list.
        */
        public JbListElement next;

        /**
		A link to the actual object represented by this "hanger" instance.
		Usually an instance of <CODE>JbVertex</CODE> or <CODE>JbEdge</CODE>.
        */
        public Object hangingVertexOrEdge;

        //--------------
        // Constructor
        //--------------

	/**
		The null constructor gets called when we
		initialize the hash table. We attach null-
		containing-list elements to each hash index, for
		ease of coding. (If you want to understand why
		this is important, try to visualize the return
		value of the method <CODE>findVertex</CODE>
		without guarantee that each index in the hash
		table will have at least one
		<CODE>JbListElement</CODE>...)
	*/

	public JbListElement(){
	  next=null;
	  hangingVertexOrEdge=null;
	}

	/**
		The list element is a general linked list
		element. It contains a link to the next element,
		and a hanger for the vertex or the edge that
		it represents.
		@param objToHang The object that we wish to "hang"
		in this list element, usually an instance of
		<CODE>JbVertex</CODE> or <CODE>JbEdge</CODE>
	*/

        public JbListElement(Object objToHang){
	  next=null;
	  hangingVertexOrEdge=objToHang;
        }

	//------------
	// Methods
	//------------
        public String toString(){
          String str=hangingVertexOrEdge.toString();
          String s=str;
          JbListElement le= this;
          while(s!=null){
            le= le.next;
            if(le!=null)
            str+=le.hangingVertexOrEdge;
          else
              s=null;
          }
          return str;
        }
    }

