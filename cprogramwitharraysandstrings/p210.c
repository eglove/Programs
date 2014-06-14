/* Initialize the elements of array s to
   the even integers from 2 to 20 */

#include <stdio.h>
#define SIZE 10

main()
{
  int s[SIZE], j;

  for (j=0; j<=SIZE - 1; j++)
    s[j] = 2 + 2 * j;

  printf("123456789012345678901234567890\n");
  printf("%s%13s\n", "Element", "Value");

  for (j=0; j<=SIZE - 1; j++)
    printf("%7d%13d\n", j, s[j]);

  return 0;
}
