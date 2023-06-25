package perso.dancoisne.sebastien.mooc.java_class_library.Generics;

public class GenericBoxExerciser {
    public static void main(String[] args) {
        GenericBox<Integer> gInt = new GenericBox<>();
        GenericBox<String> gString = new GenericBox<>();

        gString.setT("Hello World");
        gInt.setT(10);

        System.out.println("Generic String box: " + gString.getT());
        System.out.println("Generic Integer box: " + gInt.getT());


    }
}
