#include<iostream>
using namespace std;
int main()
{
  int n;
  cin >> n;
  int marks[n];
  for(int i=0; i<n; i++){
  	std::cin >> marks[i];
  }
  int maxi = marks[0];
  for(int i=0; i<n; i++){
  	if(marks[i] > maxi)
      maxi = marks[i];
  }
   cout << maxi;
  return 0;
  // Type your code here
}