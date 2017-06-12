#include "bits/stdc++.h"
 
using namespace std;
 
int main() {
    ios::sync_with_stdio(false);
    int tc;
    cin>>tc;
    while (tc--) {
        string s;
        cin>>s;
        bool cook = false;
        bool eat = false;
        bool sleep = false;
        bool pass = true;
        for (long int i = 0; i < s.length(); ++i) {
            if (s[i] == 'C') {
                if (i != 0) {
                    if (s[i-1] == 'E' || s[i-1] == 'S') {
                        pass = false;
                        break;
                    }
                }
            }
            else if (s[i] == 'E') {
                if (i != 0) {
                    if (s[i-1] == 'S') {
                        pass = false;
                        break;
                    }
                }
            }
            else if (s[i] == 'S') {
                if (i != s.length() - 1) {
                    if (s[i+1] == 'C' || s[i+1] == 'E') {
                        pass = false;
                        break;
                    }
                }
            }
        }
        if (pass)
            printf("yes\n");
        else
            printf("no\n");
    }
    return 0;
}
