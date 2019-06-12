Nick Passantino
Professor Farag
CS410
6/11/19


Code Smells:
1.) There were if else statements where there should have been seperate objects.
I removed the actionPerformed() code into discrete files
that each implement ActionListener. I then removed lines 72
through 122. Then many import statements and the setActionCommand()
statements were able to be removed.

2.) The names of all the variables were nondescriptive. I renamed
each variable to more accurately specify it's function.

3.) The menus seemed like they could (and should) be their own
objects, so I made a FileMenu class and an EditMenu class which each
added their respective buttons.

4.) The code had no comments, so I added comments in many sections.

Practices I applied:
-renaming variables to be descriptive (no variable in main constructor was descriptive)
-broke up the main class into several objects (with packages for each set of related objects)
-moved related pieces of code next to each other, and gave spacing in between to improve readability. 
