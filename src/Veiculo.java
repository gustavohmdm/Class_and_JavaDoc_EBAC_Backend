/**
 * @author GustavoHMDM
 */

public class Veiculo {

    private String ligado;

    public String getLigado() {
        return ligado;
    }

    /**
     * Atribuindo valor para a String ligado
     *
     * @param ligado aqui colocaremos o valor para a String ligado
     *
     * @since ver.2.0
     */

    public void setLigado(String ligado) {
        this.ligado = ligado;
    }

    /**
     * @deprecated
     *
     * O veículo não está mais quebrado
     *
     * @see public void getLigado()
     */
    public void veiculoQuebrado() {
        System.out.println("O veículo está quebrado");
    }
}
