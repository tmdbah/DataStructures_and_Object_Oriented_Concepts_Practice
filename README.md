# Data Structures and Object Oriented concepts Practice

In this mini-project we will practice using Data Structures and Object Oriented concepts in Java.

***Implementation targets the most efficient algorithms and data structures.***
Use one or more of the following data structures.
- ArrayList
- HashSet
- HashMap

### Question 1 (10 Points)

Write a method that loops over the numbers from 1 to 20 and prints the numbers.

1. But for multiples of three print “Fizz” instead of the number and for the multiples of
five print “Buzz”.
2. For numbers which are multiples of both three and five print “FizzBuzz”

### Question 2 (10 Points)

Write a method that accepts an integer and returns true if the number is even and false
otherwise.

### Question 3 (10 Points)

Write a method that accepts an array of numbers and returns the minimum number in
the array. If the array is empty return null.

### Question 4 (10 Points)

You are provided with the Data class that contains a users array (Data.users) which is
an array of users. Each element in the array represents a single user record. Each
record is a string formatted as : firstname,lastname,age,email,gender,city,state.

You are asked to perform the following tasks:

1. Create a User class that should parse all the parameters for each user. Hint: extract
each value from a user's record using Java's String.split() method and set the
delimiter to a comma. Each user record should to be assigned to a User object.

2. Write a method that accepts an array of strings and returns an ArrayList of User
objects.

### Question 5 (10 Points)

Write a method that accepts an ArrayList of User objects. The method should print out
the names of users that start with O, M or N.

### Question 6 (10 Points)

Write a method that accepts an ArrayList of User objects, sorts the users by their age in
ascending order, and prints user name and age sorted by age in ascending order. 

Hint:
To sort use the Collections.sort(). http://docs.oracle.com/javase/6/docs/api/java/util/Collections.html

### Question 7 (10 Points) 

Write a method that accepts an ArrayList of User objects. The method should print the
Top 10 oldest users.

### Question 8 (10 Points)

Write a method that accepts an ArrayList of User objects. The method should count the
number of users living each state, then print State, Count for each of the accumulated
counts.

### Question 9 (10 Points)

Write a method that accepts two Arrays of words (strings), namely listA and listB. The
method should return the set of words (strings) that overlap in both lists, this is the
intersection of both lists. Hint: it is a good idea to use Sets.

- You can use the Data.words_1 and Data.words_2 for testing your method.

### Question 10 (10 Points)

Write a method that accepts two ArrayLists of Users. The method should return the list
of User objects that exist in both lists.
- Two users are equal if all their attributes are equal.
- You can use the Data.users and Data.otherUsers for testing your method.

