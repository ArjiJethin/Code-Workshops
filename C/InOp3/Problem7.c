#include <stdio.h>
int main()
{
    double celsius, fahrenheit;
    scanf("%lf", &fahrenheit);
    celsius = (fahrenheit - 32) * 5 / 9;
    printf("%.2lf Celsius", celsius);
    return 0;
}