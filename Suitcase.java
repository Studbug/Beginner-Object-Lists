
import java.util.ArrayList;

public class Suitcase {

    final private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);;
        }
    }

    public void printItems() {
        if (this.items.isEmpty()) {
            System.out.println("Suitcase is empty.");
        }
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int currentWeight = 0;
        if (this.items.isEmpty()) {
            return 0;
        } else {
            for (Item item : items) {
                currentWeight += item.getWeight();
            }
        }
        return currentWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = this.items.get(0);
        for (Item item : items) {
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

    @Override
    public String toString() {
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        } else if (this.items.isEmpty()) {
            return "no items (0kg)";
        }
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
    
}
