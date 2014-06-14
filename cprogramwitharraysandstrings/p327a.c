/* Using atoi */
#include <stdio.h>
#include <stdlib.h>

main()
{
  int i;

  i = atoi("2593");
  printf("%s%d\n%s%d\n",
         "The string \"2593\" converted to int is ", i,
         "The converted value minus 593 is ", i-593);
  return 0;
}
