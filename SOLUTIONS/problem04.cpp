/*
Author: Divya Gupta 
Problem 4
C++ Implementation
*/
#include<bits/stdc++.h> 
using namespace std;  
int main() 
{ 
    int a;
    cin>>a;
    if(a<=0)
    cout<<":(";
    else
    for(int i=1;i<=a;i++)
    {
        if(i%4==1)
        cout<<"+";
        else if(i%4==2)
        cout<<"-";
        else if(i%4==3)
        cout<<"*";
        else if(i%4==0)
        cout<<"/";
    }
    cout<<endl;
} 