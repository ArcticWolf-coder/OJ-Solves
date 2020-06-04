#include<bits/stdc++.h>
#include<iostream>
#include<cmath>
#include<cstdio>
using namespace std;



    int main(){
        int n;
        cin >> n;
        double a,b,c,d,sum;
        for(int i=1;i<=n;i++) {

           cin>>a>>b>>c>>d ;
           sum=a*sqrt(d/(1+d));
           printf("Case %d: %lf\n",i,sum);
        }


        return 0;
}
