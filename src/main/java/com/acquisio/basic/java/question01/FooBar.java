package com.acquisio.basic.java.question01;

/**
 * QUESTION 01: FooBar
 * You have a program that loop from 1 to 50.
 * <p>
 * The program must follow those rules:
 * - Must print 'Foo' if the value can be divided by 3.
 * - Must print 'Bar' if the value can be divided by 5.
 * - Otherwise, print the current integer value in the loop.
 *
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class FooBar {
    public static void main(String[] args) {
        FooBar main = new FooBar();
        for (int i = 1; i <= 50; i ++) {
            System.out.println(main.fooBar(i));
        }
    }

    // [aleung] Would normally clarify with customer what to do when value divisible by both 3 and 5.
    // For sake of time, simply concatenate the two.
    /**
     * Returns string representation of an integer.
     * 
     * @param value The integer representation.
     * @return The string representation 
     * (or "Foo" if divisible by 3, "Bar" if divisible by 5, "FooBar" if divisible by both.
     */
    String fooBar(int value) {
        String valueString = "";
        if (value % 3 == 0) {
            valueString += "Foo";
        }
        if (value % 5 == 0) {
            valueString += "Bar";
        }
        if (!valueString.isEmpty())
        {
            return valueString;
        }
        return String.valueOf(value);
    }
}
