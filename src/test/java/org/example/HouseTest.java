package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    public void getHouseValue(){
        //Arrange
        //Excellent condition, 500 sq. ft 1000 lot size
        House house = new House("My Mansion", "12-01-2002", 1000, "123 address",
                1, 500, 1000);

        //Act
        //run get value and see what happened
        double testValue = house.getValue();

        //Assert
        //I assert the result will be 90250
        assertEquals(90250, testValue);
    }
}