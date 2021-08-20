//example FileReader

import java.io.*;

public class FileOper3{
	public static void main(String args[]){
		int ton;
		FileReader fin=null;

		try{
			fin=new FileReader("fout.txt");
			while(true){
				ton=fin.read();
				if(ton==-1) break;
				else System.out.print((char) ton);
			}
			System.out.println();
		}
		catch(Exception e){
			System.out.println("Error read file");
		}
		finally{
			try{
				if(fin!=null) fin.close();
			}
			catch(Exception e){
				System.out.println("Error closed file");
			}
		}
	}
}