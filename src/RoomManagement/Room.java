package RoomManagement;

public class Room {
    private String name;
    private int size;
    private int numProjectors;
    private int numTables;
    private int numChairs;

    public Room(String name, int size) {
        this.name = name;
        this.size = size;
        this.numProjectors = 0;
        this.numTables = 1;
        this.numChairs = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumProjectors() {
        return numProjectors;
    }

    public void setNumProjectors(int numProjectors) {
        this.numProjectors = numProjectors;
    }

    public int getNumTables() {
        return numTables;
    }

    public void setNumTables(int numTables) {
        this.numTables = numTables;
    }

    public int getNumChairs() {
        return numChairs;
    }

    public void setNumChairs(int numChairs) {
        this.numChairs = numChairs;
    }

    public void addProjector() {
        if (size > 400 && numProjectors < 3) {
            numProjectors++;
        } else if (size <= 400 && numProjectors < 2) {
            numProjectors++;
        } else {
            System.out.println("Error: Maximum number of projectors exceeded for this room size.");
        }
    }

    public void addTable() {
        numTables++;
    }

    public void addChair() {
        numChairs++;
    }

}
