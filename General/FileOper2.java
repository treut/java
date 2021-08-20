//example FileOutputStream || FileWriter

import java.io.*;

public class FileOper2{
	public static void main(String args[]){
		String text="dron don don don";
		//FileOutputStream fout=null; //not use
		FileWriter fout=null;

		try{
			//fout=new FileOutputStream("fout.txt"); //not use
			fout=new FileWriter("fout.txt");
			//fout.write(text); //var or args param
			fout.write(args[0]);
		}
		catch(Exception e){
			System.out.println("Error input-output");
		}
		finally{
			try{
				if(fout!=null) fout.close();
			}
			catch(Exception e){
				System.out.println("Error closed file");
			}
		}
	}
}