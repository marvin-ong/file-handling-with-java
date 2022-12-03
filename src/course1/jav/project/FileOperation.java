package course1.jav.project;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class FileOperation {
	public static void retrieveFiles(File fileDir) {
		if(fileDir.isDirectory()){
			List<String> listFile = Arrays.asList(fileDir.list());
			System.out.println("\nRetrieved the following file names (in ascending order):");
			Collections.sort(listFile);
			int i = 1;
			for(String s:listFile){
				System.out.println(String.format("File %s: ",i) + s);
				i++;
			}
			System.out.println("---------------------------------------");
		}
		else{
			System.out.println(fileDir.getAbsolutePath() + " is not a directory");
		}
	}
	
	
	public static void fileOperations() {
		Scanner input = new Scanner(System.in);

        /* Perform Queue Operations */        
		System.out.println("\nBusiness-level operations:\n");

		Path currentPath = Paths.get(System.getProperty("user.dir"));
		System.out.println("Current Directory of the application: " + currentPath.toString());
		
        char ch;
        do{
            System.out.println("Please select a task:");
            System.out.println("1. add a file");
            System.out.println("2. delete a file");
            System.out.println("3. search a file");

            int choice = -1;

	        while(input.hasNext()) {
	        	if (input.hasNextInt()) {
	        		choice = input.nextInt();
	        		break;
	        	} 
	        	System.out.println("Wrong entry, please enter an integer from 1 to 3:");
	        	input.next();	
	        }

            switch (choice)
            {
            case 1 : 
                System.out.println("\nEnter a file name to add the new file (case sensitivity):");
                try
                {
                	input.nextLine();
                	Path filePath = Paths.get(currentPath.toString(), input.nextLine());
                	File file = new File(filePath.toString());
                	System.out.println("Added File: "+ file.createNewFile());
                }
                catch(IOException e)
                {
                	e.printStackTrace();
                }                         
                break;                         
            case 2 : 
            	System.out.println("\nEnter the name of the file to be deleted (case sensitivity):");
                try
                {
                	input.nextLine();
                	Path filePath = Paths.get(currentPath.toString(), input.nextLine());
                	File file = new File(filePath.toString());
                	boolean deleteStatus = file.delete();
                	if (deleteStatus) {
                		System.out.println("File has been deleted.");
                	}
                	else {
                		System.out.println("File not found.");
                	}
                }
                catch(Exception e)
                {
                    System.out.println("Error : " +e.getMessage());
                }
                break;                         
            case 3 : 
            	System.out.println("\nEnter a file name to search (case sensitivity):");
                try
                {
                	input.nextLine();
                	String fileName = input.nextLine();
                	Path filePath = Paths.get(currentPath.toString(), fileName);
                	File file = new File(filePath.toString());
                	if(file.exists()) {
                		System.out.println("File exists.");	
                		System.out.println("File path:            " + file.getAbsolutePath());
	                    System.out.println("File name:            " + file.getName());
	                    System.out.println("File class:           " + file.getClass());
	                    System.out.println("File parent:          " + file.getParent());
	                    System.out.println("File space allocated: " + file.getUsableSpace());
	                    System.out.println("File length:          " + file.length());
                	}
                	else
	                {
	                	System.out.println("File doesn't exists.");
	                }
                }
                catch(Exception e)
                {
                    System.out.println("Error : "+e.getMessage());
                }
                break;
                       
            default : System.out.println("Wrong entry, please enter an integer from 1 to 3:");
                break;
            }
            if (choice<1 || choice>3) {
            	ch = 'n';
            } else {
            	System.out.println("\nDo you want to close the current execution context and return to the main context (Type y or n) \n");
                ch = Character.toLowerCase(input.next().charAt(0));
            }
        } while (ch == 'n');
	}
	
	public static void main(String[] args) {
		System.out.println("Hi, welcome to our plaform, I am glad to serve you here:");
		System.out.println("Application name: Marvellous Biz-file Operator");
		System.out.println("Developer's particulars: Marvin Ong Min Hau, PG-FSD-Batch-Oct2022");
		
		do {
	        System.out.println("\nPlease select an operation:");
	        System.out.println("1. Retrieve file names in an ascending order");
	        System.out.println("2. Perform business-level operations");
	        System.out.println("3. Close the application");
	        int choice = -1;
	        Scanner input = new Scanner(System.in);
	        while(input.hasNext()) {
	        	if (input.hasNextInt()) {
	        		choice = input.nextInt();
	        		break;
	        	} 
	        	System.out.println("Wrong entry, please enter an integer from 1 to 3:");
	        	input.next();
	        	
	        }

	        switch (choice) {
	        case 1:
	        	File fileDir = new File("/Users/admin/Desktop/Simplilearn/PGP Full-Stack Web Development/Project");
	    		retrieveFiles(fileDir);
	    		break;
	    		
	        case 2:
	        	fileOperations();
	        	break;
	        
	        case 3:
	        	System.out.println("\nThe application has been closed.");
	        	System.exit(0);

	        default: System.out.println("Wrong entry, please enter an integer from 1 to 3:");
	        break;
	        }
		}while (true);	
	}
}


