import java.io.*;

import java.util.*;

public class Expo{
 
   public static void main(String[] args) throws IOException{
   
     
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
   
     String[] temp=reader.readLine().split(" ");
      
 int  a=Integer.parseInt(temp[0]);
      
 int  b=Integer.parseInt(temp[1]);
     
   System.out.println(Math.pow(a,b));
        
        
    }
}