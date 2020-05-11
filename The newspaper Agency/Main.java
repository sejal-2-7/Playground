#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,x,y;
  cin >> w ;
  cin >> x;
  cin >> y;
  int profits = w * (x-y) - 100;
  cout << profits;
}