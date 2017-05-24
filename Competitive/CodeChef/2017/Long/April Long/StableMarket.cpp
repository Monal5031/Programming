# include"bits/stdc++.h"
# include<stdio.h>

    using namespace std

    int main() {
        int tc;
        scanf("%d", & tc);
        // cout << "tc: " << tc << endl;
        while (tc--) {
            int n, q;
            scanf("%ld %ld", & n, & q);
            // cout << "n,q: " << n << " " << q;
            vector < long int > arr(n);
            long int prev;
            long int count = 1;
            vector < long int > occ(n, 0);
            scanf("%ld", & arr[0]);
            prev = arr[0];
            occ[0] = 1;
            for (int i=1; i < n; i++) {
                scanf("%ld", & arr[i]);
                if(prev == arr[i]) {
                    count++;
                    occ[i] = count; }
                else {
                    count = 1;
                    occ[i] = count;
                    prev = arr[i]; }
            }/*
            for(int i=0; i < n; i++){
                cout<<occ[i]<<" "; }
            cout << endl; * /
            //cout << "array done\n";
            while (q--) {
                int l, r, k;
                long int answer = 0;
                scanf("%d %d %d", & l, & r, & k);
                // cout << "l,r,k " << l << r << k << endl;
                for (int i=r-1; i >= l-1; i--) {
                    long int tmp = occ[i];
                    // cout << "arr: " << arr[i] << endl;
                    // cout << "occ: " << occ[i] << endl;
                    if (i-tmp < l-1) {
                        tmp = tmp - occ[l-1] + 1; }
                    if (tmp >= k) {
                        answer++;
                        i -= (tmp);
                        i++; }
                    }
                printf("%ld\n", answer);}
        }
        return 0; }
