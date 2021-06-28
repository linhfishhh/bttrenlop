package btvn;

public abstract class Person {
	private String Name;
	private int Age;
	private String Gender;
	private int Sdt;
	private String Email;
	private int Salary;
	public Person(String name, int age, String gender, int sdt, String email, int salary) {
		super();
		Name = name;
		Age = age;
		Gender = gender;
		Sdt = sdt;
		Email = email;
		Salary = salary;
	}
	public Person() {
		super();
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return Age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		Age = age;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}
	/**
	 * @return the sdt
	 */
	public int getSdt() {
		return Sdt;
	}
	/**
	 * @param sdt the sdt to set
	 */
	public void setSdt(int sdt) {
		Sdt = sdt;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return Salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + ", Gender=" + Gender + ", Sdt=" + Sdt + ", Email=" + Email
				+ ", Salary=" + Salary + "]";
	}
	public abstract int DoanhThu();
}
