#include<iostream>
using namespace std;
int main(){
int maz, wt;
  cin >> maz;
  cin >> wt;
  if(wt > maz)
    cout << "Sorry, you can't enter";
  else if(maz > wt)
    cout << "Yes, you can enter.";
  else
    cout << "Yes, you can enter. Kindly use a rope.";
}