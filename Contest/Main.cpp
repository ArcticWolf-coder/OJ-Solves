#include <bits/stdc++.h> 
using namespace std; 
  

int p(int x) 
{ 
    int d = 1; 
    while (x) { 
        d *= (x % 10); 
        x /= 10; 
    } 
    return d; 
} 
  
 
int f( int r) 
{ 
     
    string a = "1"; 
    string b = to_string(r); 
  
    
    int sum = r; 
    for (int i = 0; i < b.size(); i++) { 
        if (b[i] == '0') 
            continue; 
  
        
        string r = b; 
        r[i] = ((r[i] - '0') - 1) + '0'; 
  
         
        for (int j = i + 1; j < r.size(); j++) 
            r[j] = '9'; 
  
        
        int n = 0; 
        for (auto k : r) 
            n = n * 10 + (k - '0'); 
   
        if (n >=1 && p(sum) < p(n)) 
            sum = n; 
    } 
  
    return sum; 
} 
  
 
int main() 
{ 
    int l = 1, r; 
   
  
   
    cin>>r;
    cout << p(f( r)) << endl; 
  
    return 0; 
}