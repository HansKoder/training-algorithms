
# 42. Trapping rain water
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

<b>Input: </b> height = [0,1,0,2,1,0,1,3,2,1,2,1]
<br/>
<b> Output: </b> 6

## Explanation: 
The above elevation map (black section) is represented by array x In this case, 6 units of rain water (blue section) are being trapped.

```
x = [0,1,0,2,1,0,1,3,2,1,2,1]
```

### Example 2:

<b>Input: </b> height = [4,2,0,3,2,5]
<br/>
<b> Output: </b> 9

### Constraints:

n == height.length <br/>
1 <= n <= 2 * 104 <br/>
0 <= height[i] <= 105 <br/>
