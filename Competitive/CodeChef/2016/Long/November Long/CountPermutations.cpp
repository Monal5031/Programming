#include"bits/stdc++.h"
#define ll long long int
#define m(i) i%1000000007
#define mod(x) cout<<x<<endl;
using namespace std;
long long int calculate(ll base, ll exp)
{
    if(exp==1)
    return base;
    else
    {
        if(exp%2 == 0)
        {
            ll base1 = pow(calculate(base, exp/2),2);
            if(base1 >= 1000000007)
            return m(base1);
            else
            return base1;
        }
        else
        {
            ll ans = (base*  pow(calculate(base,(exp-1)/2),2));
            if(ans >= 1000000007)
            return m(ans);
            else
            return ans;
        }
    }
}

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        ll n;
        ll ans=1;
        cin>>n;
        if(n<=2)
            cout<<"0\n";
        else{
        ans=calculate(2,n-1);
        mod(ans-2);
        }

    }
    return 0;
}
