#include<iostream>
using namespace std;
int main()
{
  int age;
  double time, cost;
  
  cin >> age >> time;
  if(age <= 13){
    if(time == 13.3)
      cost = 2.00;
    else
      cost = 4.00; }
  else{
  	if(time == 13.3)
  		cost = 5.00;
    else
      cost = 8.00;
  }
  cout << "$" << cost << ".00";
   	
  //Type your code here.
}