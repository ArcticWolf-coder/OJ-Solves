#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;
#include<stdio.h>
int main()
{
    int x,y,z=0,n,sum=0;

    for(;;){
        z=0,sum=0;
        scanf("%d",&n);
        if(n==-1){
            break;
        }

        for(int j=1;j<=n;j++){
           scanf("%d %d",&x,&y);
           sum+=x*(y-z);
           z=y;


        }
        printf("%d miles\n",sum);
    }

    return 0;
}
