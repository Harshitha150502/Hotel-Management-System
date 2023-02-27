# Hotel-Management-System
The project is developed using Java NetBeans IDE and MySQL
In hotel management system we have tried to show how the data/information in hotels is managed. This system can be used to maintain the records of the customers and the rooms in the hotel. Based on the facilities provided by the hotel and the services used by the customers, appropriate result is generated and stored in the database. Hotel management becomes instrumental because existing system in various hotels includes either manual work or some software that does not fulfill all the requirements. Any errors in this may lead to financial loss for the hotel. Therefore, we can develop a hotel management system using MYSQL for database part which is the backend and the data from the database is retrived using JAVA GUI in the frontend. The admin is only given the access to the database through the login id and password details. It provides easy information refreshing, manage the hotel related decisions, data consistency and backup and helps in overcoming the old procedures. Future enhancement: Enhancements can be done in an efficient manner. We can even update the same with the further modification establishment and be integrated with minimal modification. Thus the project is flexible and can be enhanced anytime with more advanced features. 

STEP 1: Start

STEP 2: Create the java project and create the packages.

STEP 3: Extract the SQL jar connector to a folder and include in the libraries package for connection.

STEP 4: Do the connection of the SQL database to the Java NetBeans in the project package and create the tables and write the necessary queries in this project package creating java classes.

STEP 5: Create a login page in the default page for the user and the admin to login.

STEP 6: Create a sign up page for a new register to login.

STEP 7: Create a welcome admin page for the admin only to access to change the status of the user to true or false.

STEP 8: Create a home page for the user interaction which consists of the modules like manage rooms, customer check-in, customer check-out, customer details bill and exit functions.

STEP 9: Manage rooms will store the information related to the rooms booked, available etc.

STEP 10: Customer check-in will contain the customer related information and the date when he entered the hotel and will keep track of it.

STEP 11: Customer check-out will calculate the outgoing date of the customer from the hotel.

STEP 12: Customer details bill will generate the price for the customer stay in the hotel, by calculating the number of days stay of the customer in the hotel.

STEP 13: Run the created pages, GUI will be generated for the user interaction. 

STEP 14: The data entered into the GUI will be stored in the backend database and only the necessary details at that point will be displayed on the GUI.

STEP 15: The bill generated on GUI will be converted into PDF format so that it will be easy for the customers to understand.

STEP 16: Stop.

System Modules

We have the following packages and classes defined in the JavaNetBeans IDE hotel management system project:
•	Source packages: It contains default package which in turn contains the jframe forms adminhome, customercheckin, customercheckout, customerdetailsbill, forgotPassword, home, login, manageroom and signup.

These are all used for the graphical user interfaces created using java.

•	Pictures package: It contains the pictures used for creating the graphical user interface.
•	Project package: It contains the java program related to the connection of the database MySQl to the hotel management system project. It also contains the java classes tables, iud and select for storing and accessing the database in the project.
•	Libraries package: It contains the SQL jar connector file which is used to connect database to the javaNetBeans and the itextpdf jar file to store the generated result from the project in the form of a PDF.
•	Services: It shows the database connection to the project and the overview of the created database that is shows the tables and the attributes in the tables.

Below are the few inbuilt packages used:

•	Java Swing is a lightweight Java graphical user interface (GUI) widget toolkit that includes a rich set of widgets.
•	Package java. util. Contains the collections framework, some internationalization support classes, a service loader, properties, random number generation, string parsing and scanning classes, base64 encoding and decoding, a bit array, and several miscellaneous utility classes.
•	Java.sql-Provides the API for accessing and processing data stored in a data source (usually a relational database) using the Java™ programming language.
•	lang package in Java. Provides classes that are fundamental to the design of the Java programming language.
•	The Java I/O package, a.k.a. java.io, provides a set of input streams and a set of output streams used to read and write data to files or other input and output sources.
•	iText is a library for creating and manipulating PDF files in Java and .NET.


