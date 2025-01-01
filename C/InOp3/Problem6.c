#include <stdio.h>
int main()
{
    double square_feet, acres;
    scanf("%lf", &square_feet);
    acres = square_feet / 43560;
    printf("%.2lf", acres);
    return 0;
}