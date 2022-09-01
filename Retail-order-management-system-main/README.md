# Retail-order-management-system

## Introduction

In today’s modern era, it is common for business owners to fully automate their operations 
through software application like retail order management systems. This is because such 
systems can help streamline the management of identified entities like customers, orders and 
products that are involved during business process. Understanding its benefits, we build a 
Graphical User Interface (GUI) based retail order management system using the Java 
programming language and adhering to object-oriented concepts and techniques.  

 

The newly developed application will enable the admins of the business to perform all 
functionalities such as adding, deleting, editing, viewing, searching data to manage customers, 
product inventory and orders. Along with that, the customers will be able to enjoy several 
functionalities to manage their orders by adding, deleting, editing, viewing, searching 
respective information by retrieving from the system data repository. 

 

Moreover, the requirements and assumptions that the system follows to are as follows: 
1. System has a login window to regulate access rights of Admin and Customer. 
2. The items sold can only be of product type Fragile or Non-Fragile. 
3. The ordered items must be a product that already exists in the inventory. 
4. System must hold the order item details for any order placed. 
5. System should be able to hold many order items within a single order. 
6. System ensures there is no duplication of user, order, or product ID. 
7. System ensures only registered admin or customers can place orders. 
8. System uses multiple text files as a repository to store all required data. 
9. System ensures to add packaging cost for each ordered item based on product type. 
Additional charges (Fragile → 5%, Non-Fragile → 2%). 
10. System ensures to automatically calculate order total and each order item total placed 
by a particular customer. 
11. System does not automatically calculate stock, and the stock is assumed to be unlimited. 
The admin may update its value manually, and customers will not worry about lack of 
stock for their orders. 

## Use Case Diagram
![image](https://user-images.githubusercontent.com/83760070/145361162-99077410-c935-4deb-a84a-6b00ba3bc3f6.png)

## Class Diagram
![image](https://user-images.githubusercontent.com/83760070/145361242-ee5877a0-5623-4b83-abf0-97d883488c9d.png)

## Graphical User Interface 
The team has come up with a user-friendly GUI for the system by implementing the Swing 
widget toolkit for Java. Firstly, the design will consist of 3 main window JFrames. The small 
number of JFrames can avoid the opening of several windows which may confuse the users. 
Thus, it ensures that users can comfortably view a single window frame at a given time. 

1) LoginJFrame.java - to hold all GUI components of login frame 
2) AdminJFrame.java - to hold all GUI components of admin’s frame 
3) CustomerJFrame.java - to hold all GUI components of customer’s frame 

## Techniques Used
- Classes and Objects
- Class Relationships (Association, Inheritance)
- Encapsulation (Access Modifier, Getters and Setters, Static Variables
- Polymorphism (Overloading, Overriding)
- Arrays and Array List
- Text File Handling
- Error Handling
