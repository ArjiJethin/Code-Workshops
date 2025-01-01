#include <stdio.h>
int main()
{
    double Kilogram = 0.453592;
    double pound;
    scanf("%lf", &pound);
    printf("%.2lf\n", (pound * Kilogram));
    return 0;
}
