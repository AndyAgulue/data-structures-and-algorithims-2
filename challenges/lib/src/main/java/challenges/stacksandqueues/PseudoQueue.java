package challenges.stacksandqueues;

public class PseudoQueue {
    Stack stackOne;
    Stack stackTwo;

    public PseudoQueue(){
        stackOne = new Stack();
        stackTwo = new Stack();
    }

    public void push(Stack<Integer> topNode, int newValue) {
        // push the data onto the stack
        topNode.push(newValue);
    }

    public int pop(Stack<Integer> topNode){
        if (topNode.isEmpty()) { // if stack is empty, throw an error
            System.out.println("Stack Empty");
            System.exit(0);
        }
        return topNode.pop(); //pop the value form the stack
    }
    public void enQueue(int value){
//        push(stackOne, value);
        stackOne.push(value);
    }

    public void deQueue(int value){
       // int value;

        // if both stacks are empty, throw an error
        if(stackOne.isEmpty() && stackTwo.isEmpty()) {
            System.out.println("Stack is empty");
            System.exit(0);
        }
        // move elements from StackOne to stackTwo only if stack two is empty
        if (stackTwo.isEmpty()){
            while(!stackOne.isEmpty()){
                push(stackTwo, pop(stackOne));
            }
        }


    }

}
