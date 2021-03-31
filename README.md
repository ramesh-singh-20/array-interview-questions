# array-inteview-questions

** Algorithm **

1. We are first creating all the combinations of 2 element segments and capturing their sum.

2. Next we are checking the current sum is equal to previous sum, if yes increase previousCheckCount by 1.

3. Check if previousCheckCount % 2!= 0, if yes then loop again. This check is done to filter intersecting segments.

4. If sum is not equal to previous or if the segments are not intersecting than add the count of sum into a HashMap with key as sum and value as count of sum.

5. Lastly get the max value of count from the HashMap and return it.