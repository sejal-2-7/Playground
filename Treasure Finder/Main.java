#include<iostream>
using namespace std;
int main()
{
  int b1, b2, b3, small;
  
  cin >> b1 >> b2 >> b3;
  if((b1 > b2 && b1 < b3) || (b1 > b3 && b1 < b2)) {
    cout << "The treasure is in box which has number " << b1 << "\n";
  	if(b2>b3)
  		small = b3;
  else
  		small = b2;}
  else if((b2 > b1 && b2 < b3) || (b2 > b3 && b2 < b1)) {
    cout << "The treasure is in box which has number " << b2 << "\n";
   if(b3>b1)
  		small = b1;
  else
  		small = b3; 		}
  else if((b3 > b1 && b3 < b2) || (b3 > b2 && b3 < b1))  {
    cout << "The treasure is in box which has number " << b3 << "\n";
  if(b2>b1)
  		small = b1;
  else
  		small = b2;		}
   
  if(b1 % small == 0 && b2 % small == 0 && b3 % small == 0) 
    cout << "The code to open the box is " << small;
  else
    cout << "The code to open the box is 1";
  //Type your code here.
}