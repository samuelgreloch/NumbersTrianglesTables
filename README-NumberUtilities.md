# NumberUtilities
* Ensure each of the test cases in the class [NumberUtilitiesTest]() successfully passes upon completion of each method stubs in the class [NumberUtilities]().
    * `String getEvenNumbers(int start, int stop)` 
    * `String getOddNumbers(int start, int stop)`
    * `String getSquareNumbers(int start, int stop, int step)` 
    * `String getRange(int start, int stop, int step)` 
    * `String getExponentiations(int start, int stop, int step, int exponent)` 
    





<br><br><br><br>
## `String getRange(int stop)`
* **Description**
    * Given an integer, `stop`, return a `String` concatenation of all values between `0` and `stop` exclusively.
### Example
* Sample Script

    ```
    // : Given
    int stop = 11;
    
    // : When
    String outcome = StringLoops.getRange(stop);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    012345678910
    ```









<br><br><br><br>
## `String getRange(int start, int stop)`
* **Description**
    * Given two integers, `start`, and `stop`, return a `String` concatenation of all values between `start` and `stop` exclusively.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 11;
    
    // : When
    String outcome = StringLoops.getRange(start, stop);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    5678910
    ```





<br><br><br><br>
## `String getRange(int start, int stop, int step)`
* **Description**
    * Given three integers, `start`, `stop`, and `step` return a `String` concatenation of all values between `start` and `stop` exclusively incrementing by `step`.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 20;
    int step = 5;
    
    // : When
    String outcome = StringLoops.getRange(min, max, step);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    51015
    ```
    
    
    










<br><br><br><br>
## `String getEvenNumbers(int start, int stop)`
* **Description**
    * Given two integers, `start`, and `stop`, return a `String` concatenation of all even values between `start` and `stop` exclusively.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 20;
    
    // : When
    String outcome = StringLoops.getOddNumbers(min, max);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    681012141618
    ```
    

<br><br><br><br>
## `String getOddNumbers(int start, int stop)`
* **Description**
    * Given two integers, `start`, and `stop`, return a `String` concatenation of all even values between `start` and `stop` exclusively.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 20;
    
    // : When
    String outcome = StringLoops.getOddNumbers(min, max);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    5791113151719
    ```













    

<br><br><br><br>
## `String getSquareNumbers(int start, int stop)`
* **Description**
    * Given two integers, `start`, and `stop`, return a `String` concatenation of all values squared between `start` and `stop` exclusively.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 20;
    
    // : When
    String outcome = StringLoops.getOddNumbers(min, max);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    25100225
    ```
    
    
    
    







<br><br><br><br>
## `String getExponentiations(int start, int stop, int step, int exponent)`
* **Description**
    * Given four integers, `start`, `stop`, `step`, and `exponent`, return a `String` concatenation of all values, raised to the specified `exponent`, between `start` and `stop` exclusively, incrementing by the specified `step`.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 20;
    int step = 2;
    int exponent = 2;
    
    // : When
    String outcome = StringLoops.getOddNumbers(min, max);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    25100225
    ```
