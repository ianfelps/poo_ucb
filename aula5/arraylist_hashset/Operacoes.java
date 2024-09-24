import java.util.ArrayList;
import java.util.HashSet;

public class Operacoes{

    // inserir elementos em uma ArrayList
    public static void inserirArrayList(ArrayList<Integer> arrayList, int totalElementos) {
        for (int i = 0; i < totalElementos; i++) {
            arrayList.add(i);
        }
    }

    // pesquisar elementos em uma ArrayList
    public static void buscarArrayList(ArrayList<Integer> arrayList, int totalElementos) {
        for (int i = 0; i < totalElementos; i++) {
            arrayList.contains(i);
        }
    }

    // inserir elementos em um HashSet
    public static void inserirHashSet(HashSet<Integer> hashSet, int totalElementos) {
        for (int i = 0; i < totalElementos; i++) {
            hashSet.add(i);
        }
    }

    // pesquisar elementos em um HashSet
    public static void buscarHashSet(HashSet<Integer> hashSet, int totalElementos) {
        for (int i = 0; i < totalElementos; i++) {
            hashSet.contains(i);
        }
    }
}
