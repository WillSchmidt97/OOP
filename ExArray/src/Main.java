import java.security.SecureRandom;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] vendas = new int[50];
        int[] countVendas = new int[6];

        for (int i = 0; i < vendas.length; i++) {
            int valorVenda = random.nextInt(700) + 1;
            vendas[i] = valorVenda;

            if (valorVenda >= 0 && valorVenda <= 99) {
                countVendas[0]++;
            } else if (valorVenda >= 100 && valorVenda <= 199) {
                countVendas[1]++;
            }
            else if (valorVenda >= 200 && valorVenda <= 299) {
                countVendas[2]++;
            }
            else if (valorVenda >= 300 && valorVenda <= 399) {
                countVendas[3]++;
            }
            else if (valorVenda >= 400 && valorVenda <= 499) {
                countVendas[4]++;
            }
            else {
                countVendas[5]++;
            }
        }

        System.out.println("Valores de venda: " + Arrays.toString(vendas));

        System.out.println("Contagem de Vendas por Faixa:");
        System.out.println("R$0 - R$99: " + countVendas[0]);
        System.out.println("R$100 - R$199: " + countVendas[1]);
        System.out.println("R$200 - R$299: " + countVendas[2]);
        System.out.println("R$300 - R$399: " + countVendas[3]);
        System.out.println("R$400 - R$499: " + countVendas[4]);
        System.out.println("R$500 e acima: " + countVendas[5]);
    }
}