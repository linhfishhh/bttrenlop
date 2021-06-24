package qlhd;

public class khqt extends Person {
	private String quoctich;
	public khqt() {}
	public khqt(String quoctich) {
		this.quoctich = quoctich;
	}
	public khqt(int id, String name, int date, int kWH, int dongia, String qt) {
		super(id, name, date, kWH, dongia);
		this.quoctich = qt;
	}
	public String getQuoctich() {
		return quoctich;
	}
	public void setQuoctich(String quoctich) {
		this.quoctich = quoctich;
	}
	@Override
	public String toString() {
		return "khqt [quoctich=" + quoctich + ", getId()=" + getId() + ", getName()=" + getName() + ", getDate()="
				+ getDate() + ", getKWH()=" + getKWH() + ", getDongia()=" + getDongia() + "]";
	}
	
}
