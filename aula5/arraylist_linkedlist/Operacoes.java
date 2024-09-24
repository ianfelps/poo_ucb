import java.util.ArrayList;
import java.util.LinkedList;

public class Operacoes{

    // inserir elementos na primeira posicao de uma ArrayList
    public static void inserirArrayList(ArrayList<Integer> arrayList, int totalElementos) {
        for (int i = 0; i < totalElementos; i++) {
            arrayList.add(0, i); // insere na primeira posicao
        }
    }

    // percorrer a ArrayList usando o get()
    public static void percorrerArrayList(ArrayList<Integer> arrayList, int totalElementos) {
        for (int i = 0; i < totalElementos; i++) {
            arrayList.get(i); // acessa o elemento pelo indice
        }
    }

    // inserir elementos na primeira posicao de uma LinkedList
    public static void inserirLinkedList(LinkedList<Integer> linkedList, int totalElementos) {
        for (int i = 0; i < totalElementos; i++) {
            linkedList.add(0, i); // insere na primeira posicao
        }
    }

    // percorrer a LinkedList usando o get()
    public static void percorrerLinkedList(LinkedList<Integer> linkedList, int totalElementos) {
        for (int i = 0; i < totalElementos; i++) {
            linkedList.get(i); // acessa o elemento pelo indice
        }
    }
}
