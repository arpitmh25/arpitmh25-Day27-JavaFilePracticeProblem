package com.bridgelabz.day30.cabinvoice;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class InvoiceGeneratorTest {

    public static InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {

        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);

    }

    @Test
    public void givenLessDistanceAndTime_ShouldReturnMinFare() {

        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }
}