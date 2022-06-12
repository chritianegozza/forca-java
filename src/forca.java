import java.io.IOException;
import java.util.Scanner;

public class forca {
    public static void main(String[] args) throws
            IOException{
        Scanner scan = new Scanner(System.in);
        System.out.print("\nInforme seu nome: \t");
        String nome = scan.nextLine();
        System.out.print("\n Digite uma palavra: \t");
        byte[] bt = new  byte[11];
        System.in.read(bt);
        String palavra = new String(bt).trim();
        System.out.println("Tamanho da palavra: " +
                palavra.length());
    }
}
