package org.example;

import java.lang.reflect.Array;

public class ArrayFrontBackCappedList<T> implements FrontBackCappedListInterface<T> {

private T[] list;

private int numberOfElements;

private int capacity;

public ArrayFrontBackCappedList(int capacity) {

this.capacity = capacity;

this.list = (T[])new Object[capacity];

}

@Override

public boolean isEmpty() {

return numberOfElements == 0;

}

@Override

public boolean isFull() {

return numberOfElements == list.length;

}

@Override

public int size() {

return numberOfElements;

}

@Override

public T getEntry(int index) {

if(index < 0 || index >= capacity)

return null;

return list[index];

}

@Override

public void clear() {

this.list = (T[]) new Object[capacity];

this.numberOfElements = 0;

}

@Override

public boolean addBack(T t) {

if(numberOfElements >= capacity)

return false;

this.list[numberOfElements] = t;

numberOfElements++;

return true;

}

@Override

public boolean addFront(T t) {

if(numberOfElements >= capacity)

return false;

for(int i=numberOfElements-1; i>=0; i--) {

this.list[i+1] = this.list[i];

}

this.list[0] = t;

numberOfElements++;

return true;

}

@Override

public boolean removeBack() {

if(numberOfElements == 0)

return false;

this.list[numberOfElements-1] = null;

numberOfElements--;

return true;

}

@Override

public boolean removeFront() {

if(numberOfElements == 0)

return false;

for(int i=0; i<numberOfElements-1; i++) {

this.list[i] = this.list[i+1];

}

this.list[numberOfElements-1] = null;

numberOfElements--;

return true;

}

@Override

public boolean contains(T t) {

for(int i=0; i<numberOfElements; i++) {

if(list[i].equals(t)) {

return true;

}

}

return false;

}

@Override

public int indexOf(T t) {

for(int i=0; i<numberOfElements; i++) {

if(list[i].equals(t)) {

return i;

}

}

return -1;

}

@Override

public int lastIndexOf(T t) {

return 0;

}

}
