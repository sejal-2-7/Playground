#include<iostream>
using namespace std;
int main()
{
  string door;
  cin >> door;
  int rail;
  cin >> rail;
  if(door == "front"){
  	if(rail == 1)
      cout << "Left Handed";
    else
      cout << "Right Handed";
  }
  else{
  	if(rail == 1)
      cout << "Right Handed";
    else
      cout << "Left Handed";
  }
  //Type your code here.
}