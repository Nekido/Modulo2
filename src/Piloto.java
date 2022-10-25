public class Piloto {


    private String nome;

    private Genero sexo;

    private int idade;

    private String equipe;

    public Piloto(String nome, Genero sexo, int idade, String equipe) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.equipe = equipe;
    }


    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Genero getSexo() {

        return sexo;
    }

    public void setGenero(Genero sexo) {

        this.sexo = sexo;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    public String getEquipe() {

        return equipe;
    }

    public void setEquipe(String equipe) {

        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", idade=" + idade +
                ", equipe='" + equipe + '\'' +
                '}';
    }

}


