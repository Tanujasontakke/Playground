#include <stdio.h>
int main() {
  int number,rem,cube,sum;
  scanf("%d",&number);
  int temp = number;
    while (number != 0)
    {
        rem = number % 10;
        cube = pow(rem, 3);
        sum = sum + cube;
        number = number / 10;
    }
    if (sum == temp)
        printf ("Armstrong Number");
    else
        printf ("Not an Armstrong Number");
	//Type your code
	return 0;
}