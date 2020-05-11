#include<iostream>
using namespace std;
int main()
{
	int d1, c1, d2, c2, dollars, cents;
  cin >> d1 >> c1 >> d2 >> c2;
  dollars = d1+d2;
  cents = c1+c2;
  if(cents >= 100)
    dollars += cents / 100;
  cents = cents % 100;
  cout << dollars << "\n" << cents ;
  return 0;
  //Type your code here.
}