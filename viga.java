import javax.swing.JOptionPane;

public class Viga {
    private double base;
    private double altura;
    private double comprimento;
    
    public Viga(double base, double altura, double comprimento) {
        this.base = base;
        this.altura = altura;
        this.comprimento = comprimento;
    }
   
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    
    public double calcularVolume() {
        return base * altura * comprimento;
    }
    
    public void exibirResultado() {
        double volume = calcularVolume();
        JOptionPane.showMessageDialog(null, "O volume da viga é: " + volume + " metros cúbicos");
    }

    public static void main(String[] args) {

        double base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base da viga (em metros):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura da viga (em metros):"));
        double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento da viga (em metros):"));
        
        Viga viga = new Viga(base, altura, comprimento);
        
        viga.exibirResultado();
    }
}
