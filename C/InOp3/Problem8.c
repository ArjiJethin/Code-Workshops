#include <stdio.h>
int main()
{
    double liter, gallon;
    scanf("%lf", &liter);
    gallon = liter * 0.26417;
    printf("%.2lf", gallon);
}
