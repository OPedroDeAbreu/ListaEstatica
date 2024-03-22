public class Pilha {
    private int[] vetor_elementos;
    private int tamanho;

    public Pilha(int t) {
        vetor_elementos = new int[t];
        tamanho = 0;
    }

    public boolean pilhaCheia() {
        return (tamanho == vetor_elementos.length);
    }

    public boolean pilhaVazia() {
        return (tamanho == 0);
    }
    public void empilhar(int valor) {
        if(pilhaCheia()) {
            System.out.println("Pilha cheia!");
        }
        else {
        vetor_elementos[tamanho] = valor;
        tamanho++;
        }
    }

    public int desempilhar() {
        int elementoRemovido = -1;
        if(pilhaVazia()) {
            System.out.println("Pilha vazia!");
        }
        else {
            tamanho--;
            elementoRemovido = vetor_elementos[tamanho];
        }
        return elementoRemovido;
    }
    public void inverter() {
    }

    public void ordenar() {
    }

    public void palindrome() {
    }

    public void expressao() {
    }

    public void eliminarMaior() {
    }

    public void eliminarMenor() {
    }
}