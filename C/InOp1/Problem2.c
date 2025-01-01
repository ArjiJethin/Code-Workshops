#include <stdio.h>
int main()
{
    int val;
    scanf(" % d ", &val);
    if (val >= 0 && val <= 127)
        printf(" % d : % c ", val, val);
    else
        printf(" % d : Invalid Input ", val);
    return 0;
}