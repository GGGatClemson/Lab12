import java.util.ArrayList;

public class Room
{
    String name;
    String description;
    ArrayList<String> exits;
    
    /**
     * Initialize a room
     * @param name the name of the room
     * @param description the description of the room
     */
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }
    /* Generate getters and setters for the names and descriptions */
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }

    /**
     * Adds an exit to the room
     * @param exit room name of the exit to be added to the room
     */
    public void addExit(String exit)
    {
        this.exits.add(exit);
    }

    /**
     * List all of the rooms as a string
     * @return returns all of the names of the rooms on new lines
     */
    public String listExits() {
        String daExits = "";
        for (String i: exits){
            daExits += i + "\n";
        }
        return daExits;
    }

    /**
     * Generates a string representation of the room using the name and description and lists all of the exits.
     */
    public String toString() {
        String daRoom = name;
        daRoom += ":" + description;
        daRoom += "\n" + listExits();
        return daRoom;
    }
}
