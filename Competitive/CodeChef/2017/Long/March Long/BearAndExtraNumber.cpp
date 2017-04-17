#include"bits/stdc++.h"
#include<stdio.h>

#define ll long long int
#define l long int
using namespace std;


int main()
{
    int tc;
    scanf("%d",&tc);
    while(tc--)
    {
        l n;
        scanf("%ld",&n);
        ll arr[n];
        for(int i=0;i<n;++i)
        scanf("%lld",&arr[i]);
        sort(arr,arr+n);
        l i;
        bool passer=false;
        for(i=1;i<n-1;++i)
        {
            if(arr[i+1]-arr[i]!=1&&arr[i]-arr[i-1]!=1)
                {
                    break;
                //cout<<"i:"<<i<<endl;
                }
            else if(arr[i+1]==arr[i]||arr[i]==arr[i-1])
            {
                passer=true;
                printf("%lld\n",arr[i]);
                break;
            }
        }
        if(passer)
            {}
        else if(arr[1]-arr[0]!=1)
            printf("%lld\n",arr[0]);
        else if(arr[n-2]-arr[n-3]!=1)
            printf("%lld\n",arr[n-1]);
        else
            printf("%lld\n",arr[i]);
    }
    return 0;
}
