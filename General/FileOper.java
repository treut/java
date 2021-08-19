//example use fileinputstream
import java.io.*;

public class FileOper{
	public static void main(String args[]){
		int read;
		FileInputStream fis;

		try{
			fis=new FileInputStream("test.txt");
		}
		catch(Exception e){
			System.out.println("File not found");
			return;
		}

		try{
			while(true){
				read=fis.read();
				if(read!=-1) System.out.print((char) read);
				else break;
			}
		}
		catch(IOException e){
			System.out.println("Error read file!");
		}
		finally{
			try{
				if(fis!=null) fis.close();
			}
			catch(IOException e){
				System.out.println("Error close file!");
			}
		}

		System.out.println("\n\n------End of file!------\n");
	}
}