package JavaStreams;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Arraytest {

	
	
	
		public static  void test1() {
			
		
		int i = 0;
		
		int [] arr1 = new int[3];
		String[] s= new String[]  {"Hello", "k", "j"};//inline initialization
		
		System.out.println(s.length);
		
		
		//String[] strAr1=new String[] {"Ani", "Sam", "Joe"}; 
		
		
		
		String[] s2 = {"Ani", "Sam", " Joe"};  
		
		
		String[] s3= new String[3]; //Initialization after declaration with specific size  
		   s3[0]= "Ani";  
		   s3[1]= "Sam";  
		   s3[2]= "Joe"; 
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 34;
    
       
       
      
     
       
       for (i=0; i<arr1.length;i++)
    	   
       {
       System.out.println(arr1[i]);
		
       }
       
       
       
 for (int j=0; j<s.length;j++)
    	   
     {
       System.out.println(s[j]);
		
     }
       
 
 
 
       for(String j:s)
       {
           System.out.println(j);
    		
           }
		
		}
	public static void test2()
	{
		ArrayList <String> names = new ArrayList<String>();
		
		names.add("test");
		names.add("kpk");
		names.add("Add");
		names.add("Ayyd");
		names.add("kok");
		int count =0;
		for (int i=0; i<names.size();i++) {
			
			String actual=names.get(i);
			if(actual.startsWith("A"))
			{
				
				count++;
			
			}
			System.out.println(count);
		
		}
	}
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			test1();
			test2();
	
	}

}
