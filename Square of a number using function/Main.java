#include<stdio.h>
int square_no(int n)
{
	int s;	
  s=n*n;
  return s;
}

int main() {
  int m;
  scanf("%d",&m);
  int rem = square_no(m);
  printf("%d",rem);
   // Type your code here
   return 0;
}