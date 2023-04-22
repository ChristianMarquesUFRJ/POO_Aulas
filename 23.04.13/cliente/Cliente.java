class Cliente{
    private static int quantidade_clientes = 0;
    private String nome;
    private String CPF;
    private boolean tem_cartao = false;
    private double credito_disponivel = 0.0;
    private String NUM_CARTAO;

    //////////////////////////////////////////////////////////////////////////////////////////////
    // Construtores
    //////////////////////////////////////////////////////////////////////////////////////////////
    public Cliente(){
        Cliente.quantidade_clientes++;
    }

    public Cliente(String _nome, String _CPF, boolean _tem_cartao, double _credito_disponivel, String _num_cartao){
        Cliente.quantidade_clientes++;
        this.definirNome(_nome);
        this.definirCpf(_CPF);
        this.adicionarCartao(_num_cartao);
        this.atualizarLimiteCredito(_credito_disponivel);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////
    // QTD Clientes
    //////////////////////////////////////////////////////////////////////////////////////////////
    public static int obterQuantidadeClientes(){
        return Cliente.quantidade_clientes;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////
    // Nome
    //////////////////////////////////////////////////////////////////////////////////////////////
    public void definirNome(String _nome){
        this.nome = _nome;
    }

    public String acessarNome(){
        return this.nome;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////
    // CPF
    //////////////////////////////////////////////////////////////////////////////////////////////
    public void definirCpf(String _CPF){
        this.CPF = _CPF;
    }

    public String acessarCpf(){
        return this.CPF;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////
    // Credito
    //////////////////////////////////////////////////////////////////////////////////////////////
    public double obterCredito(){
        return this.credito_disponivel;
    }

    public void atualizarLimiteCredito(double novo_limite){
        if (novo_limite > this.credito_disponivel)
            this.credito_disponivel = novo_limite; 
    }

    //////////////////////////////////////////////////////////////////////////////////////////////
    // Cartao
    //////////////////////////////////////////////////////////////////////////////////////////////
    public void adicionarCartao(String _num_cartao){
        this.NUM_CARTAO = _num_cartao;
        this.tem_cartao = true;
    }

    public String acessarNumCartao(){
        return this.NUM_CARTAO;
    }

    public boolean temCartao(){
        return this.tem_cartao;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////
    // Mostrador
    //////////////////////////////////////////////////////////////////////////////////////////////
    public String obterInfo(){
        if (this.tem_cartao)
            return "Nome: " + this.nome + " | CPF: " + this.CPF + " | Numero Cartao: " + this.NUM_CARTAO + " | Credito disponivel: R$ " + this.credito_disponivel;
        return "Nome: " + this.nome + " | CPF: " + this.CPF + " | Nao tem cartao | Credito disponivel: R$ " + this.credito_disponivel;
    }
}