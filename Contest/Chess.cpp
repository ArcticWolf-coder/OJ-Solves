#include<bits/stdc++.h>
using namespace std;


int main(void){

	int n;

	scanf("%d", &n);

	for(int i = 0; i < n; i++)
	{
		int x,y,z, sum = 0;
		scanf("%d %d", &x, &y);
		if(x>y)
            z=x;
        else
            z=y;

		if( x == 1 || y == 1){
			sum=z;
		}
		else if( x == 2 || y == 2){

			sum = ( z / 4 ) * 4;

			if( z% 4 == 1){
				sum+=2;
			}
			else if( z % 4 > 1){
				sum+=4;
			}
		}
		else{
			sum = (( x * y ) + 1 ) / 2;
		}

		printf("Case %d: %d\n", i, sum);

	}

}
