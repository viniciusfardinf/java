public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anoModelo;
    private int anoFabricacao;
    private String chassi;
    private String renavam;
    private String procedencia;
    private double capacidadeCargaKg;
    private double altura;
    private double largura;
    private double profundidade;

    public Veiculo(String placa, String marca, String modelo, int anoModelo, int anoFabricacao,
                   String chassi, String renavam, String procedencia, double capacidadeCargaKg,
                   double altura, double largura, double profundidade) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.chassi = chassi;
        this.renavam = renavam;
        this.procedencia = procedencia;
        this.capacidadeCargaKg = capacidadeCargaKg;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public abstract String getEspecie();    
    
}

public class VeiculoPassageiro extends Veiculo {
    private String corExterna;
    private String corInterna;
    private String tipoCombustivel;
    private String motor;
    private double quilometragem;
    private double consumoMedio;
    private int numPortas;
    private int numPassageiros;
    private String[] opcionais;

    public VeiculoPassageiro(String placa, String marca, String modelo, int anoModelo, int anoFabricacao,
                             String chassi, String renavam, String procedencia, double altura, double largura,
                             double profundidade, String corExterna, String corInterna, String tipoCombustivel,
                             String motor, double quilometragem, double consumoMedio, int numPortas, int numPassageiros,
                             String[] opcionais) {
        super(placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam, procedencia,
              0, altura, largura, profundidade);
        this.corExterna = corExterna;
        this.corInterna = corInterna;
        this.tipoCombustivel = tipoCombustivel;
        this.motor = motor;
        this.quilometragem = quilometragem;
        this.consumoMedio = consumoMedio;
        this.numPortas = numPortas;
        this.numPassageiros = numPassageiros;
        this.opcionais = opcionais;
    }

    @Override
    public String getEspecie() {
        return "Veículo de Passageiro";
    }    
}

public class VeiculoCarga extends Veiculo {
    private String corExterna;
    private String tipoCombustivel;
    private String motor;
    private double quilometragem;
    private double consumoMedio;

    public VeiculoCarga(String placa, String marca, String modelo, int anoModelo, int anoFabricacao,
                        String chassi, String renavam, String procedencia, double capacidadeCargaKg,
                        double altura, double largura, double profundidade, String corExterna,
                        String tipoCombustivel, String motor, double quilometragem, double consumoMedio) {
        super(placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam, procedencia,
              capacidadeCargaKg, altura, largura, profundidade);
        this.corExterna = corExterna;
        this.tipoCombustivel = tipoCombustivel;
        this.motor = motor;
        this.quilometragem = quilometragem;
        this.consumoMedio = consumoMedio;
    }

    @Override
    public String getEspecie() {
        return "Veículo de Carga";
    }    
}
