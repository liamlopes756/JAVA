
/**
 * Escreva uma descrição da classe App aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class App
{
    public static void main(String[] args){
        
        Ponto ponto_centro = new Ponto(3, 5);
        Circulo circulo = new Circulo(ponto_centro, 10);
        
        Ponto ponto_teste = new Ponto(5, 6);
        
        double area = circulo.calcularArea();
        double comprimento = circulo.calcularPerimetro();
        boolean pertence = circulo.verificarPonto(ponto_teste);
        
        System.out.println(area + " " + comprimento + " " + pertence);
    }
}