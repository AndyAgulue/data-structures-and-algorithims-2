# Zipped Linked-List

Combine two lists in an alternate manner.

## Description

Write a function called zipLists which takes two linked lists as arguments. Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list.

## Approach & Efficiency

Run a loop, while there are available positions in the first loop insert nodes of second list by changing pointers.

## Whiteboard

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

