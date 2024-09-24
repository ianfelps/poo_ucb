import java.util.ArrayList;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) {
        // quantidade de elementos
        final int TOTAL_ELEMENTOS = 30000;

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        long inicioArrayListInsercao = System.currentTimeMillis();

        System.out.println("--- ArrayList x HashSet ---");

        // inserir na ArrayList
        Operacoes.inserirArrayList(arrayList, TOTAL_ELEMENTOS);
        long fimArrayListInsercao = System.currentTimeMillis();
        System.out.println("Tempo para inserir na ArrayList: " + (fimArrayListInsercao - inicioArrayListInsercao) + " ms");

        // pesquisar na ArrayList
        long inicioArrayListBusca = System.currentTimeMillis();
        Operacoes.buscarArrayList(arrayList, TOTAL_ELEMENTOS);
        long fimArrayListBusca = System.currentTimeMillis();
        System.out.println("Tempo para buscar na ArrayList: " + (fimArrayListBusca - inicioArrayListBusca) + " ms");

        // HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        long inicioHashSetInsercao = System.currentTimeMillis();

        // inserir no HashSet
        Operacoes.inserirHashSet(hashSet, TOTAL_ELEMENTOS);
        long fimHashSetInsercao = System.currentTimeMillis();
        System.out.println("Tempo para inserir no HashSet: " + (fimHashSetInsercao - inicioHashSetInsercao) + " ms");

        // pesquisar no HashSet
        long inicioHashSetBusca = System.currentTimeMillis();
        Operacoes.buscarHashSet(hashSet, TOTAL_ELEMENTOS);
        long fimHashSetBusca = System.currentTimeMillis();
        System.out.println("Tempo para buscar no HashSet: " + (fimHashSetBusca - inicioHashSetBusca) + " ms");
    }
}
