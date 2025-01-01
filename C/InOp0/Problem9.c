#include <stdio.h>
int main()
{
    long int num1, num2;
    scanf("%ld %ld", &num1, &num2);
    printf("%05ld\n%5ld", num1, num2);
    return 0;
}