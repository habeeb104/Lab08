package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);

        // Ensure it's there first
        assertTrue(list.hasCity(city));

        // This will cause a compilation error initially (The "Red" phase)
        list.deleteCity(city);

        // Verify it's gone
        assertFalse(list.hasCity(city));
    }


}
