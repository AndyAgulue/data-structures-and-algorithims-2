# data-structures-and-algorithims-2



## Reverse an Array

Reverse the contents of an array

## Challenge

Take an array of numbers and reverse the order of the numbers in the array.

## Approach & Efficiency

Made an array of numbers, and declared an empty array. Looped through the first array and saved the the value of the looped array to the new array at the index of negative one.

## Solution

![white board](assets/array-reverse.png)

## Singly Linked List

### Challenge
- Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node. Within your LinkedList class, include a head property. -- Upon instantiation, an empty Linked List should be created.

- Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
- Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
- Define a method called toString (or str in Python) which takes in no arguments and returns a string representing all the values in the Linked List, formatted as: "{ a } -> { b } -> { c } -> NULL"

### Approach & Efficiency


### API
- Insert method that receives an int as input. Creates a new node at the position of head that carries the input value. If statement checks if the tail position is null, and if so creates another head in the list and assigns it a the value.
- Includes method takes in an int, and loops for as long as the current node is null. If the input value matches the value of the current node then the method returns true. If not, the loop tests the next node in the list. When the loop runs out of nodes to check and has not found it's match it returns false.
toString method takes in no arguments. It creates an empty string to serve as a vessel, and loops through the nodes in the list and adds the node values along with string concatenation for formatting to the empty string , and then returns the now filled string.

## Linked List Insertions

### Challenge
Write the following methods for the Linked List class:

- .append which adds a new node with the given value to the end of the list

- .insertBefore which add a new node with the given new value  before the first value node

- .insertAfter which add a new node with the given new value  after the first value node

### Aprroach and Efficiency

- Append: Looped through the linked-list, and while the target node has a value it moves to the next node. If the node is null then a new node is created in it's place posessing the value taken in by the method, and a new node of null is created and added to the end of the list.

- InsertBefore Looped through the linked-list while the current node is not null. If the next node in the list has a value that matches the input value then a new node carrying the new  value is created and put in the current nodes position in the list, and that node is moved down the list by one. 

- InsertAfter Looped through the linked-list while the current node is not null and if the next node in the list has a value that is the same as the input value then a new node carrying the new input value is created and put in the current node's position in the list and that node is moved up a postistion. 


## K-th value from the end of a linked list

### Description
Write a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list. You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.


### Approach and efficiency
- Start with root node as pointer node and initialize index with 0;
- If  pointer node data equal to input data , then return the index value.
- If pointer node data is not equal to input data, increment index by one and update pointer node as next node.
- Continue the steps 2 and 3 end of the linked list.
- If data not found in linked list , return -1.

### Link
[code challenge 7](challenges/lib/src/main/java/challenges/linkedList/LinkedList.java)


### Solution
<img width="665" alt="Screen Shot 2021-03-30 at 3 47 04 PM" src="https://user-images.githubusercontent.com/74209521/113066970-54ccba80-9170-11eb-9c10-23a800a85fba.png">

# Zipped Linked-List

Combine two lists in an alternate manner.

## Description

Write a function called zipLists which takes two linked lists as arguments. Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list.

## Approach & Efficiency

Run a loop, while there are available positions in the first loop insert nodes of second list by changing pointers.

## Whiteboard

White board with Barrett Nance  and Joseph Lee 

<img width="1519" alt="Screen Shot 2021-03-31 at 10 06 47 PM" src="https://user-images.githubusercontent.com/74209521/113251030-7021ed80-9276-11eb-936b-f1c4a2cac893.png">


# Stacks and Queuess

## Description

Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.
Create a Stack class that has a top property. It creates an empty Stack when instantiated.

## Approach and efficiency

Time and efficiency of 0(1)

## API

### Stack

**Push** Takes in a value as an argument and adds it to the top of the stack with an efficeincy of 0(1).

**Pop** Removes the top most node in a stack, returns the value of the stack.

**Peek** Returns the value of the node on top of the stack.

**isEmpty** Checks to see if Stack is empty, returns true or false.

### Queue

**EnQueue** Takes in a value as an argument and adds it to the top of the stack with an efficeincy of 0(1).

**Pop** Removes the top most node in a stack, returns the value of the stack.

**Peek** Returns the value of the node on top of the stack.

**isEmpty** Checks to see if Stack is empty, returns true or false.


# PseudoQueue

## Description

Create a brand new PseudoQueue class. Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 Stack objects. Ensure that you create your class with the following methods:

enqueue(value) which inserts value into the PseudoQueue, using a first-in, first-out approach.
dequeue() which extracts a value from the PseudoQueue, using a first-in, first-out approach.
The Stack instances have only push, pop, and peek methods. You should use your own Stack implementation. Instantiate these Stack objects in your PseudoQueue constructor.

## Approach and efficiency

**Enqueue** Check to see is any of the stacks are empty, push into empty stack, return the value in empty stack
Efficiency 0(1)

**Dequeue** Check to make sure both stcks are not empty as long as one stack is empty, pop the first value form the full stack and pop into the second stack
Efficiency 0(n)

## Whiteboard


<img width="1065" alt="Screen Shot 2021-04-05 at 6 52 59 PM" src="https://user-images.githubusercontent.com/74209521/113648203-12f4b600-9641-11eb-8af3-9aecf6030e2a.png">


# Animal Shelter

## Description

Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.


## Approach and efficiency

Time and efficiency of 0(1)


## Whiteboard


<img width="704" alt="Screen Shot 2021-04-06 at 2 33 57 PM" src="https://user-images.githubusercontent.com/74209521/113819086-ac999180-972d-11eb-802c-eed9eba68b19.png">

# Multi Bracket Validation

## Description

Write a function that takes a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:
() [] {}

## Efficiency and Approach
Time 0(n)
Space 0(1)

Iterate over the string. If one of the characters is an open brace, push it into a stack. If the character is a closing brace, check for a matching brace at the top of the stack. If it is, continue iterating over the string, if it isn't, return false. After iterating over the entire string and the stack is empty, return false.

## White Board
![mbv](https://user-images.githubusercontent.com/74209521/113978408-c48a1780-97f8-11eb-8216-7d51e5c378c3.jpeg)
Completed with Matthew Simms and Barrett Nance










