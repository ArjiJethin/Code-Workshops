#include <stdio.h>
int main()
{
    int N1, N2;
    scanf(" % d % d ", &N1, &N2);
    long double ans;
    ans = (long double)N1 / N2;
    printf(" The quotient when % d is divided by % d is % .16Lf ", N1, N2, ans);
    printf("\nThe remainder when % d is divided by % d is % d ", N1, N2, N1 % N2);
}
