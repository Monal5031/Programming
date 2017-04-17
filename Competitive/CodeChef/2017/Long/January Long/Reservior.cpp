    #include"bits/stdc++.h"
    #define ll long long int
    #define li long int
    using namespace std;
    int main()
    {
    ios::sync_with_stdio(false); // fast I/O
    int tc;
    cin>>tc;
    while(tc--)
        {
        int h,w;
        cin>>h>>w;
        char build[h+1][w+1];
        for(int i=1;i<=h;i++)
            for(int j=1;j<=w;j++)
                cin>>build[i][j];
        int checker=1;
        for(int i=1;i<=h;i++)
            for(int j=1;j<=w;j++)
            {
            if(build[i][j]=='W')        //Water Conditions
                {
                if(j==1||j==w||i==h)    //water at left right wall or bottom
                    {
                    checker=0;
                    break;
                    }
                else if(build[i][j-1]=='A'||build[i][j+1]=='A') //Air to left or right
                    {
                    checker=0;
                    break;
                    }
                else if(build[i+1][j]=='A')     //Air below
                    {
                    checker=0;
                    break;
                    }
                }
            else if(build[i][j]=='A')   //Air Conditions
                {
                if(i==1&&j==1&&build[i][j+1]=='W')  //Water to right at left end
                    {
                    checker=0;
                    break;
                    }
                else if(i==1&&j==w&&build[i][j-1]=='W')//Water to left at rightend
                    {
                    checker=0;
                    break;
                    }
                else if((j!=w&&build[i][j+1]=='W')||(j!=1&&build[i][j-1]=='W')) //Water to left or right at middle positions
                    {
                    checker=0;
                    break;
                    }
                else if(i!=1&&build[i-1][j]!='A')   //Water Above
                    {
                    checker=0;
                    break;
                    }
                }
            }
        if(checker==1)
            cout<<"yes\n";
        else
            cout<<"no\n";
        }
    return 0;
    }
