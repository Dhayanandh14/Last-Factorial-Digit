#include <iostream>
#include<string.h>
using namespace std;
int main() {
    int n;
    cin>>n;
    int a,tot;
    for(int i=0;i<n;i++){
      cin>>a;
      tot=1;
      for(int j=a;j>=1;j--) {
          tot=tot*j;
      }
      if(tot<=10){
          cout<<tot<<endl;
      }
      else{
        cout<<tot%10<<endl;
      }
    }
}
