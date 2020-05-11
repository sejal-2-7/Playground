#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int weight, elderly, kids;
  cin >> weight;
  cin >> elderly;
  cin >> kids;
  int total = 75 * elderly + 30 * kids;
  if(total <= weight)
    cout << "Boat is stable";
  else
    cout << "Boat will drow";
}