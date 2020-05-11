#include<iostream>
using namespace std;
struct College {
  char name[100];
  char city[100];
  int ey;
  float pp;
};
int main()
{
  int n;
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  struct College clg[n];
  for(int i=0; i<n; i++)
  {
    cout<<"Enter the details of college "<<i+1<<endl;
    cout<<"Enter name"<<endl;
    cin>>clg[i].name;
    cout<<"Enter city"<<endl;
    cin>>clg[i].city;
    cout<<"Enter year of establishment"<<endl;
    cin>>clg[i].ey;
    cout<<"Enter pass percentage"<<endl;
    cin>>clg[i].pp;
  }
  cout<<"Details of colleges"<<endl;
  for(int i=0; i<n; i++)
  {
    cout<<"College:"<<i+1<<endl;
    cout<<"Name:"<<clg[i].name<<endl;
    cout<<"City:"<<clg[i].city<<endl;
    cout<<"Year of establishment:"<<clg[i].ey<<endl;
    cout<<"Pass percentage:"<<clg[i].pp<<endl;
  }
}