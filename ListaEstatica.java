public class ListaEstatica {
    private int[] vetor_elementos;
    private int numero_elementos;

    public ListaEstatica(int t) {
        vetor_elementos = new int[t];
        numero_elementos = 0;
    }

    public void adicionarFinal(int valor) {
        if (lista_Cheia()) {
            System.out.println("Lista cheia!");
        }else{
            vetor_elementos[numero_elementos] = valor;
            numero_elementos++;
        }

    }

    public void adicionarPosicao(int valor, int pos) {
        if (pos < 0 || pos > numero_elementos) {
            System.out.println("Posição inválida!");
        }
        else if (lista_Cheia()) {
            System.out.println("Lista cheia");
        }
        else{
            for(int i = numero_elementos; i >= pos; i--){
                vetor_elementos[i] = vetor_elementos[i-1];
            }
            vetor_elementos[pos] = valor;
            numero_elementos++;
        }
    }

    public void adicionarInicio(int valor) {
        if(lista_Cheia()) {
            System.out.println("Lista cheia!");
        }
        else{
            for(int i = numero_elementos; i > 0; i--) {
                vetor_elementos[i] = vetor_elementos[i-1];
            }
            vetor_elementos[0] = valor;
            numero_elementos++;
        }
    }

    public int removerFinal() {
        int elementoRemovido = -1;
        if(lista_Vazia()){
            System.out.println("Lista vazia");
        }else{
            elementoRemovido = vetor_elementos[numero_elementos - 1];
            numero_elementos--;
        }
        return elementoRemovido;
    }

    public int removerPosicao(int pos) {
        int elementoRemovido = -1;
        if(lista_Vazia()) {
            System.out.println("Lista vazia!");
        }
        else {
            elementoRemovido = vetor_elementos[pos];
            for(int i = pos; i > numero_elementos-1; i++) {
                vetor_elementos[i] = vetor_elementos[i+1];
            }
            numero_elementos--;
        }
    }


    public int removerInicio() {
        int elementoRemovido = -1;
        if (lista_Vazia()) {
            System.out.printf("Lista vazia!");
        } else {
            elementoRemovido = vetor_elementos[0];
            for (int i = 1; i < numero_elementos; i++) {
                vetor_elementos[i - 1] = vetor_elementos[i];
            }
            numero_elementos--;
        }
        return elementoRemovido;
    }

    public int buscarPorValor(int valor) {
        for(int i = 0; i < numero_elementos; i++) {
            if(vetor_elementos[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public boolean lista_Vazia() {
        if (numero_elementos == 0) {
            return true;
        }else{
            return false;
        }
    }

    public boolean lista_Cheia(){
        if (numero_elementos == vetor_elementos.length) {
            return true;
        }else{
            return false;
        }
    }

    public int getNumero_elementos() {
        return numero_elementos;
    }

    public void exibir() {
        for (int i = 0; i < numero_elementos; i++) {
            System.out.print(vetor_elementos[i] + " ");
        }

        System.out.println("");
    }

    /// Questao 1.
    //1) Fazer um metodo detro da classe ListaEstatica para retornar o elemento do meio da lista (suponha que existe meio - tamanho impar);

    public int retornarElementoMeio() {
        for(int i = 0; i < numero_elementos; i++) {
            if(i == (numero_elementos-1)/2) {
                return vetor_elementos[i];
            }
        }
        return -1;
    }


    //Questao 2
    //2) Fazer um metodo para trocar o primeiro com iltimo elemento da lista (ultimos serao os primeiros);
    public void trocarPrimeiroUltimo() {
        if(lista_Vazia()){
            System.out.printf("Lista Vazia!");
        }
        else {
            int primeiroElemento = vetor_elementos[0];
            vetor_elementos[0] = vetor_elementos[numero_elementos-1];
            vetor_elementos[numero_elementos-1] = primeiroElemento;
        }
    }

    //Questao 3
    // 3) Implementar o metodo get(int pos) -> retorna o elemento da lista da posicao pos;
    public int retornarElemento(int pos) {
        if(pos < 0 || pos >= numero_elementos) {
            System.out.println("Posição Inválida");
        }
        else {
            return vertor_elementos[pos];
        }
    }

    //Questao 4
    //4) Implementar um metodo na classe ListaEstatica para invertar a lista. Exemplo {13, 17, 45, 50, 25} ===> {25,50,45,17,13};

    public void inverterLista() {
        for(int i = 0; i < numero_elementos / 2; i++) {
            int auxiliar = vetor_elementos[i];
            vetor_elementos[i] = vetor_elementos[(numero_elementos -1) - i];
            vetor_elementos[numero_elementos -1 - i] = auxiliar;
        }
    }

    //TODO: Verificar se tem elementos repetidos na lista
    public boolean temRepetidos() {
        for (int i = 0; i < numero_elementos - 1; i++) {
            for (int j = i + 1; j < numero_elementos; j++) {
                    if(vetor_elementos[i] == vetor_elementos[j]) {
                        return true;
                    }
            }
        }
        return false;
    }

    //TODO: Verificar se a lista esta ordenada
    public boolean estaOrdenada() {
        for(int i = 0; i < numero_elementos - 1; i++) {
            if(vetor_elementos[i] > vetor_elementos[i+1]) {
                return false;
            }
        }
        return true;
    }

    public void eliminarRepetidos() {
        if(!temRepetidos()) {
            System.out.println("Não há elementos repetidos, portanto não há como eliminá-los");
        }
        else {
            for (int i = 0; i < numero_elementos - 1; i++) {
                for (int j = i + 1; j < numero_elementos; j++) {
                    if(vetor_elementos[i] == vetor_elementos[j]) {
                        removerPosicao(j);
                        j--;
                    }
                }
            }
        }
    }

}
