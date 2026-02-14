package DSA;

public class MultipleLeftRotationArray {

    static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {2, 3};
        int[][] ans = multipleRotations(a, b);

        for(int[] e : ans) {
            printArray(e);
            System.out.println();
        }
    }

    static int[][] multipleRotations(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[][] ans = new int[m][n];
        //Making the given array as 2 time the original array
        int temp[] = new int[2*n];
        for(int i = 0; i<n; i++) {
            temp[i] = a[i];
            temp[i+n] = a[i];
        }
        //Process query -- means how many times the array loop will run
        for(int i = 0; i<m; i++) {
            int offset = (b[i])%n;
            for(int j = 0; j<n; j++) {  //removing the initial elements and adding in the new elements
                ans[i][j] = temp[j+offset];
            }
        }
        return ans; //Returning back the elements
    }

    static void printArray(int[] a) {
        for(int e: a) {
            System.out.print(e + " ");
        }
    }
}

//Problem statements
/*
I'll explain every single line of this code in depth. This is an excellent implementation of the **2×N array approach** for multiple left rotations.

---

## Complete Line-by-Line Explanation

```java
package DSA;
```
**Package declaration** - Organizes the class into the `DSA` (Data Structures & Algorithms) folder/namespace.

```java
public class MultipleLeftRotationArray {
```
**Class declaration** - Defines a public class named `MultipleLeftRotationArray`.

---

## MAIN METHOD

```java
    static void main(String[] args) {
```
**Entry point** - JVM starts execution here. Note: Should be `public static void main` (missing `public` - will cause error in some Java versions).

```java
        int[] a = {1,2,3,4,5};
```
**Original array initialization** - Creates array `a` with 5 elements: `[1, 2, 3, 4, 5]`

```java
        int[] b = {2, 3};
```
**Rotation amounts array** - `b[0]=2` means "rotate left by 2", `b[1]=3` means "rotate left by 3"

```
Visual:
a = [1, 2, 3, 4, 5]    (original array)
b = [2, 3]             (rotation queries)
     ↑  ↑
     |  └── rotate by 3 → [4, 5, 1, 2, 3]
     └───── rotate by 2 → [3, 4, 5, 1, 2]
```

```java
        int[][] ans = multipleRotations(a, b);
```
**Method call** - Calls `multipleRotations()` with arrays `a` and `b`, stores returned 2D array in `ans`

```
ans will be a 2D array (matrix):
Row 0: [3, 4, 5, 1, 2]  ← rotation by 2
Row 1: [4, 5, 1, 2, 3]  ← rotation by 3
```

```java
        for(int[] e : ans) {
```
**Enhanced for-loop** - Iterates through each row (1D array) of the 2D array `ans`

```java
            printArray(e);
```
**Print helper call** - Passes each row `e` to `printArray()` method

```java
            System.out.println();
```
**New line** - Prints blank line after each rotation result

```java
        }
    }
```
**End of loops and main method**

---

## MULTIPLE ROTATIONS METHOD

```java
    static int[][] multipleRotations(int[] a, int[] b) {
```
**Method signature** - Takes original array `a` and rotation amounts `b`, returns 2D array containing all rotated versions

```java
        int n = a.length;
```
**Store length of original array** - `n = 5` (number of elements in `a`)

```java
        int m = b.length;
```
**Store number of queries** - `m = 2` (how many different rotations requested)

```java
        int[][] ans = new int[m][n];
```
**Create result matrix** - 2D array with `m` rows and `n` columns
```
ans = [
       [_, _, _, _, _],   // row 0: will store rotation by b[0]=2
       [_, _, _, _, _]    // row 1: will store rotation by b[1]=3
      ]
      ↑ each row has n=5 columns
```

---

### BUILDING THE 2×N ARRAY

```java
        int temp[] = new int[2*n];
```
**Create doubled array** - Array of size `10` (2 × 5) to hold concatenated array

```
temp = [_, _, _, _, _, _, _, _, _, _]
        0  1  2  3  4  5  6  7  8  9
        └─────┘ └─────┘
         first   second
         copy    copy
```

```java
        for(int i = 0; i<n; i++) {
```
**Loop through original array** - `i` goes from `0` to `4` (indices of `a`)

```java
            temp[i] = a[i];
```
**Copy to first half** - Copies `a[i]` to `temp[i]` (positions 0-4)

```
Iteration i=0: temp[0] = a[0] = 1
Iteration i=1: temp[1] = a[1] = 2
Iteration i=2: temp[2] = a[2] = 3
Iteration i=3: temp[3] = a[3] = 4
Iteration i=4: temp[4] = a[4] = 5

temp = [1, 2, 3, 4, 5, _, _, _, _, _]
        0  1  2  3  4  5  6  7  8  9
```

```java
            temp[i+n] = a[i];
```
**Copy to second half** - Copies `a[i]` to `temp[i+5]` (positions 5-9)

```
Iteration i=0: temp[5] = a[0] = 1
Iteration i=1: temp[6] = a[1] = 2
Iteration i=2: temp[7] = a[2] = 3
Iteration i=3: temp[8] = a[3] = 4
Iteration i=4: temp[9] = a[4] = 5

Final temp = [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]
              0  1  2  3  4  5  6  7  8  9
```

```java
        }
```
**End of array doubling loop**

---

### EXTRACTING ROTATIONS

```java
        for(int i = 0; i<m; i++) {
```
**Outer loop** - Iterates through each rotation query (`i = 0, 1` for `b[0]` and `b[1]`)

```java
            int offset = (b[i])%n;
```
**Calculate starting position** - `b[i] % n` handles cases where rotation > array length

```
When i=0: offset = b[0] % 5 = 2 % 5 = 2
When i=1: offset = b[1] % 5 = 3 % 5 = 3

Why % n?
If b[i] = 7 and n = 5, then 7 % 5 = 2
Rotating by 7 is same as rotating by 2 (since 7 = 5 + 2, full cycle + 2)
```

```java
            for(int j = 0; j<n; j++) {
```
**Inner loop** - Extracts `n` elements starting from `offset` position

```java
                ans[i][j] = temp[j+offset];
```
**Magic line!** - Copies element from `temp` to result matrix

```
Visual explanation for i=0 (offset=2):
j=0: ans[0][0] = temp[0+2] = temp[2] = 3
j=1: ans[0][1] = temp[1+2] = temp[3] = 4
j=2: ans[0][2] = temp[2+2] = temp[4] = 5
j=3: ans[0][3] = temp[3+2] = temp[5] = 1
j=4: ans[0][4] = temp[4+2] = temp[6] = 2

Result: ans[0] = [3, 4, 5, 1, 2]  ✓ (left rotated by 2)

Visual for i=1 (offset=3):
j=0: ans[1][0] = temp[0+3] = temp[3] = 4
j=1: ans[1][1] = temp[1+3] = temp[4] = 5
j=2: ans[1][2] = temp[2+3] = temp[5] = 1
j=3: ans[1][3] = temp[3+3] = temp[6] = 2
j=4: ans[1][4] = temp[4+3] = temp[7] = 3

Result: ans[1] = [4, 5, 1, 2, 3]  ✓ (left rotated by 3)
```

```
temp = [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]
              ↑        ↑
           offset=2  offset=3
           [3,4,5,   [4,5,1,
            1,2]      2,3]
```

```java
            }
        }
```
**End of inner and outer loops**

```java
        return ans;
```
**Return result matrix** - Returns the 2D array with all rotations

```java
    }
```
**End of method**

---

## PRINT HELPER METHOD

```java
    static void printArray(int[] a) {
```
**Helper method** - Takes a 1D array and prints its elements

```java
        for(int e: a) {
```
**Enhanced for-loop** - Iterates through each element `e` in array `a`

```java
            System.out.print(e + " ");
```
**Print element** - Prints element followed by space (no newline)

```java
        }
    }
}
```
**End of method and class**

---

## Complete Execution Flow

```
STEP 1: Initialize
    a = [1, 2, 3, 4, 5]
    b = [2, 3]

STEP 2: Build 2×N array
    temp = [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]

STEP 3: Process query b[0] = 2
    offset = 2 % 5 = 2
    Extract temp[2..6] → [3, 4, 5, 1, 2]
    ans[0] = [3, 4, 5, 1, 2]

STEP 4: Process query b[1] = 3
    offset = 3 % 5 = 3
    Extract temp[3..7] → [4, 5, 1, 2, 3]
    ans[1] = [4, 5, 1, 2, 3]

STEP 5: Print results
    "3 4 5 1 2 "
    "4 5 1 2 3 "
```

---

## Why This Approach is Brilliant

| Feature | Benefit |
|--------|---------|
| **O(n) preprocessing** | Build 2×N array once |
| **O(1) per element access** | Direct index calculation |
| **O(m × n) total time** | Optimal for m queries |
| **No actual rotation** | Just index manipulation |
| **Handles k > n** | Modulo operation makes it circular |

The key insight: **Left rotation by k = Start from index k in the 2×N array!**

 */
