#include<iostream>
using namespace std;
int main()
{
  int row, column;
  cin >> row >> column;
  int m1[row][column], m2[row][column], sum[row][column];
  for(int i=0; i<row; i++){
  	for(int j=0; j<column; j++){
    	cin >> m1[i][j];
    }
  }
  for(int i=0; i<row; i++){
  	for(int j=0; j<column; j++){
    	cin >> m2[i][j];
    }
  }
  for(int i=0; i<row; i++){
  	for(int j=0; j<column; j++){
    	sum[i][j] = m1[i][j] +  m2[i][j];
    }
  }
   for(int i=0; i<row; i++){
  	for(int j=0; j<column; j++){
    	cout << sum[i][j] << " " ;
    }
     cout << "\n";
  }
  
    // Type your code here
}