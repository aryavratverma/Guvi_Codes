import java.io.*;



public class GFG {
	
public static void main (String[] args) throws IOException {
	
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	
    int n= Integer.parseInt(reader.readLine());
	   
int sum=0;
	  
 for(int i=1;i<=n;i++){sum=sum+i;}
	
   System.out.println(sum);
	   
	
}}