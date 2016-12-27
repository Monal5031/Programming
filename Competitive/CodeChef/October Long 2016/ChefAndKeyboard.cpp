#include<iostream>
using namespace std;
int main()
    {
        ios::sync_with_stdio(false);
    long long int t,m,n,c,x,y;
    cin>>t;

while(t--)
        {
            long long int count=0;
            cin>>n>>m>>c;
            for(x=1;x<=n;x++)
                {
                if(c%x==0)
                    {
                    y=c/x;
                    if(y<=m&&(x*y)==c)
                    count++;
                    }
                }
                cout<<count<<endl;
    }
    return 0;
    }
