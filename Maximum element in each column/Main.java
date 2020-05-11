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
  int maxi=0;
   for(int i=0; i<c; i++)
  {
     for(int j=0; j<r; j++)
     {
      if(maxi<A[j][i])
      {
        maxi=A[j][i];
      }
    }
     rs[i]=maxi;
     maxi=0;
  }
  for(int i=0;i<c;i++)
  {
    cout<<rs[i]<<"\n";
  }
}