public class Pessoa {
    private int id;
    private String nome;
    private String logradouro;
    private int numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String uf;
    private String telefone;
    private String cpfCnpj;
   
    public Pessoa(int id, String nome, String logradouro, int numero, String cep, String bairro, String cidade, String uf, String telefone, String cpfCnpj) {
        this.id = id;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.telefone = telefone;
        this.cpfCnpj = cpfCnpj;
    } 
}

public class Associado extends Pessoa {
    private String situacao;
    private int numeroAssociado;
  
    public Associado(int id, String nome, String logradouro, int numero, String cep, String bairro, String cidade, String uf, String telefone, String cpfCnpj, String situacao, int numeroAssociado) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
        this.situacao = situacao;
        this.numeroAssociado = numeroAssociado;
    }    
}

public class Colaborador extends Pessoa {
    private String cargo;
   
    public Colaborador(int id, String nome, String logradouro, int numero, String cep, String bairro, String cidade, String uf, String telefone, String cpfCnpj, String cargo) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
        this.cargo = cargo;
    }   
}

public class Fornecedor extends Pessoa {
    private String nomeFantasia;
    private String website;
    
    public Fornecedor(int id, String nome, String logradouro, int numero, String cep, String bairro, String cidade, String uf, String telefone, String cpfCnpj, String nomeFantasia, String website) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
        this.nomeFantasia = nomeFantasia;
        this.website = website;
    }    
}
