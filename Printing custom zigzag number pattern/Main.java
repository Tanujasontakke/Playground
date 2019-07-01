#include <stdio.h>
int main()
{
int i,j,n;
scanf("%d",&n);
for(i=1;i<=n;i++)
{
if(i%2!=0)
{
for(j=1;j<=n+1;j++)
{
if(j<n)
printf("%d",i);
if(j>n)
printf("%d",i+1);
}
}
else if(i%2==0)
{
for(j=1;j<=n+1;j++)
{
if(j==1)
printf("%d",i+1);
if(j<n)
printf("%d",i);
}
}
printf("\n");
}

return 0;
}