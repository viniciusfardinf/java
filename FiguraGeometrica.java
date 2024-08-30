abstract class FiguraGeometrica {    
    abstract double calcularArea();
}
class Retangulo extends FiguraGeometrica {    
    private double base;
    private double altura;
        
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular a área do retângulo (sobrescrito)
    @Override
    double calcularArea() {
        return base * altura;
    }
}

class TrianguloRetangulo extends FiguraGeometrica {   
    private double base;
        private double altura;
    
    public TrianguloRetangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular a área do triângulo retângulo (sobrescrito)
    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }
}

public class CalculoAreaApp {
    public static void main(String[] args) {      
        Retangulo retangulo = new Retangulo(5, 10);
        TrianguloRetangulo triangulo = new TrianguloRetangulo(6, 8);
       
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Área do triângulo retângulo: " + triangulo.calcularArea());
    }
}
