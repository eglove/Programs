#include <stdio.h>
#include <unistd.h>

main() {
	int i;
	
	printf("Read to fork...\n");
	i=fork();
	printf("fork returned %d\n", i);
	while(1);
}
