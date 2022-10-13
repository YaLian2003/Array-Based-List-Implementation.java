package org.example;

public interface FrontBackCappedListInterface<T> {

boolean isEmpty();

String toString();

boolean isFull();

int size();

T getEntry(int index);

void clear();

boolean addBack(T t);

boolean addFront(T t);

boolean removeBack();

boolean removeFront();

boolean contains(T t);

int indexOf(T t);

int lastIndexOf(T t);

}
