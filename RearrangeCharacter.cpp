#include <iostream>
using namespace std;

int getCharNotEqual(string str, char ch, int j) {
  for(int i = j + 1;i < str.size();i++) {
    if(str[i] != ch)
      return i;
  }

  return -1;
}

void swap(string& str, int i, int j) {
  char ch = str[i];
  str[i] = str[j];
  str[j] = ch;
}

bool rearrange(string& s) {
  int n = s.size();
  for(int i = 1;i < n;++i) {
    if(s[i] == s[i - 1]) {
      int j = getCharNotEqual(s, s[i], i);
      if(j < 0)
        return false;

      swap(s, i, j);
    }
  }

  return true;
}

int main(int argc, char const *argv[]) {
  string str = "aaaabc";
  bool success = rearrange(str);
  if(success) {
    std::cout << str << '\n';
  } else {
    std::cout << "not possible" << '\n';
  }
  return 0;
}
