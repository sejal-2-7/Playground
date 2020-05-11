#include<iostream>
using namespace std;
int main()
{
  int rc;
  cin>>rc;
  int A[rc][rc];
  int ltr=0;
  int rtl=0;
  for(int i=0; i<rc; i++)
  {
    for(int j=0; j<rc; j++)
    {
      cin>>A[i][j];
    }
  }
  for(int i=0; i<rc; i++)
  {
    for(int j=0; j<rc; j++)
    {
      if(i==j)
      {
        rtl += A[i][j];
      }
      if((i+j)==(rc-1))
      {
        ltr += A[i][j];
      }
    }
  }
  if(ltr==rtl)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}