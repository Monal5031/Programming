#include"bits/stdc++.h"
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        if(n<=5)
        {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                    int o=n-j+i-1;
                    if(o==0)
                        o=n;
                    else if(o>n)
                        o=o%n;
                cout<<o<<" ";
            }
        cout<<endl;
        }
        }
        else
        {
            int r=n/2-1;
            for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                    int o=(n-r)-j+i;
                    if(o==0)
                        o=n;
                    else if(o<0)
                       o+=n;
                    else if(o>n)
                        o=o%n;
                cout<<o<<" ";
            }
        cout<<endl;
        }
        }
    }
    return 0;
}
