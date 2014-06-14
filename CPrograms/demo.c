#include <stdio.h>

main() {

	char byte;
	FILE *fpt;
	fpt = fopen("data.txt", "r");
	fread(&byte, 1, 1, fpt);
	fclose(fpt);
}