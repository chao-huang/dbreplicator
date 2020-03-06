package com.daffodilwoods.graph;

    /**
        Instances of this class act as wrappers for the real vertex object, which
        can be for example java.lang.Integer, or any object. Instances of this
        class always "hang" from a <CODE>JbListElement</CODE> instance.
    */

    public class JbVertex {

        //-----------
        // Variables
        //-----------
	/**
		The number of edges this vertex has coming in
		from another vertex.
	*/
        private int inEdges;

        /**
                The number of edges this vertex has going out
                to another vertex.
        */
        private int outEdges;

        /**
                A link to the beginning of a linked list structure of
		the edges that leave this vertex.
        */
        public JbListElement firstEdge;

        /**
                A link to the actual abject, which can be any java.lang.Object,
		which this vertex instance "wraps".
        */
        public Object vertexObject;

        /**
                A marker variable used for cycle detection, topological sorting
		and similar.
        */
	public int marker;

        //-------------
        // Constructor
        //-------------

        /**
                A wrapper class for the actual java.lang.Object to be
		situated in the graph.
		@param objToEmbed The java.lang.Object that we wish to have wrapped.
        */
        public JbVertex(Object objToEmbed){

	  // Initialize all vars..
          inEdges=0;
	  outEdges=0;
	  marker=0;
	  firstEdge=null;
	  vertexObject=objToEmbed;
	}

        public String toString() {
          return vertexObject.toString();
        }
        //------------
        // Methods
        //------------

        /**
		Returns the number of edges coming into this vertex.
		@return The in-degree of this vertex.
        */
	public int whatIsInDegree(){
		return this.inEdges;
	}

        /**
		Returns the number of edges leaving this vertex.
		@return The out-degree of this vertex.
        */
        public int whatIsOutDegree(){
                return this.outEdges;
        }

        /**
		Accessor method to increment in-degree by one.
        */
	public void addInDegree(){
		this.inEdges++;
	}

        /**
		Accessor method to increment out-degree by one.
        */
	public void addOutDegree(){
		this.outEdges++;
	}
    }
