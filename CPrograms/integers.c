#include <stdio.h>
#include <stdlib.h>

int integers(int listsize,int **list)
	{
	int i;
	*list=(int *)malloc(listsize*sizeof(int));
	if(*list == NULL)
		return(0);
	for(i=0; i<listsize; i++)
		(*list)[i]=10+i; /* mixed array/pointer syntax */
	return(1);
	
int main(int argc, char *argv[])
	{
	int *numbers;
	int i;
	i=integers(3,&numbers);
	for(i=0; i<3; i++)
		printf("%d\n",numbers[i]);
	}