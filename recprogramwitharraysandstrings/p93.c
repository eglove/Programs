#include <stdio.h>
int main(int argc, char *argv[])
{
  int i,j;
  for (i=0; i<argc; i++)
  {
    j=0;
    while (argv[i][j] != '\0') 
    {
      printf("%c",argv[i][j]);
      j++;
    }
    printf("\n");
  }
  printf("argc = %d\n",argc);
  printf("**********************\n");
  for (i=0; i<argc; i++)
    printf("%s\n",argv[i]);
  printf("argc = %d\n",argc);
}
