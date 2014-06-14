#include <stdio.h>
#define ROWS 5
#define COLS 10

int multi[ROWS][COLS];

int main(void)
{
  int row, col;
  for (row=0; row < ROWS; row++)
  {
    for (col=0; col < COLS; col++)
    {
      multi[row][col] = row*col;
    }
  }

  printf("\n");
  for (row=0; row < ROWS; row++)
  {
    for (col=0; col < COLS; col++)
    {
      printf("%3d ", multi[row][col]);
    }
    printf("\n");
  }

  printf("\n");
  for (row=0; row < ROWS; row++)
  {
    for (col=0; col < COLS; col++)
    {
      printf("%3d ", *(*(multi + row) + col));
    }
    printf("\n");
  }
  return 0;
}
