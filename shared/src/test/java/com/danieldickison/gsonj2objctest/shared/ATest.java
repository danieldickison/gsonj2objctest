package com.danieldickison.gsonj2objctest.shared;

import com.google.gson.Gson;

import org.junit.Test;

import static org.junit.Assert.*;

public class ATest {
    @Test
    public void testDefaultClassName() throws Exception {
        HasD hasD = new Gson().fromJson("{}", HasD.class);
        assertNotNull(hasD);
        assertNull(hasD.d);
    }

    // Failing test case:
    @Test
    public void testRenamedClassName() throws Exception {
        HasB hasB = new Gson().fromJson("{}", HasB.class);
        assertNotNull(hasB);
        assertNull(hasB.b);
    }
}
