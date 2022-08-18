//Nome do aluno: Rodrigo Sanches Dias Capuzzi

class Aluno{
    private String nome;
    private int codMatricula;
    private double desconto;
    private Curso curso;
    public Aluno(String nome, int codMatricula, double desconto, Curso curso)
    {
        this.nome = nome;
        this.setCodMatricula(codMatricula);
        this.desconto = desconto;
        this.curso = curso;
    }
    public int getCodMatricula() {
        return codMatricula;
    }
    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }
    public String getDados()
    {
        String resp = "Nome do aluno: "+ this.nome +"\n";
        resp += curso.getDados();
        if (this.desconto != 0)
        {
            resp += "\nBolsista com desconto de: " + this.desconto +"%";
        }
        resp += "\nMensalidade final: R$ " +
        curso.calcMensalidade(this.desconto) + "\n";
        return resp;
    }
}
class Curso
{
    private String nomeCurso;
    private String nivelCurso;
    private double valorCurso;
    public Curso(String nomeCurso, String nivelCurso, double valorCurso)
    {
        this.nomeCurso = nomeCurso;
        this.nivelCurso = nivelCurso;
        this.valorCurso = valorCurso;
    }
    public String getDados(){
        String resp = "Curso: " + this.nivelCurso + " em " +
        this.nomeCurso +"\n";
        resp += "Mensalidade: R$ " + this.valorCurso;
        return resp;
    }
    public double calcMensalidade(double desconto){
        return this.valorCurso*(1- desconto/100);
    }
}
class Teste
{
    public static void main (String args[])
    {
        Curso c1 = new Curso("ADS","Graduação",920.50);
        Curso c2 = new Curso("Computação Aplicada","Mestrado",2150.45);
        Aluno a1 = new Aluno("Martin Fowler",11223344,20.5,c1);
        Aluno a2 = new Aluno("Kent Beck",22334455,0,c2);
        System.out.println(a1.getDados());
        System.out.println(a2.getDados());
    }
}