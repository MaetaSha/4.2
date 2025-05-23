#include <stdio.h>

int calculateSum(int arr[], int n) {
    int sum = 0, i = 0;
    do {
        sum += arr[i];
        i++;
    } while(i < n);
    return sum;
}

float calculateAverage(int sum, int n) {
    return (float)sum / n;
}

int main() {
    int arr[100], n, i;
    int sum;
    float avg;
    printf("Enter number of elements: ");
    scanf("%d", &n);
    printf("Enter %d elements:\n", n);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    sum = calculateSum(arr, n);
    avg = calculateAverage(sum, n);
    printf("Sum = %d\n", sum);
    printf("Average = %.2f\n", avg);

    return 0;
}
