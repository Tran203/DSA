# Data Structures and Algorithms: Arrays and 2D Arrays

This document consolidates notes on arrays and 2D arrays (matrices) for Data Structures and Algorithms (DSA) study, based on Kunal Kushwaha's teachings. It’s designed for revision and practice on platforms like LeetCode and HackerRank. 

## 1. Arrays Basics

### Definition
An array is a fixed-size collection of elements of the same data type, stored in memory.  
Example: `{1, 2, 3}`

### Syntax (Java)
```java
// Declaration and initialization with size
datatype[] array = new datatype[size];

// Direct initialization
datatype[] array = {value1, value2, value3};

// Example
int[] numbers = new int[3]; // Defaults: {0, 0, 0}
int[] values = {1, 2, 3};
```

### Key Points
- **Fixed Size**: Size must be specified at creation and cannot change.
- **Indexing**: 0-based indexing (0 to size-1).
- **Default Values**: Numeric arrays initialize to 0, objects to `null`.


### Common Operations
#### Swapping Elements
```java
// Goal: Swap two elements in an array to rearrange their positions, often used in sorting or reversing.
// Reason: Enables reordering without creating a new array, saving space.
// Process: Use a temporary variable to hold one value, then swap the elements at the given indices.
void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
}
```

#### Reversing an Array
```java
// Goal: Reverse the order of elements in an array (e.g., {1, 2, 3, 4, 5} becomes {5, 4, 3, 2, 1}).
// Reason: Useful for problems like palindrome checks or array rotations.
// Process: Use two pointers (start and end), swap elements, and move pointers inward until they meet.
void reverse(int[] array) {
    int start = 0;
    int end = array.length - 1;
    while (start < end) {
        swap(array, start, end);
        start++;//push inward becomes next index e.g array[1]
        end--;//push inward becomes the index e.g array.length -2
    }
}
```

#### Finding Maximum Element
```java
// Goal: Find the largest element in an array.
// Reason: Common in problems requiring max/min values.
// Process: Iterate through the array, updating a variable if a larger element is found.
int max(int[] array) {
    int potentialMax = array[0]; // Start with first element
    for (int i = 1; i < array.length; i++) {
        if (array[i] > potentialMax) {
            potentialMax = array[i];
        }
    }
    return potentialMax;
}
```


### Edge Cases
- Empty array: Check `array.length == 0`.
- Single element: Handle trivially in algorithms.
- Invalid indices: Use bounds checking to avoid `ArrayIndexOutOfBoundsException`.

## 2. Dynamic Arrays (ArrayList in Java)

### Definition
An `ArrayList` is a dynamic array that can grow or shrink in size, part of Java’s Collections Framework.

### Syntax
```java
import java.util.ArrayList;
ArrayList<Datatype> list = new ArrayList<>();
```

### Key Operations
- **Add**: `list.add(value)` 
- **Set**: `list.set(index, value)`
- **Get**: `list.get(index)` 
- **Contains**: `list.contains(value)`
- **Remove**: `list.remove(index)` 
- **Size**: `list.size()`

### Example
```java
ArrayList<Integer> list = new ArrayList<>();
list.add(1); // [1]
list.add(2); // [1, 2]
list.set(0, 10); // [10, 2]
System.out.println(list.get(1)); // Prints 2
System.out.println(list.contains(10)); // Prints true
```

### Key Points
- **Dynamic Size**: Automatically resizes (doubles) when full.
- **Wrapper Classes**: Use `Integer`, `Double`, etc., for primitives.

## 3. 2D Arrays (Matrices)

### Definition
A 2D array is an array of arrays, often used to represent matrices or grids.  
**Graphical View**:
```
   0 1 2  (col indices)
0: 1 2 3
1: 4 5 6
2: 7 8 9
(row indices)
```
- Each cell is accessed as `matrix[row][col]`, e.g., `matrix[1][2] = 6`.

### Syntax (Java)
```java
// Declaration with rows and columns
datatype[][] matrix = new datatype[rows][cols];

// Direct initialization
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### Key Points
- **Rows Mandatory**: Number of rows must be specified during initialization; columns optional.
- **Access**: `matrix[i][j]` for row `i`, column `j`.

### Populating a Matrix
```java
// Goal: Fill a matrix with values in a systematic way.
// Reason: Useful for initializing test cases or grids.
// Process: Use nested loops to assign values to each cell.
// Graphical View (Result):
//    0 1 2
// 0: 1 2 3
// 1: 4 5 6
// 2: 7 8 9
int rows = 3, cols = 3;
int[][] matrix = new int[rows][cols];
int value = 1;
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        matrix[i][j] = value++;
    }
}
// Result: {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
```

## 4. 2D ArrayList (Dynamic Matrix)

### Syntax
```java
import java.util.ArrayList;
ArrayList<ArrayList<Datatype>> matrix = new ArrayList<>();
```

### Initialization
```java
// Goal: Create a dynamic 2D matrix where rows and columns can vary in size.
// Reason: Useful when matrix dimensions are unknown or dynamic (e.g., jagged arrays).
// Process: Initialize each row as an ArrayList, then add elements to each row.
int rows = 3, cols = 3;
ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
for (int i = 0; i < rows; i++) {
    matrix.add(new ArrayList<>());
    for (int j = 0; j < cols; j++) {
        matrix.get(i).add(0); // Initialize with 0
    }
}
```

### Key Points
- **Dynamic Rows and Columns**: Each row can have a different number of columns.
- **Use Case**: When matrix size is unknown or varies.

## 5. Matrix Operations and Patterns

### Diagonal Traversal
```java
// Goal: Access elements along the main and anti-diagonals of a square matrix.
// Reason: Common in problems involving diagonal sums or patterns.
// Process: For main diagonal, use same row and column index; for anti-diagonal, use row and (n-1-row).
// Graphical View (3x3 matrix):
//    0 1 2
// 0: 1 2 3  <- Main diagonal: [1,5,9] (matrix[i][i])
// 1: 4 5 6
// 2: 7 8 9
// Anti-diagonal: [3,5,7] (matrix[i][n-1-i])

