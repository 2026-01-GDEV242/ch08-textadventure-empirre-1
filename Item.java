 /**
 * Represents an item in the game.
 * Items can be found in rooms or carried by the player.
 *
 * @Saba Machavariani
 * @version 1.0 04/13/26
 */
public class Item
{
    private String description;
    private int weight;

    /**
     * Create a new item.
     * @param description name/description of item
     * @param weight of item
     */
    public Item(String description, int weight)
    {
        this.description = description;
        this.weight = weight;
    }

    /**
     * Get items description.
     * @return items description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Get item weight.
     * @return weight of item
     */
    public int getWeight()
    {
        return weight;
    }
}