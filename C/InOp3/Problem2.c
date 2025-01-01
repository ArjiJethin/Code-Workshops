#include <stdio.h>
#include <math.h>

#define M_PI 3.141592653589793238462643
int main()
{
    double degree, radian;
    scanf("%lf", &degree);
    radian = degree * (M_PI / 180.0);
    printf("%.2lf", radian);
    return 0;
}
