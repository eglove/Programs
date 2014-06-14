#include <stdio.h>

main() {
	char *names[] = {"Miller", "Jones", "Anderson"};
	printf("%c\n", *(*(names+1)+2));
	printf("%c\n", names[1][2]);
	
	int num;
	int *pi = &num;
	
	printf("Address of num: %d Value: %d\n", &num, num);
	printf("Address of pi: %d Value: %d\n", &pi, pi);
	printf("Address of pi: %x Value: %x\n", &pi, pi);
	printf("Address of pi: %o Value: %o\n", &pi, pi);
	printf("Address of pi: %p Value: %p\n", &pi, pi);
	printf("Value of pi: %p\n", (void*)pi);
}