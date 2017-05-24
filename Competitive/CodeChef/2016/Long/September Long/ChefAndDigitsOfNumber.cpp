# include<iostream>
# include<string.h>
    using namespace std
    int main()
    {
         long int test, i, len, zero, one
         char digit[100001]
         cin >> test
         while(test--)
         {
              cin >> digit
             len = 0
             zero = 0
             one = 0
             for(i=0
                 digit[i] != '\0'
                 i++)
             {
              len++
              if(digit[i] == '1')
              one++
                 else
                 zero++
                 }
             if((one >= 1 & & zero == 1) | | (zero >= 1 & & one == 1) | | (len == 1))
             cout << "Yes\n"
             else
             cout << "No\n"
             }
        return 0
    }
