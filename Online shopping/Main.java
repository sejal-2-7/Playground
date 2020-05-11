#include<iostream>
using namespace std;
int main()
{
  int fprice, fdiscount, fship;
  int sprice, sdiscount, sship;
  int aprice, adiscount, aship;
  
  cin >> fprice >> fdiscount >> fship;
  cin >> sprice >> sdiscount >> sship;
  cin >> aprice >> adiscount >> aship;
  
  int finalf = (fprice * (100 - fdiscount) / 100 ) + fship ;
  int finals = (sprice * (100 - sdiscount) / 100 ) + sship ;
  int finala = (aprice * (100 - adiscount) / 100 ) + aship ;
  cout << "In Flipkart Rs." << finalf << "\n";
  cout << "In Snapdeal Rs." << finals << "\n";
  cout << "In Amazon Rs." << finala << "\n";
  if(finalf <= finals && finalf <= finala)
    cout << "He will prefer Flipkart";
  else if(finals <= finalf && finals <= finala)
    cout << "He will prefer Snapdeal";
  else if(finala <= finals && finala <= finalf)
    cout << "He will prefer Amazon";
  //Type your code here.
}