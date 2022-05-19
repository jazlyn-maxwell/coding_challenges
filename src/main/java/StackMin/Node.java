package StackMin;

/**
 * A node containing a value and a minimum
 * to be used in the minimum-optimized stack.
 * 
 * @author Jazlyn Maxwell
 */
class Node {

    int value;
    int min;

    /**
     * Public argument constructor
     * @param value
     * @param min - minimum value in the stack so far
     */
    public Node(int value, int min) {
        this.value = value;
        this.min = min;
    }
}