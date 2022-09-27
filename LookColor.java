import java.util.Random;

/*
 * O Programa vai gerar cores aleatorias para combinar 
 * as roupas que o usuário ira vestir no dia
 * 
 */
class LookColor {
    public static void main(String[] args) {
        String[] top = {"vermelho", "azul", "verde", "rosa"};

        String[] down = {"vermelho", "azul", "verde", "rosa"};

        String[] socks = {"vermelho", "azul", "verde", "rosa"};

        Random generator = new Random();

        int randomindex = generator.nextInt(top.length);
        int randomindex2 = generator.nextInt(down.length);
        int randomindex3 = generator.nextInt(socks.length);

        System.out.println("Segue lista de roupas que você deve sair hoje");
        System.out.println("Camiseta: " + top[randomindex] + " Calça: " + down[randomindex2] + " Meias: " + socks[randomindex3] + "!");

    }
}
