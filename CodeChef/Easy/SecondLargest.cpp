# include "bits/stdc++.h"

    using namespace std

    int main() {
        ios: : sync_with_stdio(false);
        int tc;
        cin >> tc;
        while (tc--) {
            long int a[3];
            cin >> a[0] >> a[1] >> a[2];
            sort(a, a+3);
            cout<<a[1]<<"\n";}
        return 0;}
