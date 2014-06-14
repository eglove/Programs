/* Initializing an array with a declaration */
#include <stdio.h>

main()
{
  int i, n[10] = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

  printf("12345678901234567890123456789\n");
  printf("%s%13s\n","Element", "Value");

  for (i=0; i<=9; i++)
    printf("%7d%13d\n", i, n[i]);
 
  return 0;
}
