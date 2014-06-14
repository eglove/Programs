/* Using atoi */
#include <stdio.h>
#include <stdlib.h>

main()
{
  long l;
  
  l = atol("1000000");
  printf("%s%ld\n%s%ld\n",
         "The string \"1000000\" converted to long int is ", l,
         "The converted value divided by 2 is ", l / 2);
  return 0;
}
