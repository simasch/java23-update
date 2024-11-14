package ch.martinelli.edu;

import ch.martinelli.edu.calendar.Day;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchExpressionsTest {

    /**
     * Exercise 1: Replace the switch statement with a switch expression
     */
    @Test
    void switchExpression() {
        int numberOfLetters = getNumberOfLetters(Day.WEDNESDAY);

        assertEquals(9, numberOfLetters);
    }

    private int getNumberOfLetters(Day day) {
        return switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
        };
    }

    /**
     * Exercise 2: Create the same switch expression as in exercise 1 but this time with {} and yield
     * Bonus: Try to remove a yield statement and check what happens
     */
    @Test
    void switchExpressionWithYield() {

    }

    /**
     * Exercise 3: Make the commented switch expression compile
     */
    @Test
    void incompleteSwitch() {
        Day day = Day.MONDAY;

//        int numberOfLetters = switch (day) {
//             case MONDAY -> 1;
//        };
    }
}
