# 274-lab3
CECS 274 – In Class 3 – Statistical Analysis

A statistics teacher has a class of students and wants to do some statistical calculations on his
midterm grades. The grades are stored in a file named “Grades.txt”, and range from 0-100.
Create an ArrayList to hold the midterm grades. Read in from the file and add all grades to
the ArrayList.
Create the following functions:
1. Populate Grades – read in the file and store the grades in the ArrayList.
2. Display Grades – display the values as 10 rows of 5 values.
3. Sort List – Sort the values from low to high.
4. Sum Grades – Calculate the sum of all values and return the result.
5. Find Max – Find and return the maximum value in the list (do not assume it is sorted).
6. Find Median – Find the median value of the list, return the result.
7. Find Mode – Find the mode of the values. There may be more than one, so return a
list of all the modes.

Menu – Repeat the menu until the user quits.

Statistical Analysis
1. Display Unsorted Grades
2. Display Sorted Grades
3. Display Sum of Grades
4. Display Average Grade
5. Display Max Grade
6. Display Median Grade
7. Display Mode
8. Quit

Hints:

1. Use ArrayLists, not arrays.
2. Use either selection or bubble sort (given in the lecture notes).
3. Do not create global variables. Create the list in the main and pass it to the functions.
4. Try to create functions that are reusable (ie. your sum function can be reused to
calculate the average, your display can be reused for both sorted and unsorted lists).
5. Create a copy of the list to perform the sort on, that way the user can still view the
original array when they choose to display the unsorted grades.
6. The median requires a sorted list. Average the two median values if the length is even.
7. Calculating the mode requires that you keep track of the number of times a particular
number appears. An easy way to do this is to create an array where the indices are the
possible grades, and the values are the number of times that grade appeared.
8. Check all user input for validity.
9. Create any additional functions you find necessary.
