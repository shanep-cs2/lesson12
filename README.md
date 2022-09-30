# lesson12 - Working with Exceptions

## Overview

In this lab you are given a partially implemented program that needs to be updated to work when it
encounters bad input.

## Important links

- [Lab Overview](https://youtu.be/HZixPDCSpDk)
- [Class Coding standards](https://shanep-cs2.github.io/docs/coding-standards.html)
- [Cloning and Submitting](https://shanep-cs2.github.io/docs/github.html)

## Task 1 - Write Unit Tests

Write some unit tests that will test the `MyMath.divide` method.

## Task 2 - Complete the MyMath class

Complete a program that reads integers userNum and divNum as input, and output the quotient
(userNum divided by divNum). Use a try block to perform the statements. Use a catch block to catch
any ArithmeticException and output an exception message with the getMessage() method. Use another
catch block to catch any InputMismatchException and output an exception message with the toString()
method. **HINT: You will need to write a main method in the MyMath class to do this!**

Ex: If the input of the program is:

`15 3`

the output of the program is:

`5`

Ex: If the input of the program is:

`10 0`

the output of the program is:

`Arithmetic Exception: / by zero`

Ex: If the input of the program is:

`15.5 5`

the output of the program is:

`NumberFormatException`

**HINT:** Use the [Integer.parseInt](https://docs.oracle.com/javase/10/docs/api/java/lang/Integer.html#parseInt(java.lang.String))

## Task 3 - Complete the Retrospective

Once you have completed all the tasks open the file **Retrospective.md** and complete each section
with a TODO comment. 

## Task 4 - Add, Commit, Push your code

Once you are finished you need to make sure that you have pushed all your code to GitHub for
grading!
