#include <stdio.h>
int main(){
  
  int value,result=1,i;
   
 scanf("%d",&value);
    
if(value<=1){
      
  result=1;
   
 }else{
 
       for(i=1;i<=value;i++){result=result*i;}
 
       
    }
    printf("%d",result);


    return 1;
}
