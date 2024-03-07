#include <iostream>

void incrementCount (int &count) {
    count = count + 1;
}

int main() {
    int count = 0;
    
    incrementCount(count);
    incrementCount(count);

    std::cout << "Pass by value ";
    std::cout << "Count \n";
    std::cout << count;
    std::cout << "\n \n";

    return 0;
}
