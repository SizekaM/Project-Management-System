import java.util.Scanner;

public class Poised {
	Scanner userInput = new Scanner (System.in);
	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in);
		String projNum, projName, projDeadline;
		String[] projBuilding = {"House", "Apartment Block", "Store", "Other"};
		double projTotalFee, projFeePaid, projAmountDue;
		String custName, custSurname, custCellNum, custEmail, custPhysAddress;
		String contrName, contrSurname, contrTelNum, contrEmail, contrPhysAddress;
		String archName, archSurname, archTelNum, archEmail, archPhysAddress;
	
		
		System.out.println("Project Number:");
		projNum = userInput.nextLine();
		
		System.out.println("Project Name:");
		projName = userInput.nextLine();
		
		
		System.out.println("Project Building:\n"
				+ "1) House\n"
				+ "2) Apartment Block\n"
				+ "3) Store\n"
				+ "4) Other");
		int buildingOption = userInput.nextInt();
		
		System.out.println("Project Physical Address:");
		String projAddress = userInput.nextLine();
		
		System.out.println("Total Fee:");
		projTotalFee = userInput.nextDouble();
		
		System.out.println("Amount paid:");
		projFeePaid = userInput.nextDouble();
		projAmountDue = projTotalFee - projFeePaid;
		

		System.out.println("Project Deadline\n"
					+ "(dd-mm-yyyy)");
		projDeadline = userInput.nextLine();
		
		
		System.out.println("\nFill in Customer Details!");
		System.out.println("Customer Name:");
		custName = userInput.nextLine();
		
		System.out.println("Customer Surname:");
		custSurname = userInput.nextLine();
			
		System.out.println("Customer Cellphone Number:");
		custCellNum = userInput.nextLine();
			
		System.out.println("Customer Email:");
		custEmail = userInput.nextLine();
			
		System.out.println("Customer Physical Address:");
		custPhysAddress = userInput.nextLine();
		
		// Creates a customer for the project.
		Customer projCustomer = new Customer(custName, custSurname, custCellNum, custEmail, custPhysAddress);
	
		
		System.out.println("Fill in Architect Details");
		System.out.println("Architect Name:");
		archName = userInput.nextLine();
		
		System.out.println("Architect Surname:");
		archSurname = userInput.nextLine();
			
		System.out.println("Architect Telephone Number:");
		archTelNum = userInput.nextLine();
			
		System.out.println("Architect Email:");
		archEmail = userInput.nextLine();
			
		System.out.println("Architect Physical Address:");
		archPhysAddress = userInput.nextLine();
		
		// Creates an architect for the project.
		Architect projArchitect = new Architect(archName, archSurname, archTelNum, archEmail, archPhysAddress);
	
		
		
		System.out.println("Fill in Contractor Details");
		System.out.println("Contractor Name:");
		contrName = userInput.nextLine();
		
		System.out.println("Contractor Surname:");
		contrSurname = userInput.nextLine();
			
		System.out.println("Contractor Telephone Number:");
		contrTelNum = userInput.nextLine();
			
		System.out.println("Contractor Email:");
		contrEmail = userInput.nextLine();
			
		System.out.println("Contractor Physical Address:");
		contrPhysAddress = userInput.nextLine();
		
		// Creates a contractor for the project. 
		Contractor projContractor = new Contractor(contrName, contrSurname, contrTelNum, contrEmail, contrPhysAddress);
		
		
		if(projName.isEmpty()) {
			projName = (projBuilding[buildingOption] + " " + custName);
		};
		
		// Prints out all information about the new project created.
		System.out.println("Project Number: " + projNum);
		System.out.println("Project Name: " + projName);
		System.out.println("Building of Project: " + projBuilding[buildingOption]);
		System.out.println("Project Physical Address: " + projAddress);
		System.out.println(projCustomer.toString());
		System.out.println(projArchitect.toString());
		System.out.println(projContractor.toString());
		
		System.out.println("=Edit Project?="
				+ "\n1) YES"
				+ "\n2) NO");
		int userChoice = userInput.nextInt();
		if(userChoice == 1) {
			System.out.println("<< EDIT MENU >>"
					+ "1: Change Deadline\n "
					+ "2: Update Fee Paid\n"
					+ "3: Change Contractor's Contact Details");
			userChoice = userInput.nextInt();
			
			if(userChoice == 1) {
				System.out.println("Change Deadline of project\n"
							+ "(dd-mm-yyyy)");
				projDeadline = userInput.nextLine();
			}
			
			else if(userChoice == 2) {
				System.out.println("Update Fee Paid");
				projFeePaid = userInput.nextDouble();
			}
			
			else if(userChoice == 3) {
				System.out.println("Update Contact Details Of Contractor");
				
				System.out.println("Update Contractor Telephone Number:");
				contrTelNum = userInput.nextLine();
					
				System.out.println("Update Contractor Email:");
				contrEmail = userInput.nextLine();
			}
			
			else {
				System.out.println("Invalid selection");
			}
			
		}
		
		else if(userChoice == 2) {
			System.out.println("Closing Application");
		}
		
		else{
			System.out.println("Invalid Choice selected");
		};
		
		System.out.println("Project Number: " + projNum);
		System.out.println("Project Name: " + projName);
		System.out.println("Building of Project: " + projBuilding[buildingOption]);
		System.out.println("Project Physical Address: " + projAddress);
		System.out.println(projCustomer.toString());
		System.out.println(projArchitect.toString());
		System.out.println(projContractor.toString());
		
		if(projTotalFee == projFeePaid) {
			System.out.println("=== INVOICE ===\n"
					+ "Customer Details:\n"
					+ projCustomer.toString()
					+ "Project Total Fee: " + projTotalFee
					+ "Project Amount Paid: " + projFeePaid
					+ "Project Amount Due: " + projAmountDue);
		}
		
		
		}
}
