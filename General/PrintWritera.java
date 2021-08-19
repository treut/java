import java.io.*;

public class PrintWritera{
	public static void main(String args[]){
		PrintWriter pw=new PrintWriter(System.out, true);

		pw.println("This is string");
		int aa=-666;
		pw.println(aa);
	}
}