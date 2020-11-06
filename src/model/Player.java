package model;

public class Player {
	
	private String nickName;
	private int n;
	private int m;
	private int k;
	
	
	
	public Player(String nickName, int n, int m, int k) {
		
		this.nickName = nickName;
		this.n = n;
		this.m = m;
		this.k = k;
		
		
		
	}
	

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	
	

}
