#include <stdio.h>
#include <string.h>

int main() {
    char input[1000];
    int start, end, isPalindrome = 1;

    printf("Enter a number or string: ");
    scanf("%s", input);

    start = 0;
    end = strlen(input) - 1;

    while (start < end) {
        if (input[start] != input[end]) {
            isPalindrome = 0;
            break;
        }
        start++;
        end--;
    }

    if (isPalindrome) {
        printf("Palindrome\n");
    } else {
        printf("Not Palindrome\n");
    }

    return 0;
}

