# Employee Payroll

# Principles of Object-Oriented Programming (OOP) 

This Java project demonstrates key principles of Object-Oriented Programming (OOP) through an example of an Employee Payroll System.

## Object-Oriented Principles Demonstrated

### 1. Encapsulation:
   - The `Employee` class encapsulates the attributes (name, id) and behavior (calculateSalary) of an employee.
   - Accessor methods (`getName()`, `getId()`) provide controlled access to the private attributes.

### 2. Abstraction:
   - The `Employee` class is an abstract class with an abstract method `calculateSalary()`, providing a blueprint for concrete subclasses (`FullTimeEmployee` and `PartTimeEmployee`).

### 3. Inheritance:
   - `FullTimeEmployee` and `PartTimeEmployee` inherit common attributes and methods from the abstract `Employee` class.
   - Code reuse is demonstrated by extending functionality rather than duplicating it.

### 4. Polymorphism:
   - Polymorphism is achieved through the overridden `calculateSalary()` method in both `FullTimeEmployee` and `PartTimeEmployee` classes.
   - The `PayrollSystem` class works with a list of `Employee` objects, demonstrating polymorphic behavior.

### 5. Composition:
   - The `PayrollSystem` class uses composition to manage a list of `Employee` objects, allowing for a flexible and modular design.

## Code Usage

1. **Compile the Java code:**
   ```bash
   javac Main.java

2. **Run the compiled code:**
  ```bash
  java Main
```
3. **Output**
  The program creates a `PayrollSystem`, adds `FullTimeEmployee` and `PartTimeEmployee` objects, displays initial details, removes an employee, and displays the remaining details.

## Contribution
  Contributions are welcome! Feel free to open issues or create pull requests for any improvements or suggestions.
