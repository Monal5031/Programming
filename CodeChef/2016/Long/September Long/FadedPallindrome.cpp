# include<iostream>
# include<string.h>
using namespace std

int main()
{
    int t
    cin >> t
    char str[12346]
    while(t--)
    {
        cin >> str
        int i = 0
        int j = strlen(str)-1
        int f = 1
        while(i < j)
        {
            if((str[i] != '.') & &(str[j] != '.'))
            {
                if(str[i] != str[j])
                {
                    f = 0
                    break
                    }
                i++
                j--
                }
            else
            {
                if(str[i] == '.' & &str[j] == '.')
                {
                    str[i] = 'a'
                    str[j] = 'a'
                    i++
                    j--
                    }
                else if(str[i] == '.')
                {
                    str[i] = str[j]
                    i++
                    j--
                    }
                else if(str[j] == '.')
                {
                    str[j] = str[i]
                    i++
                    j--
                    }
                }
            }
        if(i == j & &str[i] == '.')
        str[i] = 'a'
        if(f == 0)
        cout << -1 << "\n"
        else
        cout << str << "\n"
        }
    return 0
}
