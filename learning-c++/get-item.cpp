#include <iostream>
#include <list>
#include <iterator>

int main() {
    std::list<int> myList = {10, 20, 30, 40, 50};

    // Accessing element at index 2
    auto it = myList.begin();
    std::advance(it, 20);
    std::cout << "Element at index 2: " << *it << std::endl;

    return 0;
}
