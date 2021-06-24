package qlhd;

public class Person {
	private int id;
	private String name;
	private int date;
	private int KWH;
	private int dongia;
	public Person(int id, String name, int date, int kWH, int dongia) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		KWH = kWH;
		this.dongia = dongia;
	}
	public Person() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getKWH() {
		return KWH;
	}
	public void setKWH(int kWH) {
		KWH = kWH;
	}
	public int getDongia() {
		return dongia;
	}
	public void setDongia(int dongia) {
		this.dongia = dongia;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", date=" + date + ", KWH=" + KWH + ", dongia=" + dongia + "]";
	}

	
}
