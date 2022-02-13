package pack1;

import java.io.File;
import java.io.IOException;


public class Operations {
	
	public void sorting(String path) {
		
		File f1 = new File(path);
		System.out.println("Files in the Directory are : ");
		File[] fileName = f1.listFiles();
		
		for(File ff : fileName) {
			
			System.out.println(ff.getName());
		}
			
		
	}

	
	public void createFile(String path) {
		
		try {
		      File f1 = new File(path);
		      if (f1.createNewFile()) {
		        System.out.println("File created Successfully!!!!!  " );
		        System.out.println("File Name : " + f1.getName());
		      } else {
		        System.out.println("File already exists!!!!!");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	public void deleteFile(String path) {
		
		File f1 = new File(path); 
	    if (f1.delete()) { 
	      System.out.println("File Deleted Successfully !!!!! " + f1.getName());
	      System.out.println("File Name : " + f1.getName());
	    } else {
	      System.out.println("Failed to Delete the File!!!!!");
	    } 
		
		
	}
	
	public void searchFile(String path,String fileNameSearch) {
		
		File f1 = new File(path); 
		File[] fileName = f1.listFiles();
		int flag = 0;
		for(File ff : fileName) {
			
			if(ff.getName().equals(fileNameSearch)) {
				
				flag = 1;
				break;
			}
			
			else {
				
				flag = 0;	
			}
		}
		
		if(flag==1) {
			
			System.out.println("File Found Successfully!!!!!!");
			
		}
		else {
			
			System.out.println("File Not Found!!!!!");
		}
        
		
	}
}
