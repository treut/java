//example use Scanner

import java.util.Scanner;

public class ScannerTest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert text:");
		String gogo=sc.nextLine();
		System.out.println("You insert: "+gogo);
	}
}