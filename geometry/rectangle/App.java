
/**
 * Escreva uma descrição da classe App aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;

public class App
{
    public static void main(String[] args){
        double xret;
        double yret;
        double base;
        double altura;
        
        double xteste;
        double yteste;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Coordenadas do ponto inferior esquerdo(inicio do retangulo):");
        System.out.println("Insira o x:");
        xret = sc.nextDouble();
        System.out.println("Insira o y:");
        yret = sc.nextDouble();
        
        Ponto ponto_inicial_ret = new Ponto(xret, yret);
        
        System.out.println("Base e altura do Retangulo:");
        System.out.println("Insira a base:");
        base = sc.nextDouble();
        System.out.println("Insira a altura:");
        altura = sc.nextDouble();
        
        Retangulo retangulo = new Retangulo(base, altura, ponto_inicial_ret);
        
        System.out.println("Ponto teste:");
        System.out.println("insira o x:");
        xteste = sc.nextDouble();
        System.out.println("Insira o y:");
        yteste = sc.nextDouble();
        
        Ponto ponto_teste = new Ponto(xteste, yteste);
    }
}





