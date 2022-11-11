package bancodigital;

/**
 * @brief Classe Teste
 * @author Paulo Henrique
 * @date   criado em: 11/11/2022
 */
public class Teste {
    public static void main(String[] args) {
        Cliente fulano = new Cliente();
        fulano.setNome("Paulo");

        Conta cc = new ContaCorrente(fulano);
        Conta poupanca = new ContaPoupanca(fulano);

        cc.depositar(3500);
        cc.transferir(250, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
