package ru.ssau.tk.lenuska0506.doska;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void  testGetSet() {

        Person o1 = new Person();
        Person o = new Person();
        o1.setFirstName("Samoletik");
        o1.setLastName("Gosha");
        o1.setPassportId(7654321);
        o.setGender(Gender.FEMALE);

        o.setLastName("Tank");
        o.setFirstName("Lena");
        o.setPassportId(1234567);
        o1.setGender(Gender.MALE);

        assertEquals(o1.getFirstName(), "Samoletik");
        assertEquals(o1.getLastName(), "Gosha");
        assertEquals(o1.getPassportId(), 7654321);
        assertEquals(o1.getGender(), Gender.MALE);
        assertEquals(o.getLastName(), "Tank");
        assertEquals(o.getFirstName(), "Lena");
        assertEquals(o.getPassportId(), 1234567);
        assertEquals(o.getGender(), Gender.FEMALE);
    }
}
