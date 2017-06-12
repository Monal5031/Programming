#include "bits/stdc++.h"
 
using namespace std;
 
int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	int tc;
	cin>>tc;
	while (tc--) {
		string tmp;
		int a,b,c,d;
		bool barca = true;
		int t = 4;
		while (t--) {
			cin>>tmp;
			if (tmp == "Barcelona")
				cin>>a;
			else if (tmp == "Malaga")
				cin>>d;
			else if (tmp == "Eibar")
				cin>>c;
			else
				cin>>b;
		}
		if (a > c && b < d)
			cout<<"Barcelona\n";
		else
			cout<<"RealMadrid\n";
	}
	return 0;
}
