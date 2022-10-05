package comp1110.lab9;

import java.util.EmptyStackException;

/**
 * This class represents a stack, in which elements are added and removed in a
 * last in, first out (LIFO) order. Duplicate elements are permitted.
 * When a stack is first created, it contains no elements.
 * The stack can grow to fit new elements as required.
 * Attempting to pop() or peek() an empty stack throws an EmptyStackException,
 * and does not result in any modification to the stack.
 * The Stack is implemented using an array data structure (a regular Java array),
 * and does not use any of the Java Collection classes other than
 * java.util.EmptyStackException.
 */
public class ArrayStack<T> {
    /**
     * @return true if the stack is empty
     */
    T[] stack = (T[]) new Object[0];
    public boolean isEmpty() {
        return this.stack.length == 0;
    }

    /**
     * Add the given value to this stack,
     * placing it at the top of the stack.
     *
     * @param value the value to add to this stack
     */
    public void push(T value) {
        int newLength = this.stack.length + 1;
        T[] newStack = (T[]) new Object[newLength];
        for (int i = 0; i < this.stack.length; i++) {
            newStack[i] = this.stack[i];
        }
        newStack[newLength-1] = value;
        this.stack = newStack;
    }

    /**
     * Remove the value that is at the top of this stack, and return it.
     *
     * @return the value that was popped from the stack
     * @throws EmptyStackException if the stack is currently empty
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int newLength = this.stack.length - 1;
        T[] newStack = (T[]) new Object[newLength];
        for (int i = 0; i < newLength; i++) {
            newStack[i] = this.stack[i];
        }
        T poppedElem = stack[stack.length - 1];
        stack = newStack;
        return poppedElem;
    }

    /**
     * Get the value that is currently at the top of this stack,
     * but do not remove it from the stack.
     *
     * @return the value at the top of the stack
     * @throws EmptyStackException if the stack is currently empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[stack.length-1];
    }

    /**
     * Check whether a given value is contained in this stack.
     * Specifically, returns true if value is not null and
     * an element e is contained in the stack such that e.equals(value).
     *
     * @param value the value to search for
     * @return true if the value is contained in this stack
     */
    public boolean contains(T value) {
        if (value == null) {
            return false;
        }
        for (T i : stack) {
            if (i.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Create a String representation of this stack.
     * Elements on the stack are listed in order from top to bottom,
     * separated by commas (without spaces).
     * If the stack is empty, an empty string is returned.
     * For example, a stack containing the elements (from top to bottom)
     * "a", "b", and "c" would be represented as "a,b,c".
     *
     * @return a String representation of this stack
     */
    public String toString() {
        if (isEmpty()) {
            return "";
        }
        String s = "";
        for (int i = stack.length - 1; i >= 0; i--) {
            if (i == stack.length - 1) {
                s += stack[i].toString();
            }
            else {
                s += ",";
                s += stack[i].toString();
            }
        }
        return s;
    }
}
