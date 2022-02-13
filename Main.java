package pack1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Program Started");
		Scanner sc1 = new Scanner(System.in);
		Operations obj = new Operations();
		char ch = 'y';
		do {
	    System.out.println();
		System.out.println("--------------------------------");
        System.out.println("*******Virtual Repositary*******");
        System.out.println("--------------------------------");
        System.out.println("1. Create a File");
        System.out.println("2. Search a File");
        System.out.println("3. Sort a File");
        System.out.println("4. Delete a File");
        System.out.println("5. Close");
		System.out.println("Enter your choice : ");
		int choice = sc1.nextInt();
		switch(choice) {
		
		case 1 : System.out.println("Enter the path : " );
		         String path = sc1.next(); 
		         obj.createFile(path);
		         break;
		         
		case 2 : System.out.println("Enter the path : " );
                 String path1 = sc1.next(); 
                 System.out.println("Enter the file which you want to search : ");
        	     String fileNameSearch = sc1.next();
        	     obj.searchFile(path1, fileNameSearch);
                 break;
        
		case 3 : System.out.println("Enter the path : " );
                 String path2 = sc1.next(); 
                 obj.sorting(path2);
                 break;

		case 4 : System.out.println("Enter the path : " );
		         String path3 = sc1.next(); 
		         obj.deleteFile(path3);
		         break;
		         

		case 5 : System.out.println("Do you want to continue(yes/no) ? ");
		         ch = sc1.next().charAt(0);
		         System.out.println("Thank You!!!!");
		         break;
		         
		default : System.out.println("Please Enter write choice!!!!!"); 
		
		}
		
	    
		}while(ch =='y');
	
		
		sc1.close();
		//System.out.println();
		System.out.println("Program Ended");
	}
}
