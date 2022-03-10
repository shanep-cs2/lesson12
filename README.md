# lesson12 - Working with Exceptions

## Overview

In this lab you are given a partially implemented program that needs to be updated to work when it
encounters bad input.

## Videos

- [Lab Overview]()

## Task 1 - Write Unit Tests

We will continue to practice TDD by writing our tests for the `parse` method in the NameAgeTest.java
file.

## Task 2 - Complete the NameAge class

In your repository find the file NameAge.java. You will need to complete the `parse` method that
will read input from a scanner consisting of a a list of single-word first names and ages (ending
with -1). The method takes the name and age,  concatenates them into a new string, and then adds it
to an ArrayList that will be returned to the caller. The age needs to be incremented by 3. The
program should not fail if the second input on a line is a String rather than an Integer. 

**Hint:** You will need to add a try/catch statement to catch java.util.InputMismatchException, and
output 0 for the age. You can't catch the **Exception** base class you must only catch the
InputMismatchException. Your program will not be tested with any other weird output :)

## Example

Input:

```
Hobar 42
Arkady 16
Bayta Darell 35
Salvor 33
-1
```


Output:

```
Hobar 45
Arkady 19
Bayta  0
Salvor 36
```

