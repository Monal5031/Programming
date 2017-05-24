# include"bits/stdc++.h"
# define ll long long int
# define l long int
using namespace std
long long int gcd(ll a, ll b)
{
  if (b == 0)
    return a
  else
    return gcd(b, a % b)
}
int main()
{
    int t
    cin >> t
    while(t--)
    {
        int n
        cin >> n
        ll arr[n]
        for(int i=0
            i < n
            i++)
        cin >> arr[i]
        ll lcm, temp
        lcm = (arr[0]*arr[1])/(gcd(arr[0], arr[1]))
        for(int i=0
            i < n
            i++)
        {
            for(int j=0
                j < n
                j++)
            {
                    if(i != j)
                {
                            temp = (arr[i]*arr[j])/(gcd(arr[i], arr[j]))
                            if(lcm > temp)
                                lcm = temp
                        }

                }
        }
        cout << lcm << endl
        }
    return 0
}
