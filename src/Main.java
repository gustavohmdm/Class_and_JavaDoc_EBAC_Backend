/**
 * @author GustavoHMDM
 */

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.setLigado("sim");
        if(veiculo.getLigado().equalsIgnoreCase("Sim")) {
            System.out.println("O veículo está ligado");
        };
        veiculo.veiculoQuebrado();
    }
}