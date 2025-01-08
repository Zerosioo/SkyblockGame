package me.zero.skyblock.util;

import java.util.Collection;
import java.util.List;

public class RandomObject {
    public static <E> E getRandom(E... e) {
        return e[(int) (Math.random() * e.length)];

    }

    public static <E> E getRandomFromList(List<E> e) {
        if (e.isEmpty()) {
            return null;
        }
        return e.get((int) (Math.random() * e.size()));
    }

    public static <E> E removeRandomFromList(List<E> e) {
        if (e.isEmpty()) {
            return null;
        }
        return e.remove((int) (Math.random() * e.size()));
    }

    public static <E> E getRandomFromList(Collection<E> e) {
        if (e.isEmpty()) {
            return null;
        }
        return (E) e.toArray()[(int) (Math.random() * e.size())];
    }
}