package polymorphism;

public class User {
	   public int id = 1;
	   
	   public void printUserType() {
		   System.out.println("User");
	   }
	   
	   public void saveWebLink() {
		   System.out.println("User: saveWebLink");
		   postAReview("");	 
		   staticMethod(); 
	   }
	   public Review postAReview(String reviewText) {
		   System.out.println("User: postAReview");
		   Review review = new Review(reviewText);
		   return review;
	   }
	   
	   // Method binding demo
	   public static void staticMethod() {
		   System.out.println("\nUser: staticMethod");
	   }   
	   public void instanceMethod(double d) {
	      System.out.println("User: instanceMethod");
	   }
	   public void instanceMethod(User u) {
	      System.out.println("User: instanceMethod");
	   }
	   
	   public final void finalMethod() {}
}
