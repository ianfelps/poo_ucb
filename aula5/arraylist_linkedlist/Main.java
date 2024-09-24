import java.util.ArrayList;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args) {
        // define a quantidade de elementos
        final int TOTAL_ELEMENTOS = 30000;

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        long inicioArrayListInsercao = System.currentTimeMillis();

        System.out.println("--- ArrayList x LinkedList ---");

        // inserir na primeira posicao da ArrayList
        Operacoes.inserirArrayList(arrayList, TOTAL_ELEMENTOS);
        long fimArrayListInsercao = System.currentTimeMillis();
        System.out.println("Tempo para inserir na primeira posicao da ArrayList: " + (fimArrayListInsercao - inicioArrayListInsercao) + " ms");

        // percorrer a ArrayList usando o get()
        long inicioArrayListPercorrer = System.currentTimeMillis();
        Operacoes.percorrerArrayList(arrayList, TOTAL_ELEMENTOS);
        long fimArrayListPercorrer = System.currentTimeMillis();
        System.out.println("Tempo para percorrer a ArrayList usando get(): " + (fimArrayListPercorrer - inicioArrayListPercorrer) + " ms");

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        long inicioLinkedListInsercao = System.currentTimeMillis();

        // inserir na primeira posicao da LinkedList
        Operacoes.inserirLinkedList(linkedList, TOTAL_ELEMENTOS);
        long fimLinkedListInsercao = System.currentTimeMillis();
        System.out.println("Tempo para inserir na primeira posicao da LinkedList: " + (fimLinkedListInsercao - inicioLinkedListInsercao) + " ms");

        // percorrer a LinkedList usando o get()
        long inicioLinkedListPercorrer = System.currentTimeMillis();
        Operacoes.percorrerLinkedList(linkedList, TOTAL_ELEMENTOS);
        long fimLinkedListPercorrer = System.currentTimeMillis();
        System.out.println("Tempo para percorrer a LinkedList usando get(): " + (fimLinkedListPercorrer - inicioLinkedListPercorrer) + " ms");
    }
}
