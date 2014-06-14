#include <stdio.h>
#include <sys/stat.h> // Needed for stat function

int main(int argc, char *argv[]) {
	
	struct stat fileinfo; // Returned info about file.
	int i;
	
	if(argc != 2) {
		printf("Usage: statfile filename\n");
	}
	
	i = stat(argv[1], &fileinfo);
	if(i == -1) {
		printf("Unable to stat %s\n", argv[1]);
	}
	
	printf("size: %d\n", fileinfo.st_size);
	printf("permissions: %d\n", fileinfo.st_mode);
	printf("last modified: %d\n", fileinfo.st_mtime);
	
	for(i = 9; i >= 0; i--)
		if(fileinfo.st_mode & (1 << i))
			printf("1");
		else
			printf("0");
	printf("\n");
}