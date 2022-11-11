package bancodigital;

/**
 * @brief Classe ContaDigital
 * @author Paulo Henrique
 * @date   criado em: 11/11/2022
 */
public interface ContaDigital {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, ContaDigital contaDestino);

    void imprimirExtrato();
}
