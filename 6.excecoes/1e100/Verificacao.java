public class Verificacao{

    public void verificarNumero(int numero) throws NumeroInvalidoException{
        if (numero >= 1 && numero <= 100){ // realizar a verificacao
            System.out.println("O numero eh valido! Esta entre 1 e 100."); // mensagem de sucesso
        } else{
            throw new NumeroInvalidoException("O numero eh invalido! Nao esta entre 1 e 100."); // mensagem de excecao
        }
    }
}