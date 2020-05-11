#include<iostream>
using namespace std;
int main()
{
  int num, div, sum, temp;
  cin >> num;
  temp = num;
  while(num != 0){
  	div = num % 10;
    num = num /10;
    sum = sum + div;
  }
 	if(temp % sum == 0)
      cout << "Harshad Number";
  	else
      cout << "Not Harshad Number";
  //Type your code here.
}