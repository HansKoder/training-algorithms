# Algorithm Sort Colors
## Description
Given an array numbers with n objects colored red, white, or blue, sort them in-place 
so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.


**Example 1:**

``` java 
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
```
 
**Example 2:**
``` java 
Input: nums = [2,0,1]
Output: [0,1,2]
```

**Constraints:**
```
n == numbers.length
1 <= n <= 300
numbers[i] is either 0, 1, or 2.
```

Follow up: Could you come up with a one-pass algorithm using only constant extra space?

## Reference exercise 
Taken by the following website [leet code sort colors](https://leetcode.com/problems/sort-colors/description/)