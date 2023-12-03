# Throwing Exceptions


**Objective**

In this project, we will learn how to **catch exceptions** that are **thrown** by the `Java RunTime` system.

**Concepts**

| Concept   |      Resources      |
|----------|:-------------:|
|Throw keyword|[Exception handling document](https://www.digitalocean.com/community/tutorials/exception-handling-in-java)|
|Throwing exception in java |[Throwing exception (Tutorial)](https://www.youtube.com/watch?v=kAOYeVYtukY)|
|Different between Throws & Throw|[Throws & Throw](https://rollbar.com/blog/how-to-use-the-throws-keyword-in-java-and-when-to-use-throw/#:~:text=The%20throws%20keyword%20is%20used,be%20thrown%20from%20a%20method.)|
|What's the Difference in Checked vs. Unchecked|[Checked vs. Unchecked Exceptions (Tutorial)](https://www.youtube.com/watch?v=bCPClyGsVhc)|

**Problem**

Use the `ArithmeticException` throw exception if the given age value is below 18.

**Implementation**

- Implement the `ageValidator` method to check the given age value, and throw the `ArithmeticException` if the age is less than 18.
- In the main method, call the `ageValidator` method with the age value.
- Surround the `ageValidator` method call with the `try-catch` block.
  
```Java
public class Main {
    public static void main(String args[]){   
   int age = 13;
  }

  public static void ageValidator(int age)   {

        }
}  
```

