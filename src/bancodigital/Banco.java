package bancodigital;

import java.util.List;

/**
 * @brief Classe Banco
 * @author Paulo Henrique
 * @date   criado em: 11/11/2022
 */
public class Banco {
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
