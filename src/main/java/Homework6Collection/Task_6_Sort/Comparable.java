package Homework6Collection.Task_6_Sort;


import java.util.Comparator;
import java.util.Map.Entry;

public interface Comparable<Player> {


    static Comparator<? super Entry<Homework6Collection.Player, Integer>> reverseOrder() {
        return null;
    }

    default void compareTo(Player otherPlayer) {}

   // int compare(Homework6Collection.Player firstPlayer, Homework6Collection.Player secondPlayer);
}
