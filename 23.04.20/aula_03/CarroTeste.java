///////////////////////////////
// rm aula_03/*.class        -> Remove todos os .class
// javac ./aula_03/*.java    -> Gerar .class
// java aula_03.CarroTeste   -> Rodar
//
// javac ./aula_03/*.java && java aula_03.CarroTeste
// rm aula_03/*.class && javac ./aula_03/*.java && java aula_03.CarroTeste
///////////////////////////////

package aula_03;

public class CarroTeste{
    public static boolean testeConstrutor(){
        int qtd_portas = 4;
        Carro carro = new Carro(qtd_portas);
        return carro.getQtdPortas() == qtd_portas;
    }
    public static boolean testeContaPortasAbertas(){
        int qtd_portas = 4;
        Carro carro = new Carro(qtd_portas);
        return (carro.contaPortasAbertas() == 0);
    }
    public static boolean testeAbrePorta(){
        int qtd_portas = 4;
        Carro carro = new Carro(qtd_portas);
        for (int id_porta = 0; id_porta < qtd_portas; id_porta++){
            carro.abrePorta(id_porta);
            if (carro.contaPortasAbertas() != id_porta+1)
                return false;
        }
        return true;
    }
    public static boolean testeAbrePortas(){
        int qtd_portas = 4;
        Carro carro = new Carro(qtd_portas);
        carro.abrePortas();
        return (carro.contaPortasAbertas() == qtd_portas);
    }
    public static boolean testeFechaPorta(){
        int qtd_portas = 4;
        Carro carro = new Carro(qtd_portas);
        carro.abrePortas();
        for (int id_porta = qtd_portas-1; id_porta >= 0; id_porta--){
            carro.fechaPorta(id_porta);
            if (carro.contaPortasAbertas() != id_porta)
                return false;
        }
        return true;
    }
    public static boolean testeFechaPortas(){
        int qtd_portas = 4;
        Carro carro = new Carro(qtd_portas);
        carro.fechaPortas();
        return (carro.contaPortasAbertas() == 0);
    }
    public static void main(String[] args){
        System.out.println("\n[TESTES UNITARIOS]");

        System.out.println(">> Teste de Construtor: " + (CarroTeste.testeConstrutor()?"Passou":"Não Passou"));
        System.out.println(">> Teste de QTD Portas: " + (CarroTeste.testeContaPortasAbertas()?"Passou":"Não Passou"));
        System.out.println(">> Teste de Abrir Porta: " + (CarroTeste.testeAbrePorta()?"Passou":"Não Passou"));
        System.out.println(">> Teste de Abrir Portas: " + (CarroTeste.testeAbrePortas()?"Passou":"Não Passou"));
        System.out.println(">> Teste de Fecha Porta: " + (CarroTeste.testeFechaPorta()?"Passou":"Não Passou"));
        System.out.println(">> Teste de Fecha Portas: " + (CarroTeste.testeFechaPortas()?"Passou":"Não Passou"));

        System.out.println("\n");
    }
}