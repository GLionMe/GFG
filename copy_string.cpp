#include<iostream>
using namespace std;

void copy(char s1[], char s2[], int i) {
  if(s1[i] == '\0') {
    s2[i] = '\0';
    return;
  }

  s2[i] = s1[i];
  copy(s1, s2, i + 1);
}

int main()
{
  char s[] = "hello";
  char ss[] = "geeksforgeeks";

  copy(s, ss, 0);
  printf("%s\n", ss);
}
