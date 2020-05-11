#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int rows, columns, tree;
  cin >> rows;
  cin >> columns;
  cin >> tree;
  if(tree>rows && tree<=2*rows)
    cout << "It is a mango tree";
  else if(tree>(columns-2)*rows && tree<=(columns-1)*rows)
    cout << "It is a mango tree";
  else
    cout << "It is not a mango tree";
}