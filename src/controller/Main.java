package controller;

import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import businesslogic.Validation;
import model.Doctor;
import model.User;



class first{
	Scanner scan = new Scanner(System.in);
	String dadm;
	String name;
	String address;
	long contact;
	int age;
	String bg;
	String sex;
	String disease;
	long id;
	String fileName;
	String symptom;
    String diagnosis;
    String medicine;
    String addmission;
    String ward;
    String doctor;
	int choice;
	int choice_1;
	void pressAnyKeyToContinue() {
		 System.out.println("Press Enter key to continue...");
	        try
	        {
	            System.in.read();
	        }  
	        catch(Exception e)
	        {
	        System.out.println("Press 'Enter' key to continue!");
	        }  
	}
	void getCurrentTimeUsingDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		    dadm=dtf.format(now); 
	}
	void admin() {
		
		
		do {
			System.out.println("Choose from the followring:");
            
			System.out.println(" 1  >> Add New Patient Record");
			System.out.println("2   >> Appoint Doctor");
			
			System.out.println(" 3  >> History of the Patient ");
			System.out.println(" 3  >> Bill of the patient ");
			
			System.out.print(" 4 >> Exit");
			 choice = scan.nextInt() ;
		switch(choice) {
		case 1:
			System.out.print("Enter the patient's file name: ");

			 fileName =scan.next();
			getCurrentTimeUsingDate();  

			        try {
			            // Assume default encoding.
			            FileWriter fileWriter = new FileWriter(fileName+".txt");

			            // Always wrap FileWriter in BufferedWriter.
			            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				    
			            // Note that write() does not automatically
			            // append a newline character.
			            System.out.print("\n********************************************************************\n");
			            bufferedWriter.write("Date of admission: "+dadm);
			            bufferedWriter.newLine();
			            System.out.print("\nName : ");name=scan.next();bufferedWriter.write("Name : "+name);
			            bufferedWriter.newLine();
			            System.out.print("\nAddress : ");address=scan.next();bufferedWriter.write("Address : "+address);
			            bufferedWriter.newLine();
			            System.out.print("\nContact Number : ");contact=scan.nextLong();bufferedWriter.write("Contact Number : "+contact);
			            bufferedWriter.newLine();
			            System.out.print("\nAge : ");age=scan.nextInt();bufferedWriter.write("Age : "+age);
			            bufferedWriter.newLine();
			            System.out.print("\nSex : ");sex=scan.next();bufferedWriter.write("Sex : "+sex);
			            bufferedWriter.newLine();
			            System.out.print("\nBlood Group : ");bg=scan.next();bufferedWriter.write("Blood Group : "+bg);
			            bufferedWriter.newLine();
			            System.out.print("\nAny Major disease suffered earlier : ");disease=scan.next();bufferedWriter.write("Any Major disease suffered earlier : "+disease);
			            bufferedWriter.newLine();
			            System.out.print("\nPatient ID : ");id=scan.nextLong();bufferedWriter.write("Patient ID : "+id);
			            bufferedWriter.newLine();
			            System.out.print("\n********************************************************************\n");
			            bufferedWriter.write("\n********************************************************************\n\n");
			            bufferedWriter.newLine();System.out.print("\nInformation Saved Successfully\n");

			            // Always close files.
			            bufferedWriter.close();
			        }
			        catch(IOException ex) 
				{
			            System.out.println("Error writing to file '"+ fileName +"'");
			        }
			    pressAnyKeyToContinue();
			    
			    break;
		case 2:
			
		    getCurrentTimeUsingDate();
		    System.out.print("\n\nEnter the patient's file name to be opened : ");
		    fileName=scan.next();
		             // This will reference one line at a time
		    String line = null;
		    try {
		        // FileReader reads text files in the default encoding.
		            FileReader fileReader = new FileReader(fileName+".txt");

		            // Always wrap FileReader in BufferedReader.
		            BufferedReader bufferedReader = new BufferedReader(fileReader);
		            System.out.println("\n\n\n\n\t\t\t\t........................................ Information about '"+fileName+"' ........................................\n\n\n\n");
		            while((line = bufferedReader.readLine()) != null) 
		            {
		                System.out.println(line);
		            }   

		            // Always close files.
		            bufferedReader.close();         
		        //Appending data in file
		            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName+".txt", true)));
		            System.out.print("Adding more information in patient's file................on : "+dadm);
		            out.println("Description of the day:"+dadm);
		            System.out.print("\nDoctor appointed:");doctor=scan.next();out.println("Doctor appointed: "+doctor);
		            System.out.print("\nSymptoms : ");symptom=scan.next();out.println("Symptoms : "+symptom);
		            System.out.print("\nDiagnosis : "); diagnosis=scan.next();out.println("Diagnosis : "+diagnosis);
		            System.out.print("\nMedicines : ");medicine=scan.next(); out.println("Medicines : "+medicine);
		            System.out.print("\nAddmission Required? : "); 
		            addmission=scan.next();out.println("Addmission Required? : "+addmission); 
		            if(addmission.equals("Yes")||addmission.equals("Y"))
		            {
		              System.out.print("\nType of ward : ");ward=scan.nextLine(); out.println("Type of ward : "+ward);
		              out.println("\n*************************************************************************\n");
		            System.out.print(ward+" ward is alloted Successfully\n");
		            }
		            else
		            {out.println("*************************************************************************\n");}
		    out.close();
		   pressAnyKeyToContinue(); 
		        } 
		        catch(FileNotFoundException ex) {
		            System.out.println(
		                "Unable to open file '" + fileName + "'");                
		        }
		        catch (IOException e) {
		                System.out.println("Error writing or Reading to file '"+ fileName +"'");
		           }
		    break;
		case 3:
			     System.out.print("\n\nEnter the patient's file name to be opened : ");
			     fileName=scan.next();
			             // This will reference one line at a time
			    line = null;
			    try {
			        // FileReader reads text files in the default encoding.
			            FileReader fileReader = new FileReader(fileName+".txt");

			            // Always wrap FileReader in BufferedReader.
			            BufferedReader bufferedReader = new BufferedReader(fileReader);
			            System.out.print("\n\n\n\n\t\t\t\t........................................ Full Medical History of '"+fileName+"' ........................................\n\n\n\n");
			            while((line = bufferedReader.readLine()) != null) 
			            {
			                System.out.println(line);
			            }   
				   pressAnyKeyToContinue();
			            // Always close files.
			            bufferedReader.close();         
			        }
			        catch(FileNotFoundException ex) {
			            System.out.println(
			                "Unable to open file '" + fileName + "'");                
			        }
			        catch(IOException ex) {
			            System.out.println(
			                "Error reading file '" + fileName + "'");               
			        }
			    break;
		case 4:
			getCurrentTimeUsingDate();
			 int days;
			 double wcharge;
			 double doc;
			 double ser;
			System.out.println("\t\t\t\t\t\t _________________________________________________________________ ");
			 System.out.print("\n\n\t\t\t\t\t\t\t\t  E-HEALTH CARE MANAGEMENT SYSTEM \n\n");
			System.out.println("\t\t\t\t\t\t _________________________________________________________________ ");
			 System.out.print("Enter the patient's file name to get the Bill: ");
			  fileName=scan.next();
			             // This will reference one line at a time
			  line = null;
			    try {
			        // FileReader reads text files in the default encoding.
			            FileReader fileReader = new FileReader(fileName+".txt");
			            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName+".txt", true)));

			            // Always wrap FileReader in BufferedReader.
			            BufferedReader bufferedReader = new BufferedReader(fileReader);
			            System.out.print("Date: "+dadm);
			            System.out.println("\n\n\n\n\t\t\t\tDetails of the patient:\n\n\n\n");
			            while((line = bufferedReader.readLine()) != null) 
			            {
			                System.out.println(line);
			            }   
			             System.out.print("\t\t\t\t\t\t _________________________________________________________________ ");
			             System.out.println("\n\t\t\t\t\t\t\t\t\tBill of the patient:");
			             System.out.print("\t\t\t\t\t\t _________________________________________________________________ \n\n");
			             System.out.print("\t\t\t\t\t\tNo.of days patient stayed:");days=scan.nextInt();
			             System.out.print("\t\t\t\t\t\tWard charges/day:");wcharge=scan.nextDouble();
			             System.out.print("\n\t\t\t\t\t\tTotal ward charges:"+(wcharge*days));
			             System.out.print("\n\t\t\t\t\t\tDoctor's fee:");doc=scan.nextDouble();
			             System.out.print("\n\t\t\t\t\t\tService charges:");ser=scan.nextDouble();
			             System.out.print("\n\t\t\t\t\t\tTOTAL AMOUNT:"+((wcharge*days)+doc+ser));
			             out.println("Total Bill:"+((wcharge*days)+doc+ser));
			             System.out.print("\n\t\t\t\t\t\t _________________________________________________________________ \n");
			            // Always close files.
			            out.close();
			            bufferedReader.close();         
			        }
			        catch(FileNotFoundException ex) {
			            System.out.println(
			                "Unable to open file '" + fileName + "'");                
			        }
			        catch(IOException ex) {
			            System.out.println(
			                "Error reading file '" + fileName + "'");               
			        }
			 pressAnyKeyToContinue();
			 break;
		case 5:
			System.out.println("Thank you");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid");
				
		
			    }
		}while(choice!=6);
}
	

}
		


public class Main {
	

			
	

	public static void main (String args[]) throws IOException {
		// TODO Auto-generated method s
		Scanner sc = new Scanner(System.in);
		System.out.println("E Helath care Mangement");
		System.out.println("1. Admin");
		System.out.println("2.	Doctor");
		int choice = sc.nextInt();
		Validation v = new Validation();
		
		first f = new first();
		String usrname,password;
		String name,id;
		switch(choice) {
		case 1 :
			System.out.println("Enter username:");
			usrname=sc.next();
			System.out.println("Enter passsord:");
			password = sc.next();
			if(v.adminLogin(usrname, password))
			{
				System.out.println("Success");
				f.admin();
			}
			break;
		case 2:
			//System.out.println("Enter name :");
			//name = sc.next();
			//System.out.println("Enter id:");
			//id=sc.next();
			
			
			
			break;
			
			
		}
		

	}

}


		
	

