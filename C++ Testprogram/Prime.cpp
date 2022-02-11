#include<stdio.h>
 
int main()
{   
    int i;
     
    for(i=1; i<=500; i++){
         
        if((i==1 || i%2 == 0 || i%3 == 0 || i%5==0 || i%7==0) 
            && (i!=2 && i!=3 && i!=5 && i!=7)){
            continue;
        }
 
        printf(" %d\t", i);     
    }
     
    printf("\n\n");
     
    return 0;
}