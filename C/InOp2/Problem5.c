#include <stdio.h>
int main()
{
    int N1, N2, temp;
    scanf(" % d % d ", &N1, &N2);
    temp = N1;
    N1 = N2;
    N2 = temp;
    printf(" num1 = % d\nnum2 = % d ", N1, N2);
    return 0;
}