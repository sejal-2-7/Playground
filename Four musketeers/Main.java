#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1,y1,x2,y2,x3,y3;
  double x4,y4;
  cin>>x1;
  cin>>y1;
  cin>>x2;
  cin>>y2;
  cin>>x3;
  cin>>y3;
  float one = float(x1+x2+x3);
  float two = float(y1+y2+y3);
  x4 = one/3;
  y4 = two/3;
  cout<<x4<<"\n"<<y4;
}