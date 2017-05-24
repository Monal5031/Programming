#include "bits/stdc++.h"
 
using namespace std;
 
int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	int rathimc;
	cin>>rathimc;
	while (rathimc--) {
		int n;
		cin>>n;
		int nums[n];
		for (int i = 0; i < n; ++i)
			cin>>nums[i];
		if (n % 2 == 0 || nums[0] != 1 || nums[n-1] != 1) {
			cout<<"no\n";
			//cout<<"yahase no mila hai"<<endl;
			continue;
		}
		bool pass = true;
		for (int i = 0; i < n/2; ++i) {
			if (nums[i] != nums[n - i - 1] || (nums[i + 1] - nums[i]) != 1) {
				pass = false;
				break;
			}
		}
		if (pass)
			cout<<"yes\n";
		else
			cout<<"no\n";
	}
	return 0;
}
