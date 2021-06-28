package btvn;

public class StaffDaotao extends Person{
	private int loaiNV;
	private int H;

	public StaffDaotao(String name, int age, String gender, int sdt, String email, int salary, int loaiNV) {
		super(name, age, gender, sdt, email, salary);
		this.loaiNV = loaiNV;
	}
	

	StaffDaotao(String name, int age, String gender, int sdt, String email, int salary, int loaiNV, int h) {
		super(name, age, gender, sdt, email, salary);
		this.loaiNV = loaiNV;
		H = h;
	}


	public StaffDaotao() {
	}

	/**
	 * @return the loaiNV
	 */
	public int getLoaiNV() {
		return loaiNV;
	}

	/**
	 * @param loaiNV the loaiNV to set
	 */
	public void setLoaiNV(int loaiNV) {
		this.loaiNV = loaiNV;
	}

	@Override
	public int DoanhThu() {
	// TODO Auto-generated method stub
		if(this.loaiNV==1) {
			return this.getSalary()*8;
		}else return this.getSalary()*this.H;
		
	}

	@Override
	public String toString() {
		return "StaffDaotao [loaiNV=" + loaiNV + ", H=" + H + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getGender()=" + getGender() + ", getSdt()=" + getSdt() + ", getEmail()=" + getEmail()
				+ ", getSalary()=" + getSalary() +"Luong= "+DoanhThu()+ "]";
	}
	
	
}
