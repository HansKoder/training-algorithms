
# QUESTION DESCRIPTION

## Description
A password string, pwd, consists of binary characters (0s and 1s).  

A **cyber security** expert is trying to determine the minimum number of changes required to make the password secure. 

To do so, it must be divided into substrings of non-overlapping, even length substrings. 

Each substring can only contain 1s or 0s, not a mix. This helps to ensure that the password is strong and less vulnerable to hacking attacks.
Find the minimum number of characters that must be flipped in the password string, i.e. changed from 0 to
1 or 1 to 0 to allow the string to be divided as described.

> **Note:** A substring is a contiguous sequence of characters in a string.


### Example
``` java
Given pwd = "1110011000"
output = 3    
```
The two substrings have lengths 8 and 2 respectively. Since both lengths are even, the division is valid. So
the answer is 3.

``` algorithm
pwd = 1110011000
length (8) -> 11111111
length (2) -> 00
output = 3
```

### Example 
```algorithm
pwd = 100110
output -> 3
111111
000000
```

One of the optimal ways is to flip all the 1s or all the 0s to get "000000" or "111111" which are both
valid without divisions.

### Example
```algorithm
pwd = 101011
output -> 2
111111
```

An optimal solution is to flip both the 0s to get "111111".