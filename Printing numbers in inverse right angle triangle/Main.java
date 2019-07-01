#include <stdio.h>
int main()
{
    int i, j,no;
  scanf("%d",&no);
    for(i=no;i>=1;i--)
    {
        for(j=i;j>=1;j--)
        {
            printf("%d",j);
        }
        printf("\n");
    }

    return 0;
}