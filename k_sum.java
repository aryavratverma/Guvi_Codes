import java.io.*;


public class GFG {

	public static void main (String[] args) throws IOException {
	
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

	    String[] det = reader.readLine().split(" ");
	 
   int n=Integer.parseInt(det[0]);
	  
  int k=Integer.parseInt(det[1]);
	
    int[] arr=new int[n];
	   
 String[] a=reader.readLine().split(" ");

	    for(int i=0;i<n;i++){
	
        arr[i]=Integer.parseInt(a[i]);
	        }

	       int  sum=0;
	  
 for(int j=0;j<k;j++){
	       
sum=sum+arr[j];
	   }
	   
System.out.println(sum);
	
   
	}}