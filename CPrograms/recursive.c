#include <stdio.h>

void reverse(char *str) {

	if(*str) {
		reverse(str+1);
		printf("%c", *str);
	}
}

int main() {
	char s[80];
	printf("Enter a non-whitespace string: ");
	scanf(" %s", s);
	reverse(s);
}