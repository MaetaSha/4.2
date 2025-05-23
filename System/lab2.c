#include <stdio.h>
#include <ctype.h>

int main() {
    int numbers[100], count = 0;
    char input[10];
    char op;

    printf("Enter even number of integers followed by an operator :\n");

    // Read input until we encounter a non-digit (likely operator)
    while (1) {
        scanf("%s", input);

        if (isdigit(input[0]) ||
           (input[0] == '-' && isdigit(input[1]))) {
            sscanf(input, "%d", &numbers[count]);
            count++;
        } else {
            op = input[0];
            break;
        }
    }

    if (count % 2 != 0) {
        printf("Error: Please enter an even number of integers.\n");
        return 1;
    }

    printf("Output:\n");
    for (int i = 0; i < count; i += 2) {
        int a = numbers[i];
        int b = numbers[i + 1];

        switch (op) {
            case '+':
                printf("%d ", a + b);
                break;
            case '-':
                printf("%d ", a - b);
                break;
            case '*':
                printf("%d ", a * b);
                break;
            case '/':
                if (b != 0)
                    printf("%d ", a / b);
                else
                    printf("ERR ");
                break;
            case '%':
                if (b != 0)
                    printf("%d ", a % b);
                else
                    printf("ERR ");
                break;
            default:
                printf("Invalid operator\n");
                return 1;
        }
    }

    printf("\n");
    return 0;
}
