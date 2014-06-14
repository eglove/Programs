#include <stdio.h>
main() {
	FILE *fpt;
	fpt = fopen("/dev/pty0", "w");
	fprintf(fpt, "Hello terminal.");
	fclose(fpt);
}