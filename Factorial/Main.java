#include<iostream>
using namespace std;
long factorial(int n){
 if(n >= 1)
   return n * factorial(n-1);
  else
    return 1;
}
int main()
{
  int n;
  cin >> n;
   cout << "The factorial of " << n << " is " << factorial(n);
  //Type your code here.
}