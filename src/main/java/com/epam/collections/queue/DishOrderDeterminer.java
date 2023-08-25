package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        List<Integer> result = new ArrayList<>();
        int eaten = 0;
        
        while (!queue.isEmpty()) {
            eaten++;
            if (eaten % everyDishNumberToEat == 0) {
                result.add(queue.poll());
            } else {
                queue.add(queue.poll());
            }
        }

        return result;
    }
}
