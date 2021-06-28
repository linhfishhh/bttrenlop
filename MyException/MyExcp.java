package MyException;

public class MyExcp {
	public void check(int a) throws MyException{
			if(a<0) {
			throw new MyException();
		}
			
	
	}
	public static void main(String[] args) {
		MyExcp e=new MyExcp();
		e.check(-1);
}
}
