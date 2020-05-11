#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int A[r][c];
  int rs[c];
  for(int i=0; i<r; i++)
  {
    for(int j=0; j<c; j++)
    {
      cin>>A[i][j];
    }
  }
  int m = -100;
  for(int i=0; i<r; i++)
  {
    for(int j=0; j<c; j++)
    {
      if(m<A[i][j])
      {
        m = A[i][j];
      }
    }
  }
  cout<<"The maximum element is "<<m;
}