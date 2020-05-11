#include<iostream>
using namespace std;
int main(){
	int a;
  	int b;
  	cin >> a >> b;
  	int sum = a + b;
  	int diff = a - b;
  	int product = a * b;
  	int quotient = a / b;
  	int remain = a % b;
  	cout << "a+b=" << sum << "\n";
  	cout << "a-b=" << diff << "\n";
  	cout << "a*b=" << product << "\n";
  	cout << "a/b=" << quotient << "\n";
  	cout << "a%b=" << remain << "\n";
}