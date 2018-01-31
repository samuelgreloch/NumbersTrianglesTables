# TableUtilities

## `String tableSquare(int n)`
* **Description**
    * Given one integer, `n`, generate a `String` representation of a multiplication table whose dimensions are `n` by `n`

	
### Example 1
* Sample Script

    ```
    // : Given
    int n = 4;
    
    // : When
    String outcome = Tables.getMultiplicationTable(n);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    |  1 |  2 |  3 |  4 |
    |  2 |  4 |  6 |  8 |
    |  3 |  6 |  9 | 12 |
    |  4 |  8 | 12 | 16 |
    ```



### Example 2
* Sample Script

    ```
    // : Given
    int n = 6;
    
    // : When
    String outcome = Tables.getMultiplicationTable(n);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    | 1 |  2 |  3 |  4 |  5 |  6 |
    | 2 |  4 |  6 |  8 | 10 | 12 |
    | 3 |  6 |  9 | 12 | 15 | 18 |
    | 4 |  8 | 12 | 16 | 20 | 24 |
    | 5 | 10 | 15 | 20 | 25 | 30 |
    | 6 | 12 | 18 | 24 | 30 | 36 |
    ```