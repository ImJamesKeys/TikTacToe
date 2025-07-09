# TikTacToe
This is a practice of uploading projects to GitHub and keeping track of the fun projects I've created. This is a Tic Tac Toe game that can be played in an IDE. This is a Java project made in the Eclipse IDE.

Play.java
This starts the game and holds the main class by having the start gameplay function.

Board.java
This code creates a new board when a move is played. This is done line by line and take the array of all the moves that have been made. When a move is made, it is placed within the array. based on the array we can determine the place of each X and O  and use the function to display each on as the lines are printing.

Gameplay.java
The gameplay is done by counting the number of rounds, an array of the placements, and the count of each possible way of winning. By giving a number 0-8, it determines where you want to place, based on the location on the board. This is also placed in an array as a 1 for X and a 4 for O. All combinations of winning are added up, and if one equals 3, then X wins, and if any equal 12, then O wins. If neither, then it continue, or its a tie if no more available positions.
