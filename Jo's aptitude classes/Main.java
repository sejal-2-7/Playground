#include<iostream>
using namespace std;
int main(){
	int num1, num2, num3;
  cin >> num1 >> num2 >> num3;
 int ans;
  cin >> ans;
int d,i;
d=1;
i=1;
while(i<=num1&&i<=num2&&i<=num3){
if(num1%i==0&&num2%i==0&&num3%i==0)
d=i;
i++;
}
  if(d == ans)
    cout << "Answer is correct.";
  else
    cout << "Answer is wrong.";


}