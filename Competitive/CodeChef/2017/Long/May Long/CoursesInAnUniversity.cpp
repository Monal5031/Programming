#include "bits/stdc++.h"
 
using namespace std;
 
int main() {
	ios::sync_with_stdio(false);
	int tc;
	cin>>tc;
	while (tc--) {
		int n;
		cin>>n;
		vector< int> arr (n);
		for (int i=0;i<n;++i)
			cin>>arr[i];
		sort(arr.begin(), arr.end());
		cout<<(n-arr[n-1])<<"\n";
	}
	return 0;
}
