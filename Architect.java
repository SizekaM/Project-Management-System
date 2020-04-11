
public class Architect {
	String archName, archSurname, archTelNum, archEmail, archPhysAddress;
	

	   public Architect (String archName, String archSurname, String archTelNum, String archEmail, String archPhysAddress ) {
	      this.archName = archName;
	      this.archSurname = archSurname;
	      this.archTelNum = archTelNum;
	      this.archEmail = archEmail;
	      this.archPhysAddress = archPhysAddress;
	   }

	   
	   public String toString() {
		   String output = "\n\n\n== Architect Details ==";
		   output += "\nArchitect: " + archName + " " + archSurname;
		   output += "\nTel Number: " + archTelNum;
		   output += "\nemail: " + archEmail;
		   output += "\nphysAddress: " + archPhysAddress;
		   
		   return output;
	   }

}
