//Display the value of pi to certain decimal places as specified by the user
    #include"bits/stdc++.h"
    using namespace std;

    int main()
    {
        ios::sync_with_stdio(false);
        double PI=3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;
        int places;
        cout<<"Enter number of decimal places of to display"<<endl;
        cin>>places;
        cout<<endl<<setprecision(places+1)<<PI;
        return 0;
    }

