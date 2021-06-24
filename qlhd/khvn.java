package qlhd;

public class khvn extends Person {
	private String doituong;
	private int dinhmuc;
	public khvn(String doituong, int dinhmuc) {
		this.dinhmuc=dinhmuc;
		this.doituong=doituong;
	}
	public khvn(int id, String name, int date, int kWH, int dongia, String doituong, int dinhmuc) {
		super(id, name, date, kWH, dongia);
		this.doituong = doituong;
		this.dinhmuc = dinhmuc;
	}
	public khvn() {
		
	}
	public String getDoituong() {
		return doituong;
	}
	public void setDoituong(String doituong) {
		this.doituong = doituong;
	}
	public int getDinhmuc() {
		return dinhmuc;
	}
	public void setDinhmuc(int dinhmuc) {
		this.dinhmuc = dinhmuc;
	}
	@Override
	public String toString() {
		return "khvn [doituong=" + doituong + ", dinhmuc=" + dinhmuc + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getDate()=" + getDate() + ", getKWH()=" + getKWH() + ", getDongia()=" + getDongia()
				+ "]";
	}
	
}
