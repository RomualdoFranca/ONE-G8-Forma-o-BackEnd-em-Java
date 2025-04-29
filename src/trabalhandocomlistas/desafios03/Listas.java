package trabalhandocomlistas.desafios03;

import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");

        //percorre elementos com forEach
        strings.forEach(item->System.out::println);
    }
}
