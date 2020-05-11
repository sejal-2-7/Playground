#include<bits/stdc++.h>
using namespace std;
int main(){
	int a, b;
  cin >> a >> b;
  int req;
  cin >> req;
  int have = pow(a,b);
  if(have >= req)
    cout << "Doctor, you can proceed with your experiment.";
  else
    cout << "Sorry Doctor! You need more bacteria.";
}