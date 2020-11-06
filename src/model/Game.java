package model;

public class Game {

	private Node first;
	private int numRows;
	private int numColumn;
	private int k;
	private Player player;
	private Player root;
	private Node raiz;

	public Game(int m, int n, int k) {
		numRows = m;
		numColumn = n;
		this.k = k;
		player = new Player(null, k, k, k);

		root = null;
		raiz=null;

		createMatrix();

	}

	private void createMatrix() {
		first = new Node(0,0, 0, player);
		System.out.println("" + "");
		createRow(0, 0, first);

	}

	private void createRow(int i, int j, Node currentFirstRow) {

		// System.out.println(""+i);
		createColumn(i, j + 1, currentFirstRow, currentFirstRow.getUp());
		if (i + 1 < numRows) {
			Node downfirstRow = new Node(i + 1, j, j, player);
			downfirstRow.setUp(currentFirstRow);
			currentFirstRow.setDown(downfirstRow);
			createRow(i + 1, j, downfirstRow);
		}

	}

	private void createColumn(int i, int j, Node prev, Node rowPrev) {
		if (j < numColumn) {
			// System.out.println(" en create"+j);
			Node current = new Node(i, j, j, player);
			current.setPrev(prev);
			prev.setNext(current);

			if (rowPrev != null) {
				rowPrev = rowPrev.getNext();
				current.setUp(rowPrev);
				rowPrev.setDown(current);

			}
			createColumn(i, j + 1, current, rowPrev);
		}

	}

	public String toString() {
		String msg;

		msg = toStringRow(first);
		return msg;
	}

	private String toStringRow(Node firstRow) {
		String msg = "";
		if (firstRow != null) {
			msg = toStringCol(firstRow);
			msg += "\n";
			msg += toStringRow(firstRow.getDown());
		}

		return msg;
	}

	private String toStringCol(Node current) {
		String msg = "";
		if (current != null) {
			msg += current.toString();
			msg += toStringCol(current.getNext());
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

	public Player getRoot() {
		return root;
	}

	public void setRoot(Player root) {
		this.root = root;
	}

	public void setNumColumn(int numColumn) {
		this.numColumn = numColumn;
	}

	/*
	 * metodo que permite agregar puntajes en un arbol binario
	 */

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	
	
	/*
	 * metodo que permite agregar puntajes en un arbol binario
	 */

	public void addPlayer(String nickname, int n, int m, int k,int score) {

		Player newPlayer = new Player(nickname, n, m,k);

		if (root == null) {
			root = newPlayer;
		} else {
			addPlayer(root, newPlayer);
		}

	}

	private void addPlayer(Player root2, Player newPlayer) {
		// TODO Auto-generated method stub
		
	}

	

}

