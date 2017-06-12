# include"bits/stdc++.h"
# include<stdio.h>

using namespace std

int main() {
    ios: : sync_with_stdio(false);
    int tc;
    cin >> tc;
    string game;
    while (tc--) {
        cin >> game;
        long long int answer = 0;
        long long int bundle = 0;
        for (int i=0; i < game.length(); ) {
            long long int moves = 0;
            if (game[i] == '1') {
                while (game[i] == '1'&&i < game.length()) {bundle++; i++;}
                while (game[i] == '0'&&i < game.length()) {moves++; i++;}
                if(moves != 0)
                answer += (bundle * (moves+1)); }
            else {
                i++;}
        }
        printf("%lld\n", answer); }
    return 0;}
