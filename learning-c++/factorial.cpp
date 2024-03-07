#include <iostream>

// Recursive function to calculate the factorial of a non-negative integer
unsigned long long factorial(int n) {
    // Base case: factorial of 0 is 1
    if (n == 0) {
        return 1;
    }
    // Recursive case: n! = n * (n-1)!
    else {
        return n * factorial(n - 1);
    }
}

int main() {
    int n;
    std::cout << "Enter a non-negative integer: ";
    std::cin >> n;

    // Check if the input is valid
    if (n < 0) {
        std::cerr << "Error: Please enter a non-negative integer." << std::endl;
        return 1;
    }

    // Calculate and print the factorial
    unsigned long long result = factorial(n);
    std::cout << "Factorial of " << n << " is: " << result << std::endl;

    return 0;
}