int n = matrix.length;
// Main Diagonal
for (int i = 0; i < n; i++) {
    System.out.println(matrix[i][i]); // Prints 1, 5, 9
}
// Anti-Diagonal
for (int i = 0; i < n; i++) {
    System.out.println(matrix[i][n-1-i]); // Prints 3, 5, 7
}
```

### Transpose Matrix
```java
// Goal: Convert rows to columns and vice versa (e.g., matrix[i][j] becomes matrix[j][i]).
// Reason: Used in problems like image rotation or matrix manipulation.
// Process: Create a new matrix with swapped dimensions and copy elements accordingly.
// Graphical View:
// Original:
//    0 1 2
// 0: 1 2 3
// 1: 4 5 6
// 2: 7 8 9
// Transposed:
//    0 1 2
// 0: 1 4 7
// 1: 2 5 8
// 2: 3 6 9
int rows = matrix.length;
int cols = matrix[0].length;
int[][] transposed = new int[cols][rows];
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        transposed[j][i] = matrix[i][j];
    }
}
```

### Other Traversal Patterns
- **Row-Major**: Process each row left to right.
- **Column-Major**: Process each column top to bottom.
- **Spiral Traversal**: Traverse boundary in a spiral (common in LeetCode).
- **Boundary Traversal**: Process outer layer (top, right, bottom, left).

Example (Spiral Traversal for n x n matrix):
```java
// Goal: Print matrix elements in a spiral order (clockwise, starting from top-left).
// Reason: Solves problems like (Spiral Matrix) or boundary-related tasks.
// Process: Use four pointers (top, bottom, left, right) to traverse boundaries, shrinking the matrix.
// Graphical View (3x3 matrix):
//    0 1 2
// 0: 1 2 3  <- Start here, go right (1,2,3)
// 1: 4 5 6     Then down (6), left (9,8), up (7), right (4), down (5)
// 2: 7 8 9
// Output: 1,2,3,6,9,8,7,4,5
void spiralTraversal(int[][] matrix) {
    // Get dimensions of the matrix
    int rows = matrix.length; 
    int cols = matrix[0].length; 
    
    // Initialize four pointers
    int top = 0; // First unvisited row
    int bottom = rows - 1; // Last unvisited row
    int left = 0; // First unvisited column
    int right = cols - 1; // Last unvisited column
    
    // Continue while there are unvisited rows and columns
    while (top <= bottom && left <= right) {
        // Step 1: Traverse top row from left to right
        for (int i = left; i <= right; i++) {
            System.out.print(matrix[top][i] + " "); // Print elements in top row
        }
        top++; // Move top boundary down (row is done)
        
        // Step 2: Traverse rightmost column from top to bottom
        for (int i = top; i <= bottom; i++) {
            System.out.print(matrix[i][right] + " "); // Print elements in right column
        }
        right--; // Move right boundary left (column is done)
        
        // Step 3: Traverse bottom row from right to left (only if rows remain)
        if (top <= bottom) {
            for (int i = right; i >= left; i--) {
                System.out.print(matrix[bottom][i] + " "); // Print elements in bottom row
            }
            bottom--; // Move bottom boundary up (row is done)
        }
        
        // Step 4: Traverse leftmost column from bottom to top (only if columns remain)
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                System.out.print(matrix[i][left] + " "); // Print elements in left column
            }
            left++; // Move left boundary right (column is done)
        }
    }
}
```


## 6. Practice Problems
- **LeetCode**:
  - #1: Two Sum (arrays, hash map)
  - #26: Remove Duplicates from Sorted Array
  - #189: Rotate Array
  - #54: Spiral Matrix
  - #48: Rotate Image (matrix)
- **HackerRank**:
  - Arrays - DS
  - 2D Array - DS
  - Left Rotation

## 7. Tips for LeetCode/HackerRank
- **Understand Constraints**: Check array sizes, value ranges, and whether the array is sorted.
- **Optimize for Space**: Use in-place algorithms when possible (e.g., reverse, rotate).
- **Practice Patterns**: Master two-pointer, sliding window, and matrix traversal techniques.