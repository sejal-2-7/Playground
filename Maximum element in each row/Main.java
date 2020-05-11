#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int A[r][c];
  int rs[r];
  for(int i=0; i<r; i++)
  {
    for(int j=0; j<c; j++)
    {
      cin>>A[i][j];
    }
  }
  int maxi=0;
   for(int i=0; i<r; i++)
  {
     for(int j=0; j<c; j++)
     {
      if(maxi<A[i][j])
      {
        maxi=A[i][j];
      }
    }
     rs[i]=maxi;
     maxi=0;
  }
  for(int i=0;i<r;i++)
  {
    cout<<rs[i]<<"\n";
  }
}