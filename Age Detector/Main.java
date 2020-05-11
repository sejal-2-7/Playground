#include<iostream>
using namespace std;
int main()
{
  int birth, cur;;
  cin >> birth;
  cin >> cur;
  if(cur < birth)
  		cur = cur + 100;
  cout << cur-birth;
  return 0;
  //Type your code here.
}