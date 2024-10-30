import java.util.Stack;

public class Parenteses{

    // verificar se a expressão tem parenteses balanceados
    public boolean verificaExpressao(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(') {
                pilha.push(caractere);  // adiciona a pilha quando encontra um abre parenteses
            } else if (caractere == ')') {
                if (pilha.isEmpty()) {
                    return false;  // fecha parenteses sem um correspondente aberto
                }
                pilha.pop();  // remove da pilha quando encontra um fecha parenteses
            }
        }
        return pilha.isEmpty();  // verifica se a pilha esta vazia no final
    }
}
