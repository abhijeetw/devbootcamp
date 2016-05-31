package com.thoughtworks.spoon;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by abhijeetshelake on 5/31/16.
 */
public class SpoonsTest {

    @Test
    public void testTeaSpoonEquality() throws Exception {
        assertThat(new TeaSpoons(1),is(new TeaSpoons(1)));
    }

    @Test
    public void testTableSpoonEquality() throws Exception {
        assertThat(new TableSpoons(1),is(new TableSpoons(1)));
    }

    @Test
    public void testTableSpoonTeaSpoonEquality() throws Exception {
        assertNotEquals(new TableSpoons(1),new TeaSpoons(1));
    }

    @Test
    public void test3TeaSpoonsEqual1TableSpoon() throws Exception {
        assertTrue(new TableSpoons(1).is(new TeaSpoons(3)));
    }

    @Test
    public void test2TeaSpoonsEqual1TableSpoon() throws Exception {
        assertFalse(new TableSpoons(1).is(new TeaSpoons(2)));
    }

    @Test
    public void test1CupEqual8Ounces() throws Exception {
        assertTrue(new Cups(1).is(new Ounces(8)));
    }

    @Test
    public void test1OunceEqual2tableSpoons() throws Exception {
        assertTrue(new Ounces(1).is(new TableSpoons(2)));
    }

    @Test
    public void test1PintEqual2Cups() throws Exception {
        assertTrue(new Pints(1).is(new Cups(2)));
    }

    @Test
    public void test1QuartEqual4Cups() throws Exception {
        assertTrue(new Quarts(1).is(new Cups(4)));
    }

    @Test
    public void test1GallonEqual4Quarts() throws Exception {
        assertTrue(new Gallons(1).is(new Quarts(4)));
    }

    @Test
    public void test1OunceEqual6Teaspoons() throws Exception {
        assertTrue(new Ounces(1).is(new TeaSpoons(6)));
    }

}
