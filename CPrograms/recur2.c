#include <stdio.h>
#include <string.h>

void reverse(char *str) {
	
	int n; int i;
	n = strlen(str);
	char new[80];
	
	for(i = 1; i <= n; i++) {
		strncpy(new, str, n - i);
		printf("%c", str[n - i]);
	}
}

int main() {
	char s[80];
	printf("Enter a non-whitespace string: ");
	scanf(" %s", s);
	reverse(s);
}