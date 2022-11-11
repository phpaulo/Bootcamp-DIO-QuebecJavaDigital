package bancodigital;

/**
 * @brief Classe ContaPoupanca
 * @author Paulo Henrique
 * @date   criado em: 11/11/2022
 */
public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Início Extrato Conta Poupança ***");
        super.imprimirInfosComuns();
        System.out.println("*** Fim Extrato Conta Poupança ***");
    }
}
