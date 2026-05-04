
/**
 * Construtor e metodos de Circulo
 */
public class Circulo
{
    // estrutura padrão
    // atributos
    // construtor
    // getters and setters
    // outros metodos
    
    // atributos
    private Ponto ponto;
    private double raio;
    
    // construtor
    /*
     * construtor do circulo
     * @return Circulo
     */
    public Circulo(Ponto ponto, double raio){
        this.ponto = ponto;
        this.raio = raio;
    }
    
    // setters and getters
    public Ponto getPonto(){
        return ponto;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public void setPonto(Ponto ponto){
        this.ponto = ponto;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    /**
     * calcula a area do circulo
     * @return double area
     */
    public double calcularArea(){
        double area = raio * raio * 3.14;
        return area;
    }
    
    /**
     * calcula o perimetro do circulo
     * @return double perimetro 
     */
    public double calcularPerimetro(){
        double perimetro = 2 * 3.14 * raio;
        return perimetro;
    }
    
    public boolean verificarPonto(Ponto p){
        boolean pertence = true;
        double distancia;
        double cx = this.ponto.x;
        double cy = this.ponto.y;
        double px = p.x;
        double py = p.y;
        
        distancia = Math.sqrt((Math.pow((px-cx), 2)+Math.pow((py-cy), 2)));
        
        if(distancia > raio){
            pertence = false;
        }
        return pertence;
    }
}








