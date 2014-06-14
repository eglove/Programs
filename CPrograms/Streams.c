#include <stdio.h>

main() {
	
	FILE *fpt;
	fpt=fopen("data.txt", "w");
	fprintf(fpt, "Fortytwo 42 bytes of data on the wall...");
	fclose(fpt);
}