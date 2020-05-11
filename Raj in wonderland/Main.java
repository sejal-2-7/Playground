#include<iostream>
using namespace std;
int main(){
int steps;
  cin >> steps;
  string yes = (steps%2==0)?"Possible":"Not possible";
  cout << yes;
  return 0;
}