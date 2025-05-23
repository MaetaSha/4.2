#include <stdio.h>

int main() {
    int number;
    long long int fact = 1;
    int j = 1;
    printf("Enter a number to find factorial: ");
    scanf("%d", &number);

    for (int i = number; i > 0; i--) {
        printf("Factorial in iteration %d is : %lld * %d = %lld\n", j, fact, i, fact);
        fact = fact * i;
        j++;
    }

    printf("\n%d! = %lld\n", number, fact);

    return 0;
}

