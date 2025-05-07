package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {


    @Test
    public void checkIn_RoomAvailable_occupiedAndDirty() {
        //arrange
        Room room = new Room(1, 150);


        //act
        room.checkIn();

        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }
    @Test
    public void checkout_RoomUnoccupied() {
        //arrange
        Room room = new Room(2, 250);
        room.checkIn();


            //act
        room.checkout();

            //assert
        assertFalse(room.isOccupied());
        }
        @Test
        public void cleanRoom_notDirty () {
            //arrange
        Room room = new Room(3, 350);
      room.checkIn();
        room.checkout();


            //act
        room.cleanRoom();
            //assert
            assertFalse(room.isDirty());
        }

    }
