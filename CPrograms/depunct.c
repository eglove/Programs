#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[]) {

	char in[80], out[80];
	int i, j;
	
	while(1) {
		scanf("%s", in);
		if(strcmp(in, ".") == 0)
			break;
		strcpy(out, in);
		for(i = 0; i < strlen(out); i++)
			if(out[i] == '.' || out[i] == ',' ||
			   out[i] == '"' || out[i] == ';' ||
			   out[i] == '!' || out[i] == '?' ||
			   out[i] == '(' || out[i] == ')' ||
			   out[i] == ':') {
		
			for(j = i; j < strlen(out) - 1; j++)
				out[j] = out[j + 1];
			out[j] = '\0';
		}
		printf("%s\n", out);
	}
}