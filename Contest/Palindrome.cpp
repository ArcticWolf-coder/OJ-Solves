#include<bits/stdc++.h>
using namespace std;
int rev(int x)
{
	int sum;
	sum=0;

	for(;x>0;x/=10) {
		sum = sum * 10 + x % 10;

	}
	return sum;


}


    int main(){
        int n;
        cin >> n;

        for(int i=1;i<=n;i++) {
            int num;
            scanf("%d",&num);
            printf("Case %d: ",i);
            if(rev(num)==num){
                printf("Yes\n");
            } else {
                printf("No\n");
            }
        }


        return 0;
}
