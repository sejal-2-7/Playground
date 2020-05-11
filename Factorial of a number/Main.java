#include<iostream>
using namespace std;
int main(){
  int num, fact=1;
  cin >> num;
  for(int i=num; i > 0; --i){
    fact *= i;
  }
  cout << fact;
  // Type your code here
}