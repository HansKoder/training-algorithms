#include <iostream>
#include <list>

int main() {
    // Create an empty list of integers
    std::list<int> myList;

    // Add elements to the list
    myList.push_back(10);
    myList.push_back(20);
    myList.push_back(30);

    // Print the elements of the list using iterators
    std::cout << "Elements of the list: ";
    for (auto it = myList.begin(); it != myList.end(); ++it) {
        std::cout << *it << " ";
    }
    std::cout << std::endl;

    // Remove an element from the list
    myList.pop_front();

    // Print the elements of the list again
    std::cout << "Elements after removing the first element: ";
    for (auto it = myList.begin(); it != myList.end(); ++it) {
        std::cout << *it << " ";
    }
    std::cout << std::endl;

    return 0;
}
