# Complexity in Data Structures and Algorithms

## Introduction

An algorithm is a set of instructions to perform a task. 
For example our task is to find average of a given dataset. The data set is let's say [2,4,6,8,10]. The algorithm aka set of instructions to solve the task
will be:
1. Sum all the elements in the given array
2. Find the length of the array
3. Divide the sum by the length 

Hence, this is a simple algorithm to find the average of the given dataset. 

Let's say the data set now increases from an array length of 5 to 100,000. Now, obviously the time and space taken by the whole program will be higher. If we keep increasing the data even more, it becomes our major concern to optimize the algorithm so that it completes the task in reasonable space and time. 

This is where we need complexity. Time Complexity is the rate at which the time grows when data grows. Similiar is the Space complexity, it refers to the rate at which memory use increases in an algorithm. Remember it also inlucdes the input data space acquired. But as the user input is not in our control we just focus
on the space occupied excluding the intital one. This extra space is called Auxiliary space. 

Total space = intital space + auxiliary space

**NOTE**: Complexity is the **rate** at which the time and space grow with increase in dataset. It does not refer to the absolute change in values.

## Types of Complexity

1. **O(1):** Constant time complexity. The algorithm's execution time or space requirement remains constant, regardless of the input size.

2. **O(log n):** Logarithmic time complexity. Common in algorithms that divide the problem space in each step, like binary search.

3. **O(sqrt n):** Square root time complexity. Occurs in certain algorithms where each step reduces the problem space by the square root.

4. **O(n):** Linear time complexity. The execution time or space requirement grows linearly with the input size.

5. **O(n^k):** Polynomial time complexity. The algorithm's performance is a polynomial function of the input size.

6. **O(k^n):** Exponential time complexity. Common in algorithms with an exponential increase in execution time with each additional input.

7. **O(n!):** Factorial time complexity. Occurs in algorithms with a growth rate proportional to the factorial of the input size.

**NOTE**: The list only includes the most common complexities and not all.
