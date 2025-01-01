#include <stdio.h>
int main()
{
    int num1, num2;
    scanf("%d %d ", &num1, &num2);
    num1 = (num1 + num2);
    num2 = num1 - num2;
    num1 = num1 - num2;
    printf(" num1 = % d\nnum2 = % d ", num1, num2);
    return 0;
}