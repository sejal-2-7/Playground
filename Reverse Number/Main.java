#include <iostream>
using namespace std;
int main() 
{
	int num, reverse=0, remainder;
  cin >> num;
  while(num != 0){
  	remainder = num % 10;
    reverse = reverse * 10 + remainder;
    num /= 10;
  }
  cout << reverse;
  // Type your code here
	return 0;
}