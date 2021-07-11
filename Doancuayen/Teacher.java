package Doancuayen;

public class Teacher extends Person{
	private int Luong;

	Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	Teacher(int id, String name, int age, String address,int luong) {
		super(id, name, age, address);
		// TODO Auto-generated constructor stub
		this.Luong=luong;
	}

	/**
	 * @return the luong
	 */
	public double getLuong() {
		return Luong;
	}

	/**
	 * @param luong the luong to set
	 */
	public void setLuong(int luong) {
		Luong = luong;
	}

	@Override
	public String toString() {
		return "Teacher [Luong=" + Luong + ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getAddress()=" + getAddress() + "]";
	}
	
}
