#include <stdio.h>
int main()
{
    double kg, pounds;
    scanf("%lf", &kg);
    pounds = kg * 2.20462;
    printf("%.2lf Pounds", pounds);
    return 0;
}
