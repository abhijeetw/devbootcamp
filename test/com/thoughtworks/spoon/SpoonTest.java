package com.thoughtworks.spoon;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by abhijeetshelake on 5/31/16.
 */
public class SpoonTest {

    @Test
    public void testTeaSpoonEquality() throws Exception {
        assertThat(new TeaSpoon(),is(new TeaSpoon()));
    }

    @Test
    public void testTableSpoonEquality() throws Exception {
        assertThat(new TableSpoon(),is(new TableSpoon()));
    }

    @Test
    public void testTableSpoonTeaSpoonEquality() throws Exception {
        assertNotEquals(new TableSpoon(),new TeaSpoon());
    }

    @Test
    public void test3TeaSpoonsEqual1TableSpoon() throws Exception {
        assertTrue(new TableSpoon().is(3, new TeaSpoon()));
    }

    @Test
    public void test2TeaSpoonsEqual1TableSpoon() throws Exception {
        assertFalse(new TableSpoon().is(2, new TeaSpoon()));
    }
}
