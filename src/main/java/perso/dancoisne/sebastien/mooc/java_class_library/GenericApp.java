package perso.dancoisne.sebastien.mooc.java_class_library;

import java.util.ArrayDeque;
import java.util.Deque;

public class GenericApp {

    private interface Stack<E> {
        void push(E element);
        E pop();
    }

    private static class DequeStack<E> implements Stack<E> {

        private final Deque<E> deque;

        public DequeStack() {
            deque = new ArrayDeque<>();
        }

        @Override
        public void push(E element) {
            deque.push(element);
        }

        @Override
        public E pop() {
            return deque.pop();
        }
    }

    public static void main(String... args) {
        DequeStack<Integer> ints = new DequeStack<>();

        ints.push(5);
        ints.push(3);
        ints.push(2);
        ints.push(1);
        ints.push(1);
        System.out.println(ints.pop());
        System.out.println(ints.pop());
        System.out.println(ints.pop());
    }
}
