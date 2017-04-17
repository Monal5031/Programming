#include"bits/stdc++.h"
#include<stdio.h>
 
using namespace std;
 
int main() {
	int tc;
	scanf("%d",&tc);
	while (tc--) {
		int n,k;
		scanf("%d%d",&n,&k);
		map<int,int>arr;
		bool some =false;
		int count =0;
		for (int i=0;i<n;i++) {
			int temp;
			scanf("%d",&temp);
			for (int j=0;j<temp;j++) {
				int tmp;
				scanf("%d",&tmp);
				if (count==k)
					continue;
				if (arr[tmp]==0) {
					count++;
					arr[tmp]=1;
					if (count==k && i < n-1)
						some=true;
				}
			}
		}
		arr.clear();
		if (count<k)
			printf("sad\n");
		else if(some)
			printf("some\n");
		else
			printf("all\n");
	} 
}
