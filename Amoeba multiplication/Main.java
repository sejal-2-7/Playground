#include<iostream>
using namespace std;
int main()
{
  int size;
  int n1, n2 = 1, n3, i;
  cin >> size;
 for(i=2; i<size; ++i){
 	n3 = n1+n2;
   n1 = n2;
   n2 = n3;
 }
  cout << n3;
  //Type your code here.
}