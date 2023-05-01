## **Getting to know the SOLID principles**
SOLID principles are a set of software development principles that are designed to help developers write maintainable, scalable, and robust code. The five SOLID principles are:

- **Single Responsibility Principle (SRP)**
  A class should have only one responsibility or reason to change, and its implementation should not include code that is unrelated to that responsibility.
- **Open Closed Principle (OCP)**
  A software component should be open for extension and closed for modification, meaning that its behavior can be changed by adding new code instead of modifying existing code.
- **Liskov Substitution Principle (LSP)**
  Objects of a subclass should be substitutable for objects of their superclass without affecting the correctness of the program.
- **Interface Segregation Principle (ISP)**
  Interface Segregation Principle (ISP): Clients should not be forced to depend on interfaces they don't use, and interfaces should be designed to be cohesive and narrow in scope.
- **Dependency Inversion Principle (DIP)**
  High-level modules should not depend on low-level modules, and both should depend on abstractions, rather than concrete implementations.
<br>In this README file, we will discuss each principle briefly.

### S: Single Responsibility Principle
The Single Responsibility Principle states that a class should have only one responsibility. This means that a class should do only one thing, and do it well. By following this principle, we can make our code more maintainable and easier to understand. If a class has multiple responsibilities, it can become complex and difficult to modify.

### O: Open Closed Principle
The Open Closed Principle states that software components should be open for extension, but closed for modification. This means that we should design our classes in a way that other developers can change their behavior by extending them, without having to modify their source code. By following this principle, we can make our code more flexible and easier to maintain.

### L: Liskov Substitution Principle
The Liskov Substitution Principle states that objects of subclasses must behave in the same way as the objects of the superclass. This means that if we have a program that uses an object of a superclass, we should be able to replace it with an object of any of its subclasses without changing the correctness of the program. By following this principle, we can make our code more modular and easier to extend.

### I: Interface Segregation Principle
The Interface Segregation Principle states that a client should not be forced to implement unnecessary methods that they will not use. This means that we should split an interface into two or more interfaces until clients are not forced to implement methods that they will not use. By following this principle, we can make our code more modular, easier to understand, and less prone to errors.

### D: Dependency Inversion Principle
The Dependency Inversion Principle states that we should depend on abstractions, not on concretions. This means that we should design our classes in a way that they depend on interfaces, rather than concrete implementations. By following this principle, we can make our code more flexible, easier to maintain, and less coupled.

In conclusion, the SOLID principles are guidelines that can help us write better code. By following these principles, we can make our code more modular, easier to understand, and less prone to errors.