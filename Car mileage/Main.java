#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int petrol, dist;
  cin >> mileage;
  cin >> petrol;
  cin >> dist;
  if((mileage * petrol)>=dist)
    cout << "Can reach";
  else
    cout << "Cannot reach";
  //Type your code here.
}