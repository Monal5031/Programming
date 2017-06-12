// This works perfectly fine but needed to a little more efficient
# include"bits/stdc++.h"
# define ll long long int
using namespace std

ll CeilIndex(std:: vector < ll > &v, ll l, ll r, ll key)
{
    while (r-l > 1) {
        ll m = l + (r-l)/2
        if (v[m] >= key)
        r = m
        else
        l = m
        }

    return r
}

ll LongestIncreasingSubsequenceLength(std:: vector < ll > &v) {
    if (v.size() == 0)
    return 0;

    std:: vector < ll > tail(v.size(), 0);
    int length = 1; // always points empty slot in tail

    tail[0] = v[0];
    for (size_t i=1; i < v.size(); i++) {
        if (v[i] < tail[0])
        // new smallest value
        tail[0] = v[i];
        else if (v[i] > tail[length-1])
        // v[i] extends largest subsequence
        tail[length++] = v[i];
        else
        // v[i] will become end candidate of an existing subsequence or
        // Throw away larger elements in all LIS, to make room for upcoming grater elements than v[i]
        // (and also, v[i] would have already appeared in one of LIS, identify the location and replace it)
        tail[CeilIndex(tail, -1, length-1, v[i])] = v[i]; }

    return length;}

int main()

{
    std: : ios: : sync_with_stdio(false);
    int t;
    cin >> t;
    while(t--)
    {
        ll n, m;
        cin >> n >> m;
        vector < ll > arr(n);
        for(ll i=0; i < n; i++)
        cin >> arr[i];
        while(m--)
        {
            ll s = 0, currs = 0;
            ll start, end;
            cin >> start >> end;
            ll sizeofnewarr = end-start+1;
            vector < ll > newarr(sizeofnewarr);
            ll i, k;
            for(i=0, k=start-1; i < sizeofnewarr; i++, k++)
            newarr[i] = arr[k];
            s = LongestIncreasingSubsequenceLength(newarr);
            if(start == end)
            s = 1;
            cout<<s<<endl; }
    }
    return 0;}
