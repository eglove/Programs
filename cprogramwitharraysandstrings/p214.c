/* Histogram printing program */
#include <stdio.h>
#define SIZE 10

main()
{
  int n[SIZE] = {19, 3, 15, 7, 11, 9, 13, 5, 0, 1};
  int i, j;

  printf("%s%13s%17s\n", "Element", "Value", "Histogram");

  for (i=0; i<=SIZE - 1; i++) { 
    printf("%7d%13d     ", i, n[i]);

    for (j=1; j<=n[i]; j++)
      printf("%c", '*');
 
    printf("\n");
  }

  return 0;
}
