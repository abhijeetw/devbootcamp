package com.thoughtworks.shapes;

import com.thoughtworks.shapes.Rectangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by abhijeetshelake on 5/30/16.
 */
public class RectangleTest {

    @org.junit.Test
    public void testarea() throws Exception {
        assertThat(new Rectangle(2,3).area(), is(6.0));
    }
}

