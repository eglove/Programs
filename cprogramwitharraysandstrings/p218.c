/* Static arrays are initialized to zero. */
#include <stdio.h>

void staticArrayInit(void);
void automaticArrayInit(void);

main()
{
  printf("First call to each function:\n");
  staticArrayInit();
  automaticArrayInit();
  printf("\n\nSecond call to each function:\n");
  staticArrayInit();
  automaticArrayInit();
  printf("\n");
  return 0;
}

/* function to demonstrate a static local array */
void staticArrayInit()
{
  static int a[3];
  int i;

  printf("\nValues on entering static ArrayInit:\n");
  
  for (i=0; i<=2; i++)
    printf("array1[%d] = %d  ",i,a[i]);

  printf("\nValues on exiting staticArrayInit:\n");

  for (i=0; i<=2; i++)
    printf("array1[%d] = %d  ",i,a[i] += 5);
}

/* function to demonstrate an automatic local array */
void automaticArrayInit(void)
{
  int a[3] = {1, 2, 3};
  int i;

  printf("\n\nValues on entering automaticArrayInit:\n");

  for (i=0; i<=2; i++)
    printf("array1[%d] = %d  ",i,a[i]);

  printf("\nValues on exiting automaticArrayInit:\n");

  for (i=0; i<=2; i++)
    printf("array1[%d] = %d  ",i,a[i] += 5);
}
