package btvn;

public class stafftuyensinh extends Person{
	private int Number;

	stafftuyensinh( int number) {
		
		this.Number = number;
	}
	public stafftuyensinh() {	
	}
	public stafftuyensinh(String name, int age, String gender, int sdt, String email, int salary, int number) {
		super(name, age, gender, sdt, email, salary);
		this.Number = number;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return Number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		Number = number;
	}
	@Override
	public int DoanhThu() {
		// TODO Auto-generated method stub
		return this.getSalary()*8*(this.Number*10);
	}
	@Override
	public String toString() {
		return "stafftuyensinh [Number=" + Number + ", DoanhThu()=" + DoanhThu() + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getGender()=" + getGender() + ", getSdt()=" + getSdt() + ", getEmail()="
				+ getEmail() + ", getSalary()=" + getSalary() + "]";
	}
	
}
