package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
	public static final int MAX_NUMBERS_IN_STORE = 10000;
    private DigitalVideoDisc itemsInStore[] = 
            new DigitalVideoDisc[MAX_NUMBERS_IN_STORE];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore <= MAX_NUMBERS_IN_STORE) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("The DVD has been added.");
        } else {
            System.out.println("The store is almost full.");
        }  
    }

    public void removeDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].equals(disc)) {
                for (int j = i; j < qtyInStore; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                i--;
                qtyInStore--; // reduce the number of elements in the array
                System.out.println("The DVD has been removed.");
            }
        }
    }
}
