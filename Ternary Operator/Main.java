#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  cin>>num;
  string x = num%2==0 ? "Even": "Odd";
  cout << x;
}