#include<stdio.h>
int natural(int x)
{
	int sum;
  for(int i=0;i<=x;i++)
  {
  	sum=x*(x+1)/2;
    
  }
 
  return sum;
}
int main() {
  int n;
  scanf("%d",&n);
  int res;
  res= natural(n);
  printf("%d",res);
    // Type your code here
  	return 0;
}