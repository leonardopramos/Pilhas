public class PilhaArray implements PilhaTAD{

    private Integer[] dados;
    private int topo;
    private int tamanho;
    private int capacidade;

    public PilhaArray(int capacidade){
        this.dados = new Integer[capacidade];
        int tamanho = 0;
    }

    @Override
    public void push(int e) {
        this.dados[tamanho] = e;
        this.tamanho++;
        this.topo = e;
    }

    @Override
    public int pop() {
        int aux = this.topo;
        this.tamanho = this.tamanho -1;
        this.topo = dados[tamanho - 1];
        return aux;
    }

    @Override
    public int top() {
        return this.topo;
    }

    @Override
    public int size() {
        return this.tamanho;
    }

    @Override
    public boolean isEmpty() {
        for(int i = 0; i < dados.length; i++){
            if(dados[i] != null){
                return false;
            }
        }
        return true;
    }

    @Override
    public void clear() {
        for(int i = 0; i < dados.length; i++){
            dados[i] = null;
        }        
    }

    public int getTamanho() {
        return tamanho;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
