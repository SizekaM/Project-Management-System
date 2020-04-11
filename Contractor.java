
public class Contractor {
	String contrName, contrSurname, contrTelNum, contrEmail, contrPhysAddress;

	   
	   public Contractor(String contrName, String contrSurname, String contrTelNum, String contrEmail, String contrPhysAddress) {
		   this.contrName = contrName;
		      this.contrSurname = contrSurname;
		      this.contrTelNum = contrTelNum;
		      this.contrEmail = contrEmail;
		      this.contrPhysAddress = contrPhysAddress;
	}


	public String toString() {
	      String output = "\n\n\n== Contractor Details ==";
	      output += "\nContractor: " + contrName + " " + contrSurname;
	      output += "\nTel Number: " + contrTelNum;
	      output += "\nemail: " + contrEmail;
	      output += "\nphysAddress: " + contrPhysAddress;
	   
	      return output;
	   }

}
