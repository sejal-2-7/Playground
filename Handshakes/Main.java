#include<iostream>
using namespace std;
int main()
{
  int students, handshakes;
  cin >> students;
  handshakes = students * (students - 1) / 2;
  cout << handshakes;
  //Type your code here.
}