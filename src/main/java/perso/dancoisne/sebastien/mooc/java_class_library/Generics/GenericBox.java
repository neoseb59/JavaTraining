package perso.dancoisne.sebastien.mooc.java_class_library.Generics;

public class GenericBox<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static <E> void printArray(E[] inputArray) {
        for (E element :
                inputArray) {
            System.out.println(element);
        }
        System.out.println();
    }
}
