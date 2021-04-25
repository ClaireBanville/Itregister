# Itregister
IT Docket Submittion System -

This project has been created at the request of our client to create an IT docket submission system for their staff and IT team to be able to report, access and respond to issues staff are facing with their equiptment, local or server systems and programs. The aim of this project it to allow users to create an account from which they are able to lodge and view the progress of IT dockets. In turn the IT team will be able to view and manage IT dockets that have been assigned to them through the consol, IT members will be able to provide feedback, escalate the tasks, change severity and resolve dockets. 

Getting Started
To start running the program extract all the .java files from the .zip folder submitted to canvas and open Open JDK CMD to run the program. 

File paths can be found in the address bar of windows file explorer in order to locate the files.

Type this into the CMD terminal:
javac Collections.java Technician.java User.java Logged_In_Menu_User.java Menu_Regex.java Ticket.java Top_Menu.java Main.java Logged_In_Menu_Technician.java

then type this to run the program:
java Top_Menu

Prerequisites

In order to run the program users will have to have access to Open JDK CMD or Eclipse to run the script in a test environment.

Running the tests - 

 - The program will be started at the Top Menu.
 - Users will have the menu options to register an account or log in to an existing account.
 - Input is numerical - users will select the option they want by inputing the corresponding number at the start of the menuoption they want.
 - If Register an account was selected the user will be prompted to enter their full name, phone number, email address and password they would like for their account. From here the user will be taken back to the top menu to log in.
 - If Log in is selected the user will be prompted to enter their email address and password. From here the user will be taken to the logged in menu where they can submit an IT Ticket, View IT Tickets or change their password.
 - If Submit and IT Ticket is selected the user will be prompted to enter a description of their issue and then enter a severity level for their issue. Once submitted the ticket is sent to the IT Team and the user is taken back to the Logged In Menu
 - If View IT Tickets is selected the user will be presented a list of all IT Dockets they have submitted and their progress.(development in progress)
 - On all menus the system can be logged out of by selecting option 3.

Built With
Eclipse
OpenJDK

Authors
Claire Banville
Joel Goddard
Connor Logan
