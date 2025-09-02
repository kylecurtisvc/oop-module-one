# OOP Module 1: Classes & Objects

**Name**: Kyle Curtis

**Class**: Object Oriented Programming (COP-3330C)

**Date Submitted**: May 12, 2024

**Tools Used**: Neovim (Vim), terminal.

<br>

## What is this project?

This project is the source code for Module 1: Classes & Objects in my OOP class.

The sports app will manage soccer teams and basketball teams by specifying and updating the team,
players, and goals or points.

<br> 

## Project Instructions

Create two classes - one for each sport.  Within each class, create the following:

- Assign appropriate fields related to your sport. You should have at least 3 fields per class, and the fields should be unique to that individual sport. (You should not have two classes with the exact same fields).  You can determine the data type of each field.
- Create get and set methods for each field.
- A custom method for each sport.  For example, you can write a method called scorePoint, which prints a message that a point was just scored.  Do not use this example - make up your own custom method.
- Create a constructor for each class, that accepts all applicable fields.
- Create an overloaded constructor for each class that sets all fields to zero, or null.
- Create a print method for each class.

<br>

## Running the project

Run the project in an IDE as expected, or execute the java class file in a linux terminal (my prefered method):

```sh
cd out/
```

```sh
java SportsApp
```

<br>

output:

```txt
Bayern Munich, 11, has scored 0 goals!
Orlando Magic has 15 players and has a total of 0 points!
Bayern Munich, 11, has scored 1 goals!
Orlando Magic has 15 players and has a total of 3 points!
```

<br>

**This method assumes you have the latest LTS JDK/JRE installed and are starting from the root directory of the project.**
