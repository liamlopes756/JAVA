
/**
 * Escreva uma descrição da classe Retangulo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Retangulo
{
    // atributos
    double xmin;
    double xmax;
    double ymin;
    double ymax;
    
    public Retangulo(double base, double altura, Ponto ponto_inicial){
        this.xmin = ponto_inicial.x;
        this.ymin = ponto_inicial.y;
        this.xmax = base + ponto_inicial.x;
        this.ymax = altura + ponto_inicial.y;
    }
    
    public boolean verificarPonto(Ponto ponto){
        boolean pertence = false;
        
        if((ponto.x >= xmin && ponto.x <= xmax) && (ponto.y >= ymin && ponto.y <= ymax)){
            pertence = true;
        }
        
        return pertence;
    }
}








