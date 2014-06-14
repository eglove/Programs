char *my_strcpy(char *destination, char *source)
{
  char *p = destination;
  while (*source != '\0')
  {
    *p++ = *source++;
  }
  *p = '\0';
  return destination;
}

int main(void)
{
  char strA[80] = "abcdefghijklmnopqrstuvwxyz";
  char strB[80];
  my_strcpy(strB, strA);
  puts(strB);
}
