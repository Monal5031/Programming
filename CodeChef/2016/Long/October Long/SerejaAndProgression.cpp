//this problem is still partially solved

# include<iostream>
# include<cmath>

using namespace std

int main()
{
    long long int n, k, d
    cin >> n >> k >> d
    long long int a[n]
    long long int tmp
    double ans = 0

    for(long long int i=0
        i < n
        i++)
    {
        cin >> a[i]
        }
    int a1 = 0, r = 1
    cout << a1 << " " << r << "\n"
    sort(a, a+n)

    for(long long int i=0
        i < k-1
        i++)
    {
            cout << "1 " << (n-i) << " " << (n-i-1) << "\n"
            tmp = a[n-i-1]
            a[i] = a[n-i-2]
            a[n-i-2] = tmp
        }
    if(k == 1)
    cout << "1 " << (n-k) << " " << (n-k+1) << "\n"
    else
    cout << "1 " << (n-k) << " " << (n-k-1) << "\n"
    tmp = a[n-k]
    a[n-k] = a[n-k-1]
    a[n-k-1] = tmp

    for(tmp=0
        tmp < d
        tmp++)
    {
            cout << "2 " << (n-tmp) << "\n"
            a[n-tmp-1] = 0
        }
    cout << "-1"
    return 0
}
