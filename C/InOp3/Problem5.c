#include <stdio.h>
int main()
{
    double km, miles;
    scanf("%lf", &km);
    miles = km / 1.6;
    printf("%.2lf Miles", miles);
    return 0;
}