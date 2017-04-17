#include"bits/stdc++.h"
using namespace std;
long long int fast_exp(int base, int exp);
int main()
{
    long long int num=fast_exp(2,1000);
    cout<<num;
    return 0;
}
long long int fast_exp(int base, int exp)
{
    if(exp==1)
    return base;
    else
    {
        if(exp%2 == 0)
        {
            long long int base1 = pow(fast_exp(base, exp/2),2);
            /*if(base1 >= 1000000007)   Use this if want answer in mod 10^9+7
            return base1%1000000007;
            else*/
            return base1;
        }
        else
        {
            long long int ans = (base*  pow(fast_exp(base,(exp-1)/2),2));
            /*if(ans >= 1000000007) Use this if want answer in mod 10^9+7
            return ans%1000000007;
            else*/
            return ans;
        }
    }
}
