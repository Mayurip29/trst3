package ChromedriverLaunch.Chromedriverlaunch;

public class DoubleExample7 {  
    
   int a;
   String name;
   
   
   
  public DoubleExample7(int r, String n) {
	  a= r;
		name=  n;
}


void display( ) {
   System.out.println(a+ " " +name );
   
   }
   
   
   
   
   public static void main(String[] args) {
	   
	   DoubleExample7 s1 = new DoubleExample7(3, "iti");
	   DoubleExample7 s2 = new DoubleExample7(700, "tj");
	   
	   
	   s1.display();
	   s2.display();
   }
  


}
   