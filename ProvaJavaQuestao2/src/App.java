import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com a placa do veículo:");
        String placaVeiculo = scanner.nextLine();
        System.out.println("Entre com o valor do litro combustível: ");
        double valor = scanner.nextDouble();

        System.out.println("Entre com a quantidade de quilômetros rodados a 60 km/h: ");
        double km60 = scanner.nextDouble();
        double consumo60 = km60 / 30.7;

        System.out.println("Entre com a quantidade de quilômetros rodados a 80 km/h: ");
        double km80 = scanner.nextDouble();
        double consumo80 = km80 / 26.8;

        System.out.println("Entre com a quantidade de quilômetros rodados a 100 km/h: ");
        double km100 = scanner.nextDouble();
        double consumo100 = km100 / 22.4;

        System.out.println("Entre com a quantidade de quilômetros rodados a 120 km/h: ");
        double km120 = scanner.nextDouble();
        double consumo120 = km120 / 18.1;

        System.out.println("Entre com a quantidade de quilômetros rodados a 140 km/h: ");
        double km140 = scanner.nextDouble();
        double consumo140 = km140 / 14.5;

        //CALCULOS PARA A VELOCIDADE MEDIA PONDERADA
        double tempoTotal = (km60/60) + (km80/80) + (km100/100) + (km120/120) + (km140/140);
        double distanciaTotal = km60 + km80 + km100 + km120 + km140;
        double veloMediaPonderada = (distanciaTotal/ tempoTotal);


        double qtnConsumoTotal = consumo60 + consumo80 + consumo100 + consumo120 + consumo140;
        double custoTotal = valor * qtnConsumoTotal;
        System.out.println("Placa do veículo: "+ placaVeiculo);
        System.out.println("Consumo total: "+ String.format("%.4f",qtnConsumoTotal)+" litros"); //
        System.out.println("Valor total: R$ "+ String.format("%.2f", custoTotal)); //
        System.out.println("Velocidade média ponderada: "+ String.format("%.4f",veloMediaPonderada)+" km/h");
        scanner.close();
    }
}
