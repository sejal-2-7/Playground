#include<iostream>
using namespace std;
int main(){
	int a, b;
  	cin >> a >> b;
  cout << "Before swapping a= " << a << " and b=" << b<<"\n";
  int &one = a;
  int &two = b;
  int temp = one;
  one = two;
  two = temp;
  cout << "After swapping a= " << a << " and b=" << b;
}