# School Management System

This project contains classes to manage employees in a school and their lists/sets.

## SchoolManager Class

The `SchoolManager` class manages employees in a school and their lists/sets. It provides the following methods:

- `addToOvertimeList(Employee employee)`: Adds an employee to the overtime list.
- `addToSeminarRegistrationList(Employee employee)`: Adds an employee to the seminar registration list.
- `getOvertimeEmployeeCount()`: Returns the number of employees in the overtime list.
- `getSeminarRegistrationsCount()`: Returns the number of employees in the seminar registration list.
- `displayOvertimeList()`: Displays the overtime list.
- `displaySeminarRegistrationList()`: Displays the seminar registration list.

## Employee Class

The `Employee` class represents an employee in the school management system. It provides methods to get and set employee details such as name, age, and employee ID.

## Container Class

The `Container` class represents a container that stores objects in an array-like structure. It provides methods to add, remove, and manipulate objects in the container.

## MyList Class

The `MyList` class simulates an ArrayList concept, where you can add an unlimited number of elements to the list. It extends the `Container` class and provides additional methods to access elements by index.

## MySet Class

The `MySet` class simulates a custom set that stores unique elements. It extends the `Container` class and ensures that duplicate elements are not added to the set.

## Usage

To use the classes:

1. Include the Java files in your Java project.
2. Create instances of the `SchoolManager`, `Employee`, `MyList`, and `MySet` classes as needed.
3. Call the methods provided by these classes to manage employees and lists/sets.


