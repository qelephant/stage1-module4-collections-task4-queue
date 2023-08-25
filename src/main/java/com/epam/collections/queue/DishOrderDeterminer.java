package com.epam.collections.queue;

import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> integerList = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numberOfDishes; i++) {
            queue.add(i);
        }
        List<Integer> tempList = new ArrayList<>(queue);

        for (Integer element : tempList) {
            if(element % everyDishNumberToEat == 0)
            integerList.add = element;
        }
        return integerList;
    }
}
