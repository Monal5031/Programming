#include "bits/stdc++.h"
 
using namespace std;
 
#define lli long long int
#define li long int
#define c_n(a,b) check_node(a, b)
#define mx(a,b) max(a,b)
#define mn(a,b) min(a,b)
#define c_c(a,b,c) check_collinear(a, b, c)
#define c_o(a,b,c) check_overlap(a, b, c)
#define inone(a) cin>>a
#define innodes() cin>>x11.x>>x11.y>>x12.x>>x12.y>>x21.x>>x21.y>>x22.x>>x22.y
#define yeah() cout<<"yes\n"
#define nah() cout<<"no\n"
 
struct node {
    lli x;
    lli y;
};
 
bool check_node(node a, node b) {
    return (a.x == b.x && a.y == b.y)? true : false;
}
 
bool check_overlap(node a, node b, node c) {
    if (b.x <= mx(a.x, c.x) && b.x >= mn(a.x, c.x) && b.y <= mx(a.y, c.y) && b.y >= mn(a.y, c.y))
       return true;
    return false;
}
 
int check_collinear(node a, node b, node c) {
    lli tmp = (b.y - a.y) * (c.x - b.x) - (b.x - a.x) * (c.y - b.y);
    if (tmp == 0) return 0;
    return (tmp > 0)? 1: 2;
}
 
int solve(node x11, node x12, node x21, node x22) {
    int temp1 = c_c(x11, x12, x21);
    int temp2 = c_c(x11, x12, x22);
    int temp3 = c_c(x21, x22, x11);
    int temp4 = c_c(x21, x22, x12);
    if (temp1 != temp2 && temp3 != temp4) 
        return 1;
    if (temp1 == 0 && c_o(x11, x21, x12) || temp2 == 0 && c_o(x11, x22, x12) || temp3 == 0 && c_o(x21, x11, x22) || temp4 == 0 && c_o(x21, x12, x22)) return 2;
    return 0;
}
 
int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    li tc;
    inone(tc);
    while (tc--) {
        node x11, x12, x21, x22;
        innodes();
        int tmp = solve(x11, x12, x21, x22);
        if (tmp == 2)
            yeah();
        else if (tmp == 0)
            nah();
        else {
            if (c_n(x11,x21) || c_n(x11,x22) || c_n(x12,x21) || c_n(x12,x22))
                yeah();
            else
                nah();
        }
    }
    return 0;
}
