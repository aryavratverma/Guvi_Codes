

import java.io.*;

import java.util.Scanner;


class Evenodd{

	public static void main (String[] args) {

	       Scanner sc = new Scanner(System.in); 

	       int n =sc.nextInt();

		if(n<0){System.out.println("invalid");
                }else{
               if(n%2==0){
	
	           System.out.println("Even");
		
    
		}else{

		System.out.println("Odd");
	
		}}
}
}