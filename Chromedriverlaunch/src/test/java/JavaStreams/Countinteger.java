package JavaStreams;

import java.util.ArrayList;

public class Countinteger {

	

	    public static void main(String[] args) {
	         int[] a = {1,1,2,1,5,6,7,7,7,7,7,7,6,6,8,8,9,6,8,5,9,7,1};
	    int max = 0 ;
	    
	    int chh = 0;
	    int count[] = new int[a.length];
	    
	    for(int i = 0 ; i <a.length ; i++) {
	        int ch = a[i];
	        count[ch] +=1 ;
	    }//for

	    for(int i = 0 ; i <a.length ;i++)  {
	        int ch = a[i];
	        if(count[ch] > max) {max = count[ch] ; chh = ch ;}
	    }//for
	         System.out.println(chh); 
	         
	         
	         
	         ArrayList<String> lis = new ArrayList<>();
	         lis.add("My");
	         lis.add("Name");
	         int j = 0;
	         while(j<lis.size()) {
			System.out.println(lis.get(j));
			j++;
	         }
	         
	         
	         
	         
	    
			
	    }//main
	}
	

	
	
	
	


