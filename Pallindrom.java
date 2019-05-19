import java.io.*;
import java.util.*;

public class Pallindrom{

    public static void main(String[] args) throws IOException{
   
     
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
 
       int num =Integer.parseInt(reader.readLine());
    
    int rev_num=0;
    
    int orig_num=num;
  
      while(num!=0){
     
       int temp=num%10;
    
        rev_num=rev_num*10+temp;
 
           num=num/10;
        }
   
         
        
       if(orig_num==rev_num){
  
         System.out.println("yes");
       
}else{
          
 System.out.println("no");
      
 }
        
        
        
    }
}                                                                