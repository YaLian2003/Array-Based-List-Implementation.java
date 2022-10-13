package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFrontBackCappedListTest {

@Test

void isEmpty() {

FrontBackCappedListInterface<Integer> list = new ArrayFrontBackCappedList<>(5);

assertTrue(list.isEmpty());

}

@Test

void isFull() {

FrontBackCappedListInterface<Integer> list = new ArrayFrontBackCappedList<>(2);

list.addBack(5);

list.addBack(4);

assertTrue(list.isFull());

}

@Test

void size() {

FrontBackCappedListInterface<Integer> list = new ArrayFrontBackCappedList<>(5);

list.addBack(5);

list.addBack(4);

assertEquals(2,list.size());

}

@Test

void getEntry() {

FrontBackCappedListInterface<Integer> list = new ArrayFrontBackCappedList<>(5);

list.addBack(5);

list.addBack(4);

assertEquals(4,list.getEntry(1));

}

@Test

void clear() {

FrontBackCappedListInterface<Integer> list = new ArrayFrontBackCappedList<>(5);

list.addBack(5);

list.addBack(4);

list.clear();

assertTrue(list.isEmpty());

}

@Test

void addBack() {

FrontBackCappedListInterface<Integer> list = new ArrayFrontBackCappedList<>(2);

list.addBack(5);

list.addFront(4);

assertEquals(5,list.getEntry(1));

}

@Test

void addFront() {

FrontBackCappedListInterface<Integer> list = new ArrayFrontBackCappedList<>(4);

list.addBack(5);

list.addFront(4);

list.addBack(6);

list.addFront(7);

assertEquals(7,list.getEntry(0));

}

@Test

void removeBack() {

FrontBackCappedListInterface<Integer> list = new ArrayFrontBackCappedList<>(4);

list.addBack(5);

list.addFront(4);

list.addBack(6);

list.addFront(7);

list.removeBack();

assertEquals(3,list.size());

assertEquals(5,list.getEntry(2));

}

@Test

void removeFront() {

FrontBackCappedListInterface<Integer> list = new ArrayFrontBackCappedList<>(4);

list.addBack(5);

list.addFront(4);

list.addBack(6);

list.addFront(7);

list.removeFront();

assertEquals(3,list.size());

assertEquals(4,list.getEntry(0));

}

@Test

void contains() {

FrontBackCappedListInterface<Integer> list = new ArrayFrontBackCappedList<>(4);

list.addBack(5);

list.addFront(4);

list.addBack(6);

list.addFront(7);

list.removeFront();

assertTrue(list.contains(6));

assertFalse(list.contains(7));

}

@Test

void indexOf() {

FrontBackCappedListInterface<Integer> list = new ArrayFrontBackCappedList<>(4);

list.addBack(5);

list.addFront(4);

list.addBack(6);

list.addFront(7);

assertEquals(0,list.indexOf(7));

}

}
