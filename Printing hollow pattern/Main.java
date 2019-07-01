#include <stdio.h>
int main(){
	int rows, a, b;
	scanf("%d", &rows);

	for(a = 0; a < rows; a++)  
	{
		for(b = 0; b < rows; b++) 
		{
			if(a==0 || a==rows-1 || b==0 || b==rows-1) 
				printf("*"); //prints the star
			else 
				printf(" "); 
		}
		printf("\n"); 
	}
	return 0;
}