package ru.maxol.problems;

/***
 * 705. Design HashSet
 * Design a HashSet without using any built-in hash table libraries.
 * Implement MyHashSet class:
 *     void add(key) Inserts the value key into the HashSet.
 *     bool contains(key) Returns whether the value key exists in the HashSet or not.
 *     void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
 */
public class P705 {

    boolean[] set = new boolean[100_000_1];

    public P705() {
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }
}
