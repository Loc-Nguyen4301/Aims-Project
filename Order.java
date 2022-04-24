
public class Order {
    public static final int MAX_NUMBER_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    int arrayLength = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (arrayLength < MAX_NUMBER_ORDERED) {
            itemsOrdered[arrayLength] = disc;
            arrayLength++;
        } else {
            System.out.println("Can't add item have title \"" + disc.getTitle() + "\" in Order");
        }
    }

    public int index;

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < arrayLength; i++) {
            if (itemsOrdered[i]== disc) {
                index = i;             
                for (int j = index; j < arrayLength-1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                arrayLength--;
            }
        }
    }

    public float totalCost() {
        float total =0f;
        for (int i = 0; i < arrayLength; i++) {
            total+= itemsOrdered[i].getCost();
        }
        return total;
    }
}
