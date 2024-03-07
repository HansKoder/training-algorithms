#include <iostream>
#include <vector>
#include <list>

std::list<int> merge (std::vector<int> numbers1, std::vector<int> numbers2)  {
    std::list<int> myList;

    int min = std::min(numbers1.size(), numbers2.size());

    int p1 = 0;
    int p2 = 0;

    for (auto i = 0; i < min * 2; i++){
        if (numbers1[p1] < numbers2[p2]) {
            myList.push_back(numbers1[p1]);
            p1 = p1 + 1;
        } else {
            myList.push_back(numbers2[p2]);
            p2 = p2 + 1;
        }
    }

    return myList;
}

int main() {
    std::vector<int> l1 = {1,2,3,4,5,6};
    std::vector<int> l2 = {2,5,6};

    std::list<int> listMerged = merge(l1, l2);

    // Accessing elements using iterators
    for (auto it = listMerged.begin(); it != listMerged.end(); ++it) {
        std::cout << *it << " ";
    }

    return 0;
}
