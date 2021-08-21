//example FileOutputStream || FileWriter
	
	/*
	fout=new FileOutputStream("fout.txt"); //not use
	FileOutputStream fout=null; //not use
	fout.write(text); //var or args param
	*/

import java.io.*;
import java.util.Date;

public class FileOper2{
	public static void main(String args[]){
		String text="eXampleXampleXample";
		FileWriter fout=null;
		Date dato=new Date();

		try{
			fout=new FileWriter("fout.txt");
			fout.write(args.length<1 ? text+"\n"+dato.toString() : args[0]);
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