#include <stdio.h>
int main()
{
    double kilowatt, horsepower;
    scanf("%lf", &kilowatt);
    horsepower = kilowatt * 1.35962;
    printf("%.2lf", horsepower);
}
