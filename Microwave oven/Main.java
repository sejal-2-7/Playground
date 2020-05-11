#include<iostream>
using namespace std;
int main()
{
  int num; 
  float time;
  cin >> num >> time;
  if(num == 2){    time += time/2;
               cout << time;}
  else if(num == 3){
    time *= 2;
  cout << time;}
  else if (num > 3)
  	cout << "Number of items is more";
  //Type your code here.
}