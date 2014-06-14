#include <stdio.h>
#include <stdarg.h>

main() {

	int A[100];
	char search = 'y';
	int i, key, len, imin, imax;
	char *KEY_NOT_FOUND = "Not Found! :-(";
	char *result;

	printf("Welcome to Binary Search!");
	scanf("%d", &len);
	
	for(i = 0; i < len; i++) {
		scanf("%d", &A[i]);
	}
	
	imin = 0;
	imax = len - 1;
	
	while(search == 'y') {
		printf("\nDo you want to search for an integer? (y/n) ");
		scanf("%c", &search);
		
		printf("\nEnter the integer: ");
		scanf("d", &key);
		
		result = binary_search(A[], key, imin, imax);
		
		if(result == KEY_NOT_FOUND)
			printf("%d %c", key, result);
		else
			printf("%d Found! :-)", key);
	}
	
	
}

int binary_search(int A[], int key, int imin, int imax) {
	
	// Test if array is empty
	if(imax < imin)
		// Set is empty, so return value showing not found.
		return KEY_NOT_FOUND;
	else {
		// Calculate midpoint to cut set in half
		int imid = midpoint(imin, imax);
		
		// Three-way comparison
		if(A[imid] > key)
			// Key is in lower subset.
			return binary_search(A, key, imin, imid - 1);
		else if(A[imid] < key)
			// Key is in upper subset.
			return binary_search(A, key, imid + 1, imax);
		else
			// Key has been found.
			return imid;
	}
}