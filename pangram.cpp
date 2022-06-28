#include <iostream>
#include <vector>
#include <cctype>
using namespace std;

int getIndex(char ch) {
  if(ch >= 'a' && ch <= 'z')
    return ch - 'a';

  if(ch >= 'A' && ch <= 'Z')
    return ch - 'A';

  return -1;
}

bool isPangran(string str) {
  std::vector<int> v(26, 0);

  for(char ch: str) {
    if(isalpha(ch)) {
      v[getIndex(ch)]++;
    }
  }

  for(int i: v) {
    if(i == 0)
      return false;
  }

  return true;
}

int main() {
  string str = "The quick brown fox jumps over the lazy do.";
  std::cout << isPangran(str) << '\n';
}
