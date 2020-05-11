#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1=3,y1=4;
  int x2,y2,steps=0;
  cin>>x2;
  cin>>y2;
  steps = x2-x1;
  if ((y2-y1)>steps){
  	steps = y2-y1;
  }
  cout<<steps;
}