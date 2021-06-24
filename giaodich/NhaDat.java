package giaodich;

public class NhaDat {
	private int id;
	private int date;
	private int dongia;
	private String loai;
	private int area;
	public NhaDat(int id, int date, int dongia, String loai, int area) {
		super();
		this.id = id;
		this.date = date;
		this.dongia = dongia;
		this.loai = loai;
		this.area = area;
	}
	public NhaDat() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getDongia() {
		return dongia;
	}
	public void setDongia(int dongia) {
		this.dongia = dongia;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "NhaDat [id=" + id + ", date=" + date + ", dongia=" + dongia + ", loai=" + loai + ", area=" + area + "]";
	}
	
}
