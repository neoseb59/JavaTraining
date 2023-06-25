package perso.dancoisne.sebastien.mooc.java_class_library.Generics;

public class GenericMethodExerciser {
    public static void main(String[] args) {
        Integer[] iArray = {1, 2, 3, 4};
        Character[] charArray = {'a', 'b', 'c', 'd'};
        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0};

        GenericBox.printArray(iArray);
        GenericBox.printArray(charArray);
        GenericBox.printArray(doubleArray);
    }
}
