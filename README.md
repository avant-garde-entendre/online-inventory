# Project Customization Notes

This README file includes notes describing where in the code to find the changes made for each of parts C to J.

## C. Customize the HTML User Interface
- **Prompt:** Customize the HTML user interface for your customer’s application.
- **File:** src/main/resources/templates/mainscreen.html
- **Line Number:** 14 & 19
- **Change:** Customized HTML with toy store branding, added shop name, product names, and part names.

## D. Add an "About" Page
- **Prompt:** Add an "About" page to the application to describe your chosen customer’s company to web viewers.
- **File:** src/main/resources/templates/about.html
- **Line Number:** Entire file
- **File:** src/main/java/com/example/demo/controllers/MainScreenController.java
- **Line Number:** 55-59
- **Change:** Created a new About page describing the toy store, with navigation to and from the main screen.

## E. Add a Sample Inventory
- **Prompt:** Add a sample inventory appropriate for your chosen store to the application.
- **File:** src/main/java/com/example/demo/DemoApplication.java
- **Line Number:** 3-9, 14-20, 26-55
- **File:** src/main/java/com/example/demo/domain/InhousePart.java
- **Line Number:** 14-18
- **File:** src/main/java/com/example/demo/domain/OutsourcedPart.java
- **Line Number:** 14-18
- **Change:** Added code to initialize sample inventory with five products and five parts.

## F. Add a "Buy Now" Button
- **Prompt:** Add a "Buy Now" button to your product list.
- **File:** src/main/java/com/example/demo/controllers/AddProductController.java
- **Line Number:** 15 & 38-52
- **File:** src/main/resources/templates/mainscreen.html
- **Line Number:**7, 23, 49-50, 86-87 & 90
- **Change:** Added “Buy Now” button and associated functionality to decrement product inventory and display success/failure message.

## G. Modify Parts to Track Maximum and Minimum Inventory
- **Prompt:** Modify the parts to track maximum and minimum inventory.
- **File:** src/main/java/com/example/demo/DemoApplication.java
- **Line Number:** 30-34
- **File:** src/main/java/com/example/demo/controllers/AddProductController.java
- **Line Number:** 14-17
- **File:** src/main/java/com/example/demo/domain/InhousePart.java
- **Line Number:** 14-15
- **File:** src/main/java/com/example/demo/domain/OutsourcedPart.java
- **Line Number:** 14-15
- **File:** src/main/java/com/example/demo/domain/Part.java
- **Line Number:** 26-30, 40-47, 81-82, 85-86, 89-90, 93-102
- **Change:** Added fields for maxInv and minInv, including getters and setters.
- **File:** src/main/resources/templates/InhousePartForm.html
- **Line Number:** 14-22
- **File:** src/main/resources/templates/OutsourcedPartForm.html
- **Line Number:** 13-21
- **Change:** Added input fields for minInv and maxInv.
- **File:** src/main/java/com/example/demo/application.properties
- **Line Number:** 6
- **Change:** Changed the name of the database.

## H. Add Validation
- **Prompt:** Add validation for between or at the maximum and minimum fields.
- **File:** src/main/java/com/example/demo/domain/Part.java
- **Line Number:** 29
- **File:** src/main/java/com/example/controller/AddInhousePartController.java
- **Line Number:** 38-43
- **File:** src/main/java/com/example/controller/AddOutsourcedPartController.java
- **Line Number:** 38-44
- **Change:** Added validation logic in the save method to ensure inventory is between min and max values.

## I. Add Unit Tests
- **Prompt:** Add at least two unit tests for the maximum and minimum fields.
- **File:** src/test/java/com/example/demo/PartTest.java
- **Line Number:** 6-9, 35-37, 169-198
- **Change:** Added unit tests for maxInv and minInv fields.
- **File:** src/main/java/com/example/demo/domain/Part.java
- **Line Number:** 10 & 105-129
- **Change:** Added toString, boolean & hashcode public functions to correlate with PartTest.java.

## J. Clean Code
- **Prompt:** Remove the class files for any unused validators.
- **File:** Various files in src/main/java/com/example/demo/validators
- **Line Number:** DeletePartValidator.java
- **Change:** Removed unused validator class files to clean up the codebase.
