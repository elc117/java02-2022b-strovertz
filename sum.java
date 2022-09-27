import java.util.Random;
import java.util.Collections;
import java.util.Arrays;

class roupas {
    public static void main(String[] args) {
        String[] top = {"vermelho", "azul", "verde", "rosa"};

        String[] down = {"vermelho", "azul", "verde", "rosa"};

        String[] socks = {"vermelho", "azul", "verde", "rosa"};

        Random generator = new Random();

        int randomindex = generator.nextInt(top.length);
        int randomindex2 = generator.nextInt(down.length);
        int randomindex3 = generator.nextInt(socks.length);

        System.out.println("Segue lista de roupas que você deve sair hoje");
        System.out.println("Camiseta: " + top[randomindex] + "Calça: " + down[randomindex2] + "Meias: " + socks[randomindex3] + "!");

    }
}
