# include<iostream>
# include<string>
using namespace std
int main()
    {
        int t
        cin >> t
        while(t--)
        {
            string l1, l2, l3

            long long int n, i, j
            cin >> l1 >> l2 >> l3 >> n
            long long int ans = 0, counter = 0, countl1 = 0, countl2 = 0, countl3 = 0
            for(i=0
                i < l3.size()
                i++)
            if(l3[i] == '1')
            countl3++

            for(i=0
                i < l2.size()
                i++)
            if(l2[i] == '1')
            countl2++

            for(i=0
                i < l1.size()
                i++)
            if(l1[i] == '1')
            countl1++

            if(countl1 == l1.size() & &countl2 == l2.size() & &countl3 == l3.size())
            ans = 1
            else if(countl2 == l2.size() & &countl3 == l3.size())
            {
                        counter = 0
                        i = l1.size()-1
                        while(l1[i] == '1' & &i >= 0)
                            {
                            counter++
                            i--
                            }
                            ans = countl1-counter+1
                }

            else if(countl3 == l3.size())
            {
                    counter = 0
                    i = l2.size()-1
                    while(l2[i] == '1' & &i >= 0)
                    {
                        counter++
                        i--
                        }
                    ans = countl1+(n-1)*countl2+(countl2-counter+1)
                }
            else
            {
                counter = 0
                i = l3.size()-1
                while(l3[i] == '1' & &i >= 0)
                {
                        counter++
                        i--
                    }
                ans = countl1+n*countl2+(countl3-counter+1)
                }
            cout << ans << endl
            }
        return 0
    }
