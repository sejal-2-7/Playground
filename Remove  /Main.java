#include <bits/stdc++.h> 
using namespace std; 
  
string removeWord(string str, string word)  
{ 
    
    if (str.find(word) != string::npos) 
    { 
        size_t p = -1;
        string tempWord = word + " "; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
  
        tempWord = " " + word; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
    } 
  
    // Return the resultant string 
    return str; 
} 
  
// Driver Code 
int main(int argc, char const *argv[])  
{ 
    
  
    // Test Case 4: 
    // If the word is not present 
    string string4; 
    getline(cin, string4);
  
    string word4 = "the";
    cout<< removeWord(string4, word4);
    return 0; 
} 