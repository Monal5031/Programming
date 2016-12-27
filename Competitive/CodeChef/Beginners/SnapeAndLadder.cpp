#include"bits/stdc++.h"
using namespace std;
 int main()
 {
 int t;
    cin >> t;
    while (t--)
    {
        int ls,b;
        cin >> b >> ls;
        cout << sqrt(ls*ls - b*b) <<" " << sqrt(ls*ls + b*b) << endl;
    }
 }
