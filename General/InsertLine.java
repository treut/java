import java.io.*;

public class InsertLine{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String str;
		//System.out.println("Введи текст");
		//System.out.println("Введи стоп для остановки");

		do{
				str=br.readLine();
				System.out.println(str);
		}
		while(!str.equals("стоп"));
	}
}