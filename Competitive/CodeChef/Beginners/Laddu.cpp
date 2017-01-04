#include"bits/stdc++.h"
using namespace std;


int main()
{
ios::sync_with_stdio(false);
int t;
cin>>t;
while(t--)
	{
	int n;
	string checker;
	cin>>n>>checker;
	int laddu=0;
	string activity;
	for(int i=0;i<n;i++)
		{
		cin>>activity;
		if(activity=="CONTEST_WON")
			{
			int rank;
			cin>>rank;
			laddu+=300;
			if(rank<=20)
		            laddu+=20-rank;
			}
		else if(activity=="TOP_CONTRIBUTOR")
			laddu+=300;
		else if(activity=="BUG_FOUND")
			{
			int severity;
			cin>>severity;
			laddu+=severity;
			}
		else
			laddu+=50;			
		}
	if(checker=="INDIAN")
		laddu/=200;
	else
		laddu/=400;
	cout<<laddu<<"\n";
	}
return 0;
}
