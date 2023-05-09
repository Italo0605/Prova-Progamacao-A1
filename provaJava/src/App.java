import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Requisitos 1,2, e 3

        //ENTRADA DE DADOS
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome: ");
        String nomeFuncionario = scanner.nextLine();
        System.out.println("Por favor, digite seu Peso em Kg: ");
        double peso = scanner.nextDouble();
        System.out.println("Por favor, digite a quantidade de agua já ingerida no dia(em litros): ");
        double qtnIngerida = scanner.nextDouble();
        //PROCESSAMENTO DE DADOS
        double qtnIdealAgua = Math.round((peso*35) / 1000);
        double qtnParaIngerir = Math.round(qtnIdealAgua - qtnIngerida);
        String message = "";

        if (qtnParaIngerir <= 0){
            message = "Parabéns, você atingiu a meta de hidratação diária";
        }else{
            message = "Continue focado em se hidratar por hoje, ainda faltam "+qtnParaIngerir+" litros! Você consegue!";
        }
        //SAIDA DE DADOS
        System.out.println("Nome do Funcionario: " + nomeFuncionario);
        System.out.println("Peso: " + peso+ "Kg");
        System.out.println("Quantidade de agua ingerida: "+qtnIngerida);
        System.out.println("Quantidade ideal de agua à ingerir: "+qtnIdealAgua);
        System.out.println(message);
        scanner.close();
    }
}
