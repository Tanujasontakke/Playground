#include <stdio.h>
int main() {
 int n;
 scanf("%d",&n);
 while(n>=100)
 {
     n=n/10;
     //printf("\n%d",n);
     
 }
 
 n=n%10;
 printf("%d",n);	//Type your code
	return 0;
}