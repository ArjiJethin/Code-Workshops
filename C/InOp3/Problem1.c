#include <stdio.h>
int main()
{
    double celsius, fahrenheit;
    scanf("%lf", &celsius);
    fahrenheit = ((celsius * 9) / 5) + 32;
    printf("%.2lfF", fahrenheit);
    return 0;
}
