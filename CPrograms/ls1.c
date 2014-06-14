#include <stdio.h>
#include <dirent.h>

int main(int argc, char *argv[]) {

	DIR *directory; // The directory
	struct dirent *entry; // Each entry
	
	directory = opendir(".");
	if(directory == NULL) {
		printf("Unable to open directory.\n");
	}
	while(1) {
		entry = readdir(directory);
		if(entry == NULL)
			break;
		printf("%s\n", entry -> d_name);
	}
	closedir(directory);
}