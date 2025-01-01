#include <stdlib.h>
#include <stdio.h>
int main()
{
    int tot_sec;
    int hour;
    int min;
    int sec;
    scanf("%d", &tot_sec);
    hour = tot_sec / 3600;
    min = (tot_sec % 3600) / 60;
    sec = (tot_sec % 3600) % 60;
    printf("%02d:HOUR %02dMIN :%02dSEC", hour, min, sec);
    return EXIT_SUCCESS;
}