import java.util.ArrayList;

public class Hold {
    private final int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int weight) {
        this.maxWeight = weight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int currentWeight = 0;
        if (this.suitcases.isEmpty()) {
            return 0;
        } else {
            for (Suitcase suitcase : suitcases) {
                currentWeight += suitcase.totalWeight();
            }
        }
        return currentWeight;
    }
    
    public void printItems() {
        if (this.suitcases.isEmpty()) {
            System.out.println("The suitcase is empty.");
        }
        for (Suitcase suitcase : suitcases) {
             suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
