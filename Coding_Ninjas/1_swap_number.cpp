#include <bits/stdc++.h> 
#include <utility>

pair < int, int > swap(pair < int, int > swapValues) {     
    // Write your code here.
    
   pair < int, int >ans;
   int temp=swapValues.first;
   swapValues.first=swapValues.second;
   swapValues.second=temp;
   return swapValues;
}
