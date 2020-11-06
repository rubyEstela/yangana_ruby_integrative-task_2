package model;

public class Node {
    private int score;
	private int row;
	private int column;
	private Node next;
	private Node prev;
	private Node up;
	private Node down;
	private Node izq;
	private Node der;

	private Player p;
	
	public Node(int score ,int row, int column,Player p) {
        this.score=score;
		this.row = row;
		this.column = column;
		this.p=p;
		izq=null;
		der=null;
		
	}
	public Node getIzq() {
		return izq;
	}

	public void setIzq(Node izq) {
		this.izq = izq;
	}

	public Node getDer() {
		return der;
	}

	public void setDer(Node der) {
		this.der = der;
	}

	public int getRow() {
		return row;
	}
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public char getNameolumn() {
		return (char) ('A' + column);
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getUp() {
		return up;
	}

	public void setUp(Node up) {
		this.up = up;
	}

	public Node getDown() {
		return down;
	}

	public void setDown(Node down) {
		this.down = down;
	}
	

	

	public String toString() {
		return "[(" + row + "," + column + ")]";
	}

}
