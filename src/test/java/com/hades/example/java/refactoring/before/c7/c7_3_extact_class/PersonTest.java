package com.hades.example.java.refactoring.before.c7.c7_3_extact_class;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void getTelephoneNumber() {
        Person person = new Person();
        person.setOfficeAreaCode("+86");
        person.setOfficeNumber("12345678");
        Assert.assertEquals("(+86) 12345678", person.getTelephoneNumber());
    }
}