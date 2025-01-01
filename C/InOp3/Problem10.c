#include <stdio.h>
int main()
{
    double inches, feet;
    scanf("%lf", &inches);
    feet = inches * 0.08333;
    printf("%.2lf", feet);
}
