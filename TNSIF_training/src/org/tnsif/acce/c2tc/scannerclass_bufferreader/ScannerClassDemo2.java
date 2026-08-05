package org.tnsif.acce.c2tc.scannerclass_bufferreader;
import java.util.Scanner;
public class ScannerClassDemo2 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		 String name =  scan.nextLine();
		 
		 System.out.println("Enter your age");
		    int age = scan.nextInt();
		    
		    System.out.println("Enter a Height");
			float height =scan.nextFloat();
			
			System.out.println("Are you a student");
			boolean is_Student=scan.nextBoolean();
			
			System.out.println("Enter your aadhar num");
			long aadhar=scan.nextLong();
			scan.nextLine();
			
			 
			
			System.out.println("Enter a Hobby");
			String hobby=scan.nextLine();
			
			System.out.println("Enter your daily reading time in minute");
			byte readingtime=scan.nextByte();
			
			System.out.println("Enter your cgpa");
			double cgpa=scan.nextDouble();
			
			System.out.println("Enter no of siblings");
			short noofsib=scan.nextShort();
			
			
			
			
			
			
			
			
			
		 

	}

}
