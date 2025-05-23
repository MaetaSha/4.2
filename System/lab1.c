
#include <stdio.h>

int main() {
    double num1, num2, result;
    char op, equal;
    /*printf("Enter num1: ");
    scanf("%lf", &num1);
    printf("Enter +,-,*,/,%c: ", '%');

    scanf(" %c", &op);
    printf("Enter num2: ");
    scanf("%lf", &num2);
    printf("Enter =: ");
    scanf(" %c", &equal);*/

    printf("Enter expression: ");
    scanf("%lf %c %lf", &num1, &op, &num2);
    printf("Press '=' to get result: ");
    scanf(" %c", &equal);

    if (equal == '=') {
        switch (op) {
            case '+':
                result = num1 + num2;
                printf("%.1f%c%.1f=%.2lf\n", num1, op, num2, result);
                break;
            case '-':
                result = num1 - num2;
                printf("%.0lf%c%.0lf=%.2lf\n", num1, op, num2, result);
                break;
            case '*':
                result = num1 * num2;
                printf("%.0lf%c%.0lf=%.2lf\n", num1, op, num2, result);
                break;
            case '/':
                if (num2 != 0)
                    printf("%.0lf%c%.0lf=%.2lf\n", num1, op, num2, num1 / num2);
                else
                    printf("Error: Division by zero!\n");
                break;
            case '%':
                if ((int)num2 != 0)
                    printf("%d%%%d=%d\n", (int)num1, (int)num2, (int)num1 % (int)num2);
                else
                    printf("Error: Modulo by zero!\n");
                break;
            default:
                printf("Invalid operator!\n");
        }
    } else {
        printf("You did not press '='. No result displayed.\n");
    }

    return 0;
}

