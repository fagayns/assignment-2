 -Attributes (Fields)
title: The title of the book (e.g., "The Great Gatsby").
author: The author of the book (e.g., "F. Scott Fitzgerald").
ISBN: The International Standard Book Number of the book (e.g., "9780743273565").
price: The price of the book (e.g., 10.99).
 -Constructors
Default Constructor: Initializes all attributes with default values (empty strings for title, author, and ISBN; 0.0 for price).
Parameterized Constructor: Initializes the book with specified values for each attribute.
 -Methods
displayInfo: Prints out the details of the book.
applyDiscount: A method that applies a discount to the book's price based on a given percentage.
-Testing
In the main method:
We create three objects using both the default and parameterized constructors.
We call the displayInfo method to print the object details.
We test the additional method applyDiscount to see if the price is correctly updated.

 -Explanation of the Diagram:
Class Name: Book at the top.
Attributes (Fields): Listed with their types (String for title, author, ISBN; double for price).
Constructors and Methods: Public methods and constructors are listed with their parameters.
