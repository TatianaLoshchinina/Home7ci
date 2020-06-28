package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticTest {
    @Test
    void findMax() {
        Static service = new Static();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
   @org.junit.jupiter.api.Test
  void useCurrentMax() {
      Static service = new Static();

       long[] incomesInBillions = {12, 5, 8, 14, 5, 3, 8, 6, 11, 11, 12};
       long expected = 14;

       long actual = service.findMax(incomesInBillions);

       assertEquals(expected, actual);
    }
}