
public class NestedSwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char branch = 'C';
		int collegeYear = 4;
		
		switch(collegeYear) {
		
		case 1 : System.out.println("English, Maths,Science");
		break;
		
		case 2 : 
			switch(branch) {
			
			case 'C' : System.out.println("Operating System, Java, Data Structure");
			break;
			
			case 'E' : System.out.println("Micro processors, Logic swicthing theory");
			break;
			
			case 'M' : System.out.println("Drawing,Manufacturing Machines");
			break;
			}
			
		case 3 :
			switch(branch) {
			
			case 'C' : System.out.println("Data Communication and NEtworking, Multimedia");
			break;
			
			case 'E' : System.out.println("Embedded System, Image Processing");
			break;
			
			case 'M' : System.out.println("Production Technology,Thermal Engineering");
			break;
			}
			
			
		case 4 :
			switch(branch) {
			
			case 'C' : System.out.println("Computer Organization, Multimedia");
			break;
			
			case 'E' : System.out.println("fundamental of Logical Design, Microelectronic");
			break;
			
			case 'M' : System.out.println("Internal Combustion Engines, Mechanical Vibration");
			break;
			}
		}

	}

}
