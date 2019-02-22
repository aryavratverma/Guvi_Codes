#include <stdio.h>
int main(){

int i,value,sum=0,temp;
scanf("%d",&value);
while(value!=0){
    temp=value%10;
    value=value/10;
    sum=sum+temp*temp;
    
}
printf("%d",sum);
return 1;
}