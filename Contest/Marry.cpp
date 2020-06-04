
#include <iostream>
#include <cstdio>
#include <cstring>
using namespace std;

int main() {
 int t, sum, i, j;
 char m[25001], w[25001];
 scanf("%d", &t);
 while(t--) {
  sum=0; i=j=0;
  scanf("%s%s", m, w);
  if(strlen(m)<strlen(w)) {
   for(; i<strlen(m); i++) {
    for(; j<strlen(w); j++) {
     if(m[i]==w[j]) {
      sum++;
      j++;
      break;
     }
    }
   }
   if(sum==strlen(m)) printf("YES\n");
   else printf("NO\n");
  }
  else {
   for(; i<strlen(w); i++) {
    for(; j<strlen(m); j++) {
     if(w[i]==m[j]) {
      sum++;
      j++;
      break;
     }
    }
   }
   if(sum==strlen(w)) printf("YES\n");
   else printf("NO\n");
  }
 }
 return 0;}

