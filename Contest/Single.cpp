#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;
#include<stdio.h>
int main()
{
    int n,g;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
       scanf("%d",&g);
       vector<long int> a;
       long num;
       scanf("%li",&num);
       a.push_back(num);
       for(int j=1;j<g;j++){
            scanf("%li",&num);
            bool b=true;
            for(int k=0;k<a.size();k++){
                if(num==a[k]){
                   b=false;
                   a.erase(a.begin()+k);
                   break;
                }
            }
            if(b){
                a.push_back(num);
            }
       }
       printf("Case #%d: %li\n",i,a[0]);

    }


    return 0;
}
