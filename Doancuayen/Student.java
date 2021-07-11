package Doancuayen;

public class Student extends Person {
	private double diemtd;

	Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	Student(int id, String name, int age, String address,double diemtd) {
		super(id, name, age, address);
		this.diemtd=diemtd;
	}

	@Override
	public String toString() {
		return "Student [diemtd=" + diemtd + ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getAddress()=" + getAddress() + "]";
	}
	
	
}
