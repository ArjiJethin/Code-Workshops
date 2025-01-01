#include <stdio.h>
int main()
{
    long double num;
    int precision;
    scanf(" % Lf % d ", &num, &precision);
    printf(" %.*Lf ", precision, num);
    return 0;
}