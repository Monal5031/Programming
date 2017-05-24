# include"bits/stdc++.h"
# define li long int
# define ll long long int
    using namespace std
    int main()
    {
        ios: : sync_with_stdio(false); // faster I/O
        li tc;
        cin >> tc;
        while(tc--)
        {
            ll c, d, l;
            cin >> c >> d >> l;
            if(4*(c+d) == l) // if all the legs are counted
            cout << "yes\n";
            else if(l % 4 != 0) // legs not multiple of 4
            cout << "no\n";
            else if(4*(c+d) < l) // if less legs are counted
            cout << "no\n";
            else if(l < 4*d) // if less legs counted for dogs
            cout << "no\n";
            else if(d == 0 & &c*4 != l) // if Zero dogs and total cats legs are not 4 times
            cout << "no\n";
            else
            {
                ll legs = l-4*d;
                if(legs % 4 == 0 & &2*d >= c) // when
                cout << "yes\n";
                else if(c > 2*d)
                {
                    c = c-2*d;
                    if(l < 4*d+c*4)
                    cout << "no\n";
                    else
                    cout<<"yes\n";}
                else
                cout<<"no\n";}
        }
        return 0; }
