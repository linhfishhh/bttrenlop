package Doancuayen;
import java.util.*;
import java.io.*;
public class Manage {
	static Scanner sc=new Scanner(System.in);
	private ArrayList<Person> ListP;
	public Manage() throws FileNotFoundException, ClassNotFoundException, IOException {
		ListP=ReadFile();
	}
	public ArrayList<Person> ReadFile() throws FileNotFoundException, IOException, ClassNotFoundException{
		try {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\gitfile\\src\\Doancuayen\\file\\quanly.txt"));
		ArrayList<Person> List=(ArrayList<Person>) ois.readObject();
		ois.close();
		return List;
		}catch(Exception e) {
			WriteFile(new ArrayList<Person>());
			return ReadFile();
		}
	}
	//ghi vao file quanly.txt;
	public void WriteFile(ArrayList<Person> p) throws FileNotFoundException, IOException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\gitfile\\src\\Doancuayen\\file\\quanly.txt"));
		oos.writeObject(p);
		oos.close();
	}
	//khoi tao 1 doi tuong Person
	public Person createPerson() {
		System.out.print("Id: ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("name ");
		String name=sc.nextLine();
		System.out.print("Age ");
		int age=Integer.parseInt(sc.nextLine());
		System.out.print("address ");
		String address=sc.nextLine();
		System.out.print("add Student or Teacher ");
		System.out.print("1.add Student      ");
		System.out.print("2. add Teacher ");
		int choice=Integer.parseInt(sc.nextLine());
		if(choice==1) {
			System.out.print("Diemtb ");
			double diemtb=Double.parseDouble(sc.nextLine());
			return new Student(id,name,age,address,diemtb);
		}else {
			System.out.print("luong: ");
			int luong=Integer.parseInt(sc.nextLine());
			return new Teacher(id,name,age,address,luong);
			}
	}
	public void add() throws FileNotFoundException, IOException {
		Person P=createPerson();
		ListP.add(P);
		WriteFile(ListP);
	}
	public void Show() {
		for(int i=0;i<ListP.size();i++) {
			System.out.println(ListP.get(i));
		}
	}
	
}

