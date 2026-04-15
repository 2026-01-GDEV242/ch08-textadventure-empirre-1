import java.util.ArrayList;

/**
 * Represents the player in the game.
 * Stores the player's current location and inventory.
 *
 * @Saba Machavariani
 * @version 1.0 04/13/26
 */
public class Player
{
    private Room currentRoom;
    private ArrayList<Item> inventory;

    /**
     * Create a player starting in a given room.
     * @param startRoom the starting location of the player
     */
    public Player(Room startRoom)
    {
        currentRoom = startRoom;
        inventory = new ArrayList<>();
    }

    /**
     * gets the current room player is in.
     * @return current Room
     */
    public Room getCurrentRoom()
    {
        return currentRoom;
    }

    /**
     * Sets the player's current room.
     * @param room the new room
     */
    public void setCurrentRoom(Room room)
    {
        currentRoom = room;
    }

    /**
     * Add an item to the player's inventory.
     * @param item item to add
     */
    public void addItem(Item item)
    {
        inventory.add(item);
    }

    /**
     * Remove an item from inventory.
     * @param item Name of item
     * @return removed item or null if not found
     */
    public Item removeItem(String itemName)
    {
        for(Item item : inventory) {
            if(item.getDescription().equalsIgnoreCase(itemName)) {
                inventory.remove(item);
                return item;
            }
        }
        return null;
    }

    /**
     * Print inventory contents.
     * @return string listing all items
     */
    public String getInventory()
    {
        if(inventory.isEmpty()) {
            return "You have nothing!";
        }

        String result = "You are holding:";
        for(Item item : inventory) {
            result += " " + item.getDescription();
        }
        return result;
    }
}