#include <stdio.h>

main()
{
	double array[5];
	double *d_ptr;
	double value;
	int i,offset;
	
	for(i=0; i<5; i++)
		array[i]=(double)i+10.0; /* fill array with #'s */
		
	d_ptr=&(array[0]);
	
	while(1)
		{
		printf("Address(hex)\tAddress(base10)\tValue\n");
		for(i=0; i<5; i++)
			printf("%p\t%u\t%lf\n",&(array[i]),&(array[i]),array[i]);
		printf("Enter offset value (0 0 to quit): ");
		scanf("%d %lf",&offset,&value);
		if(offset == 0 && value == 0.0)
			break; /* break out of loop */
		if(offset < 0 || offset > 4)
			{
			printf("Offset out of bounds\n");
			continue; /* go back to start of loop */
			}
			/* three ways to do the same thing */
		array[offset]=value; /* using array syntax */
		*(d_ptr+offset)=value; /* using pointer syntax */
		*(array+offset)=value; /* using mixed syntax */
		}
}