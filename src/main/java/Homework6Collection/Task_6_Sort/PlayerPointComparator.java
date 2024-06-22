package Homework6Collection.Task_6_Sort;

import Homework6Collection.Player;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

    public class PlayerPointComparator implements Comparable<Player>, Comparator<Player> {

        @Override
        public void compareTo(Player otherPlayer) {
            Comparable.super.compareTo(otherPlayer);
        }

        @Override
        public int compare(Player firstPlayer, Player secondPlayer) {
            return 0;
        }

        @Override
        public Comparator<Player> reversed() {
            return Comparator.super.reversed();
        }

        @Override
        public Comparator<Player> thenComparing(Comparator<? super Player> other) {
            return Comparator.super.thenComparing(other);
        }

        @Override
        public <U> Comparator<Player> thenComparing(Function<? super Player, ? extends U> keyExtractor,
            Comparator<? super U> keyComparator) {
            return Comparator.super.thenComparing(keyExtractor, keyComparator);
        }

        @Override
        public <U extends java.lang.Comparable<? super U>> Comparator<Player> thenComparing(
            Function<? super Player, ? extends U> keyExtractor) {
            return Comparator.super.thenComparing(keyExtractor);
        }

        @Override
        public Comparator<Player> thenComparingInt(ToIntFunction<? super Player> keyExtractor) {
            return Comparator.super.thenComparingInt(keyExtractor);
        }

        @Override
        public Comparator<Player> thenComparingLong(ToLongFunction<? super Player> keyExtractor) {
            return Comparator.super.thenComparingLong(keyExtractor);
        }

        @Override
        public Comparator<Player> thenComparingDouble(
            ToDoubleFunction<? super Player> keyExtractor) {
            return Comparator.super.thenComparingDouble(keyExtractor);
        }
    }


