package javaIOfile;
import java.io.*;
public class ReadFile {

	public void ReadFileText(String FilePath) {
		try {
			File file=new File(FilePath);
			if(!file.exists()) {
				file.createNewFile();
				throw new IOException();
			}
			BufferedReader br=new BufferedReader(new FileReader(file));
			String line="";
			int sum=0;
			while((line=br.readLine())!=null){
				System.out.println(line);
				sum+=Integer.parseInt(line);
			}
			br.close();
			System.out.println("tong= "+sum);
		}catch(IOException e){
			System.out.println("creating "+FilePath);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadFile f=new ReadFile();
		f.ReadFileText("C:\\Users\\Admin\\eclipse-workspace\\gitfile\\src\\javaIOfile\\test.txt");
	}

}
