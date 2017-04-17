    // This question is still partially solved

    #include <iostream>
    #define ll long long int
    using namespace std;
    int main()
    {
        std::ios::sync_with_stdio(false);
        int t,n,m,number,x,l,r,y;
        ll product = 1;
        ll sum = 0;
        cin >> t;
        while(t--)
        {
            sum = 0;
            product = 1;
            cin >> n >> m;
            int arr[n];
            for(int i = 0; i < n; ++i)
            {
                cin >> arr[i];
            }
            for(int i = 0; i < m; ++i)
            {
                /*for(int k = 0; k < n; ++k)
                {
                    cout << arr[k] << endl;
                }*/
                cin >> number;
                if(number == 1)
                {
                    cin >> l >> r >> x;
                    for(int j = l-1; j < r; ++j)
                    {
                        arr[j] *= x;
                    }
                }
                else if(number == 2)
                {
                    cin >> l >> r >> y;
                    for(int j = l-1; j < r; ++j)
                    {
                        arr[j] = (j-l+2)*y;
                    }
                }
                else
                {
                    product = 1;
                    cin >> l >> r;
                    //cout << l-1 << " " << r-1 << endl;
                    for(int j = l-1; j < r; ++j)
                    {
                        //cout << arr[j] << endl;
                        product = product*arr[j];
                    }
                    //cout << product << endl;
                }
                if(product != 1)
                {
                    int q = 0;
                    while(true)
                    {
                        q = product%10;
                        if(q == 0)
                        {
                            sum++;
                        }
                        else
                        {
                            break;
                        }
                        product = product/10;
                    }
                }
            }
            cout << sum << endl;
        }
    }
