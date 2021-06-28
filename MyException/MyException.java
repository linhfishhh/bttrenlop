package MyException;

public class MyException extends RuntimeException{

	public MyException() {
		super("Nhap so be hon 0");
	}
	public MyException(String s) {
		super(s);
	}
}
