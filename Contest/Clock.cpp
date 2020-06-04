#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;
#include<stdio.h>
int main()
{


    int x,y;
    scanf("%d",&x);
    scanf("%d",&y);
    int n=x*60+y;
    n-=45;
    if(n<0){
        n=23*60+(60+n);
    }
    x=n/60;
    y=n%60;


    printf("%d %d\n",x,y);


    return 0;
}
