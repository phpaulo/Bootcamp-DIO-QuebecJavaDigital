package bancodigital;

/**
 * @brief Classe ContaCorrente
 * @author Paulo Henrique
 * @date   criado em: 11/11/2022
 */
public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }



    @Override
    public void imprimirExtrato() {
        System.out.println("*** Início Extrato Conta Corrente ***");
        super.imprimirInfosComuns();
        System.out.println("*** Fim Extrato Conta Corrente ***\n");
    }
}
