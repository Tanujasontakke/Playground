#include <stdio.h>
int main()
{
    //1
    int i,j,size;
    scanf("%d",&size);
    
    //3
    for(i=0; i < size ;i++)
    {
        //4
        for(j=0; j < size ;j++)
        {
            if(i==j || j==(size-i-1))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }
    return 0;
}