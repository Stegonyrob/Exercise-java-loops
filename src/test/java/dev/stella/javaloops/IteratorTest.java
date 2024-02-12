package dev.stella.javaloops;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    void testIteration() {
        Iterator iterator = new Iterator(7);

        assertThat(iterator.printMultTable(iterator.getSelectedNumber()), is("7 x 1 = 7" + "\n" + "7 x 2 = 14" + "\n" + "7 x 3 = 21" + "\n" + "7 x 4 = 28" + "\n" + "7 x 5 = 35" + "\n" + "7 x 6 = 42" + "\n" + "7 x 7 = 49" + "\n" + "7 x 8 = 56" + "\n" + "7 x 9 = 63" + "\n" + "7 x 10 = 70"));
    }
}