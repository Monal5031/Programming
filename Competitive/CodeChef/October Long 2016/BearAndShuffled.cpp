// this problem is still partially solved
    #include<cstdio>
    #include<algorithm>
    #include<cmath>
    using namespace std;
    int main()
    {
    	long long int n,x[1001],y[1001],i,maxi,j,k,d;
    	scanf("%lld",&n);
    	for(i=1;i<=n;i++)
    		scanf("%lld%lld",&x[i],&y[i]);
    	maxi = 0;
    		for(i=1;i<=n;i++)
    		{
    			for(j=1;j<=i;j++)
    			{
    				d = pow((x[j] - x[i]),2) + pow((y[j] - y[i]),2);
    				maxi = max(maxi,d);
    			}
    			printf("%lld\n",maxi);
    		}


    	return 0;
    }

