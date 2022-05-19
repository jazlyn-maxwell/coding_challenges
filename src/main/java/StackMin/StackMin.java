package StackMin;

import java.util.Stack;

/**
 * @author Jazlyn Maxwell
 */
class StackMin {

    private Stack<Node> stack;

    /**
     * Default constructor
     */
    public StackMin() {
        super();
    }

    /**
     * Push a new node onto the stack
     * The min of the node is either the current min,
     * or the newest value being added to the stack
     * @param value of new node
     */
    public void push(int value) {
        if (stack.empty()) {
            stack.push(new Node(value, value));
        }
        else if (value < stack.peek().min) {
            stack.push(new Node(value, value));
        }
        else {
            stack.push(new Node(value, stack.peek().min));
        }
    }

    /**
     * @return value of the node from the stack and
     * remove the node from the top of the stack
     */
    public int pop() {
        return this.stack.pop().value;
    }

    /**
     * @return min of the node from the stack
     */
    public int min() {
        return this.stack.peek().min;
    }

    /**
     * @return value of the node from the stack
     */
    public int peek() {
        return this.stack.peek().value;
    }
}