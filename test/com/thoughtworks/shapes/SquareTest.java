package com.thoughtworks.shapes;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by abhijeetshelake on 5/30/16.
 */
public class SquareTest {

    @Test
    public void testArea() throws Exception {
        assertThat(new Square(3.0).area(), is(9.0));
    }
}