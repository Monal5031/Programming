#include <stdio.h>
int main()
{
	int t;
	scanf("%d",&t);
	while(t--)
	{
		int a,b=0,c=0,k;
		scanf("%d",&k);
		char st[k];
		scanf("%s",st);
		for (a=0;a<k;a++)
		{
			if (st[a]==72)
			{
				b++;
				if (b>=2)
				{
					c++;	
				}
			}
			else if (st[a]==84)
			{
				b--;
				if (b<0)
				{
					c++;
				}
			}
		}
		if (c==0 && b==0)
		{
			printf("Valid\n");
		}
		else
			printf("Invalid\n");
	}
}
