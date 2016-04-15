/**
 * Created by RobertBarber on 4/8/16.
 */
public class ShoeInventory {

    private String name;
    private int quantity;
    private String category;

    public ShoeInventory(){
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShoeInventory(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("Name: %s  qty %s\n", name, quantity);
    }
}
