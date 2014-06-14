/* Demonstrating the const type qualifier */
#include <stdio.h>

void tryToModifyArray(const int []);

main()
{
  int a[] = {10, 20, 30};

  tryToModifyArray(a);
  printf("%d %d %d\n", a[0], a[1], a[2]);
  return 0;
}

void tryToModifyArray(const int b[])
{
  b[0] /= 2;  /* error */
  b[1] /= 2;  /* error */
  b[2] /= 2;  /* error */
}
