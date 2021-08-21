import java.io.*;

public class FileOper4{
	public static void main(String args[]){
		try(FileReader fre=new FileReader("fout.txt")){
			int re;
			while(true){
				re=fre.read();
				if(re==-1) break;
				System.out.print((char)re);
			}
			System.out.println();
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}