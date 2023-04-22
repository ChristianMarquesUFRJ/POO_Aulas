package aula_03;

public class Carro{
    private class Porta{
        private boolean aberta = false;
        private void fechaPorta(){
            if (this.aberta)
                this.aberta = false;
        }
        private void abrePorta(){
            if (!this.aberta)
                this.aberta = true;
        }
        private boolean isAberta(){
            return this.aberta;
        }
    }

    private Porta[] lista_portas;
    private String marca, modelo; 

    Carro(int qtd_portas){
        this.lista_portas = new Porta[qtd_portas];
        for (int id = 0; id < this.lista_portas.length; id++)
            this.lista_portas[id] = new Porta();
    }
    public void abrePorta(int id_porta){
        if ((id_porta >= 0) && (id_porta < this.lista_portas.length))
            this.lista_portas[id_porta].abrePorta();
    }
    public void fechaPorta(int id_porta){
        if ((id_porta >= 0) && (id_porta < this.lista_portas.length))
            this.lista_portas[id_porta].fechaPorta();
    }
    public void abrePortas(){
        for (int id = 0; id < this.lista_portas.length; id++)
            this.abrePorta(id);
    }
    public void fechaPortas(){
        for (int id = 0; id < this.lista_portas.length; id++)
            this.fechaPorta(id);
    }
    public int contaPortasAbertas(){
        int qtd_portas_abertas = 0;
        for (int id = 0; id < this.lista_portas.length; id++)
            if (this.lista_portas[id].isAberta())
                qtd_portas_abertas++;
        return qtd_portas_abertas;
    }
    public int getQtdPortas(){
        return this.lista_portas.length;
    }

}
