#include "bits/stdc++.h"
 
using namespace std;
 
int main() {
    ios::sync_with_stdio(false);
    int tc;
    cin>>tc;
    while (tc--) {
        int n;
        cin>>n;
        vector<long int> b (2*n);
        for (long int i = 0;i < 2 * n; ++i)
            cin>>b[i];
        sort(b.begin(), b.end());
        long int tmp;
        for (long int i = 1; i <= n; i += 2) {
            tmp = b[i];
            b[i] = b[2 * n - i - 1];
            b[2 * n - i - 1] = tmp;
        }
        vector<long int> a(n);
        for (long int i = 0; i < n; ++i) {
            a[i] = max(b[2 * i], b[2 * i + 1]);
        }
        sort(a.begin(), a.end());
        long int ans=0;
        if (n%2==1)
            ans = a[n/2];
        else
            ans = max(a[n/2], a[n/2+1]);
        cout<<ans<<"\n";
        for (long int i = 0; i < 2*n; ++i)
            cout<<b[i]<<" ";
        cout<<"\n";
    }
    return 0;
}
