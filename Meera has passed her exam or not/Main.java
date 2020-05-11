#include<iostream>
using namespace std;
int main()
{
  int n;
  cin >> n;
  int num[n];
  for(int i=0; i<n; i++)
    cin >> num[i];
  int meera;
  cin >> meera;
  for(int j=0; j<n; j++){
  	if(num[j] == meera){
      cout<< "She passed her exam";
    	return 0;}
  }
  cout << "She failed";
  return 0;
  // Type your code here
}