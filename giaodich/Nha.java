package giaodich;

public class Nha extends NhaDat {
	private String address;

	public Nha(int id, int date, int dongia, String loai, int area, String address) {
		super(id, date, dongia, loai, area);
		this.address = address;
	}

	public Nha() {
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public int total(int area, int dongia,String loai) {
		if(loai.equals("CC")) {
			return area*dongia;
		}else {
			return area*dongia*90/100;
		}
	}
	
	
}
