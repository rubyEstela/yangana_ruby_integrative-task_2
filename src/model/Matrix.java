package model;

public class Matrix {
	
	private Node first;
	private int numRows;
	private int numColumn;
	
	public Matrix(int m,int n) {
		numRows=m;
		numColumn=n;
		
		createMatrix();
		
		
	}
	private void createMatrix() {
		first=new Node(0,0);
		System.out.println(""
				+ "");
		createRow(0,0,first);
		
	}

	private void createRow(int i, int j, Node currentFirstRow) {
		
	//	System.out.println(""+i);
		createColumn(i,j+1,currentFirstRow,currentFirstRow.getUp());
		if(i+1<numRows) {
			Node downfirstRow= new Node(i+1,j);
			downfirstRow.setUp(currentFirstRow);
			currentFirstRow.setDown(downfirstRow);
			createRow(i+1,j,downfirstRow);
		}
		
	}

	private void createColumn(int i, int j, Node prev,Node rowPrev) {
		if(j<numColumn) {
		//	System.out.println(" en create"+j);
			Node current = new Node(i,j);
			current.setPrev(prev);
			prev.setNext(current);
			
			if(rowPrev!=null) {
				rowPrev=rowPrev.getNext();
				current.setUp(rowPrev);
				rowPrev.setDown(current);
				
			}
			createColumn(i,j+1,current,rowPrev);
		}
		
	}
    
	public String toString() {
		String msg;
		
		msg=toStringRow(first);
		return msg;
	}

	private String toStringRow(Node firstRow) {
	    String msg="";
	    if(firstRow!=null) {
	    	msg=toStringCol(firstRow);
	    	msg+="\n";
	    	msg+= toStringRow(firstRow.getDown());
	    }
	    
		return msg;
	}

	private String toStringCol(Node current) {
		 String msg="";
		    if(current!=null) {
		    	msg +=current.toString();
		    	msg+=toStringCol(current.getNext());
		    }
		    
			return msg;
		}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public int getNumRows() {
		return numRows;
	}

	public void setNumRows(int numRows) {
		this.numRows = numRows;
	}

	public int getNumColumn() {
		return numColumn;
	}

	public void setNumColumn(int numColumn) {
		this.numColumn = numColumn;
	}
	
	
}

	
	