import java.io.*;

 
public class GFG {

	public static void main (String[] args) throws IOException {
	
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

	    String[] str = reader.readLine().split(" ");
	 
   int a= Integer.parseInt(str[0]);
	 
   int b=Integer.parseInt(str[1]);
	
    int c=Integer.parseInt(str[2]);
	
    if(a>b && a>c){
	        
System.out.println(a);
	    
}else if(b>a && b>c){
	
        System.out.println(b);
	 
   }else if(c>a && c>b){
	       
 System.out.println(c);
	  
  }else{System.out.println("-1");}
	}}
