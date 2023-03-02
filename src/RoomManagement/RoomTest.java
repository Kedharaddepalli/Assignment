package RoomManagement;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    public void testConstructor() {
        Room room = new Room("Room1", 300);
        assertEquals("Room1", room.getName());
        assertEquals(300, room.getSize());
        assertEquals(0, room.getNumProjectors());
        assertEquals(1, room.getNumTables());
        assertEquals(1, room.getNumChairs());
    }

    @Test
    public void testAddProjector() {
        Room room1 = new Room("Room1", 300);
        Room room2 = new Room("Room2", 500);
        room1.addProjector();
        room2.addProjector();
        room2.addProjector();
        room2.addProjector();
        assertEquals(1, room1.getNumProjectors());
        assertEquals(3, room2.getNumProjectors());
    }

    @Test
    public void testAddTable() {
        Room room = new Room("Room1", 300);
        room.addTable();
        room.addTable();
        assertEquals(3, room.getNumTables());
    }

    @Test
    public void testAddChair() {
        Room room = new Room("Room1", 300);
        room.addChair();
        room.addChair();
        assertEquals(3, room.getNumChairs());
    }

    @Test
    public void testAddProjectorExceedLimit() {
        Room room1 = new Room("Room1", 300);
        Room room2 = new Room("Room2", 500);
        room1.addProjector();
        room1.addProjector();
        room1.addProjector();
        room2.addProjector();
        room2.addProjector();
        room2.addProjector();
        room2.addProjector();
        assertEquals(2, room1.getNumProjectors());
        assertEquals(3, room2.getNumProjectors());
    }

}
