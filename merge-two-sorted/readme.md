# Algorithm Merge two sorted lists 

## Description 
Get two lists of datatypes numbers **list_number1** and **list_number2**, each list should be sorted of way asc.

Should combine **list_number1** and **list_number2** in a unique asc array.

Should pay attention the size each list, since should be sorted with the sizest, aditionally, should add zero when the size is finished.

**Example**

``` c++
// Input
list_number1 = [1,2,3,4,5,6]
list_number2 = [2,5,6]

// Should be ignored the last three (3) positions
list_number1 = [1,2,3,0,0,0]
list_number2 = [2,5,6]

// Output
result = [1,2,2,3,5,6]
```