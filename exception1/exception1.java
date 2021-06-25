package exception1;

public class exception1 {
	public void calc(int x,int y) {
		try {
			int a=x+y;
			int b=x/y;
			System.out.println("x+y"+a);
			System.out.println("x/y"+b);
		}catch(Exception e) {
			System.out.print("ngoai le"+e.getMessage());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exception1 e=new exception1();
		e.calc(5, 0);
	}

}
