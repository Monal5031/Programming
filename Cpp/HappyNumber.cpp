/*
Check whether a number is a happy number, and print the first k happy numbers from this number.
A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits,
and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Th
ose numbers for which this process ends in 1 are happy numbers, while those that do not end in 1 are unhappy numbers.
If a number is happy, then all members of its sequence are happy
if a number is unhappy, all members of the sequence are unhappy.
*/


# include<iostream>
# include<vector>
using namespace std

long long int Add(long long int num) // Add the digits of number
{
    long long int naya = 0
    while(num)
    {
        int bit = num % 10
        naya += bit
        num /= 10
        }
    return naya
}

int finder(vector < long long int > numbers, long long int num) // find if number has already been encountered
{
    for(long long int i=0
        i < numbers.size()
        i++)
    if(num == numbers.at(i))
    return 1
    return 0
}

bool happyHaiKya(long long int num, vector < long long int > numbers) // Check if number is happy
{
    if(num == 1)
    return true
    while(finder(numbers, num) != 1)
    {
        numbers.push_back(num)
        num = Add(num)
        if(num == 1)
        return true
        }
    return false
}

void printKarN(long long int k, long long int start) // print k happy numbers from number provided by user
{
    cout << "Happy numbers are:\n";
    vector < long long int > numbers;
    while(k)
    {
        if(happyHaiKya(start, numbers))
        {
            cout << start << " ";
            k--;}
        start++;
        numbers.clear();}
}

int main() // Runner function
{
    std: : ios: : sync_with_stdio(false);
    vector < long long int > numbers;
    loop:
    cout << "1.Check a Happy number\n2.Print First N happy numbers\n";
    int choice;
    cin >> choice;
    switch(choice)
    {
        case 1:
        cout << "Enter The number for checking\n";
        long long int num;
        cin >> num;
        if(happyHaiKya(num, numbers))
        cout << "Yeah! Number is happy\n";
        else
        cout << "Shit! It isn't happy\n";
        break;
        case 2:
        cout << "Enter how many happy numbers you wish to print and from which number onwards to start\n";
        long long int n, start;
        cin >> n >> start;
        printKarN(n, start); }
    cout << endl << "You want to continue? Enter 1 for yes. 0 for no" << endl;
    cin >> choice;
    if(choice == 1)
        goto loop;
    return 0;}
