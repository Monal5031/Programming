#include "bits/stdc++.h"
 
using namespace std;
 
int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	int tc;
	cin>>tc;
	while (tc--) {
		long int n;
		cin>>n;
		long int count_pos = 0;
		long long int answer = 0;
		long long int sum_neg = 0;
		long long int tmp;
		vector< long long int > negs;
		for (long int i = 0; i < n; ++i) {
			cin>>tmp;
			if (tmp < 0) {
				negs.push_back(-tmp);
				sum_neg += -tmp;
			}
			else {
				answer += tmp;
				count_pos++;
			}
		}
		
		sort(negs.begin(), negs.end());
		vector < long long int > sum_with_each_neg;
 
		tmp = 0;
		if (sum_neg >= 0) {
			for (long int i = 0; i < negs.size(); ++i) {
				tmp += negs[i];
				sum_with_each_neg.push_back( tmp - sum_neg + (answer - tmp) * (count_pos + i + 1));
			}
		}
 
		if (sum_with_each_neg.size() == 0) {
			cout<<answer * count_pos - sum_neg<<"\n";
		}
		else {
			sort(sum_with_each_neg.begin(), sum_with_each_neg.end());
			cout<<max(answer * count_pos - sum_neg, sum_with_each_neg[sum_with_each_neg.size() - 1])<<"\n";
		}
		negs.clear();
		sum_with_each_neg.clear();
	}
	return 0;
}
