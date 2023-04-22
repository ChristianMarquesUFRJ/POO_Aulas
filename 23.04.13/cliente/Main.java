class Main{
    public static void main(String[] args){
        Cliente pessoa_1 = new Cliente("Christian", "123", false, 100.0, "0123456");
        Cliente pessoa_2 = new Cliente();
        pessoa_2.definirNome("Oziara");

        System.out.println(pessoa_1.obterInfo());
        System.out.println(pessoa_2.obterInfo());
        System.out.println("Total de pessoas: " + Cliente.obterQuantidadeClientes());
    }
}