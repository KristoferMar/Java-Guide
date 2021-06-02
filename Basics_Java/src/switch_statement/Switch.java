package switch_statement;

public class Switch {
	
	  static void switchExample() {
			System.out.println("\nInside switchExample ...");
			int month = 3;
			switch (month) {
				case 1: System.out.println("January");
			            break;
				case 2: System.out.println("February");
			            break;
			    case 3: System.out.println("March");
			            break;
				default: System.out.println("April");
			}
		  }
}
