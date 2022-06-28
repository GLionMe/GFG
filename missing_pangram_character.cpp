#include <iostream>
#include <vector>
#include <cctype>
using namespace std;

int getIndex(char ch) {
  if(ch >= 'a' && ch <= 'z')
    return ch - 'a';
  else if(ch <= 'A' && ch >= 'Z')
    return ch - 'A';

  return -1;
}

string getMissingCharacters(string& str) {
  vector<bool> v(26, false);
  string ans;
  for(char ch: str) {
    if(isalpha(ch)) {
      v[getIndex(ch)] = true;
    }
  }

  for(int i = 0;i < 26;++i) {
    if(!v[i]) {
      ans.push_back(i + 'a');
    }
  }

  return ans;
}

int main() {
  string str = "the quick brown fox jumps over lazy.";
  cout  << getMissingCharacters(str) << endl;
}
