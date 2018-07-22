# javadeveloper
Movement on a 2D Plane

Create a 2D character array with 5 rows and 5 columns
To start, fill every position with an O.
Then, fill the [0][0] position with an X.
This X represents the user's "avatar".

Create a loop which does the following:
-Starts by printing the array
-Asks the user for what direction they would like to go
-Waits for user input
-Moves the avatar in that direction, if it exists (ie: up=row-1, right=column+1)
-If it does not exist, tell the user and exit the program
-Fill the avatar's new position with an X
-Fill the avatar's old position with an O
