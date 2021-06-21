# JUnit get started

## Story

Java unit testing is a software testing where methods and classes are tested. JUnit is a unit testing framework for the Java programming language which provides a way to test the application as many as you want. Unit testing usually includes the following steps:

- define a test
- create an instance of the testing class 
- prepare the test data 
- execute a test 
- verify the testing results 
- report the testing results

## What are you going to learn?

- using JUnit framework
- writing unit test cases
- using keywords, annotations, assertions provided by JUnit 5

## Tasks

1. Check needed elements
    - Read about maven configuration including POM xml
    - Read about JUnit 5 test automation framework

2. Implement test cases to test all function of Sample class.  Sample class contains three functions with various output. The `doubleANumber(int num)` function returns the double of argument. The `getBoolean(String inputData)` checks the string parameter and returns `true` in case of 'Codecool' input, otherwise returns `false`. `doSomething(String inputData)` method prints a text to the terminal if the inputData equals to 'Codecool', otherwise the method throws and `exception`. Check the usage of JUnit 5 framework, acquire knowledge about test case writing with embeded annotations and write proper test cases.
    - Write a `Setup` method to initialize test environment. Save `TestInfo` and `TestReporter` into a global variable
    - Implement `TestDubleANumber` method to test DoubleANumber of Sample class. The test must run 5 times repeatedly.
    - Implement `TestNotExecuted` and disable the running.
    - Implement `TestGetBooleanFalse` method to test the 'false' path of GetBoolean function.
    - Implement `TestGetBooleanTrue` method to test the 'true' path of GetBoolean function. Set displayname with the appropriate annotation.
    - Implement `TestDoSomething` method to test DoSomething function with proper argument.
    - Implement `TestDoSomethingException` method to test DoSomething function with inappropriate argument.
    - Implement `TestTimeout` method to check running of DoubleANumber function within the defined timeout.

## General requirements

None

## Hints

- Before you start writing test cases read background materials carefully including annotations and assertions
- Check test part of previous Java development project to get inspiration

## Background materials

- <i class="far fa-exclamation"></i> [JUnit5 Tutorial](https://howtodoinjava.com/junit-5-tutorial/)
- <i class="far fa-exclamation"></i> [JUnit5 maven dependency](https://howtodoinjava.com/junit5/junit5-maven-dependency/)
- <i class="far fa-exclamation"></i> [JUnit reference](https://junit.org/junit5/)
- <i class="far fa-exclamation"></i> [Unit testing with JUnit tutorial](https://www.vogella.com/tutorials/JUnit/article.html)
