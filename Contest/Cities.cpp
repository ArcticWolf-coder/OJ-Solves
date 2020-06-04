#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;
#include<stdio.h>
int main()
{
    int x,y;
    string s;
    scanf("%d",&x);
    for(int i=1;i<=x;i++){
        scanf("%d",&y);
        vector<string> a;
        cin>>s;
        a.push_back(s);
        for(int j=1;j<y;j++){
            cin>>s;
            bool b=true;

            for (int k = 0; k<a.size(); k++){
                if(s.compare(a[k])==0){
                    b=false;
                    break;
                } else {

                }
            }
            if(b){
                a.push_back(s);
            }

        }
        printf("%d\n",a.size());
    }

    return 0;
}
