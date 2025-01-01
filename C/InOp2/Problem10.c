#include <stdio.h>
int main()
{
    long long int nod;
    int days, week, year;
    scanf("%lld", &nod);
    year = nod / 365;
    week = (nod % 365) / 7;
    days = (nod % 365) % 7;
    printf("Number of Years:%d\n", year);
    printf("Number of Week:%d\n", week);
    printf("Number of Days:%d", days);
    return 0;
}