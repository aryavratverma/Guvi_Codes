import java.io.*; 



public class GFG {
	
public static void main (String[] args) throws IOException {

	    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

	    int year = Integer.parseInt(reader.readLine());
	 
   		if(year%4==0){
	        
		if(year%100==0){
	    
        	if(year%400==0){

	                System.out.println("yes");

	            }else{System.out.println("no");}
	
        		}else{
	           
			 System.out.println("yes");

				}

	    			}else{
	       
				 System.out.println("no");
	 
				   }
	   
	
				}}