class Aluno{
	private String nome, nome_curso, nível_curso;
	private int cód_matrícula, ano_finalização;
	private boolean é_bolsista, curso_finalizado, tem_trabalho;
	private double mensalidade_curso, desconto;
	private String dados_tcc [] = new String [3];
	//[título do trabalho, nome do orientador, nota do trabalho]
	public Aluno(String nome,
				String nome_curso, 
				String nível_curso,
				int cód_matrícula,
				boolean é_bolsista,
				boolean curso_finalizado,
				boolean tem_trabalho,
				int ano_finalização,
				double mensalidade_curso,
				double desconto,
				String dados_tcc[]) {
		this.nome = nome;
		this.nome_curso = nome_curso;
		this.nível_curso = nível_curso;
		this.cód_matrícula = cód_matrícula;
		this.é_bolsista = é_bolsista;
		this.curso_finalizado = curso_finalizado;
		this.tem_trabalho = tem_trabalho;
		this.ano_finalização = ano_finalização;
		this.mensalidade_curso = mensalidade_curso;
		this.desconto = desconto;
		this.dados_tcc = dados_tcc;
				}
		
		public String getDados()
		{
			String resp = "Aluno: "+ this.nome +"\n";
			resp += "Curso: " + this.nível_curso + " em " + this.nome_curso +"\n";
			if (this.é_bolsista) 
			{
				resp += "Bolsista com desconto de: " + this.desconto + "%\n";
				resp += "Mensalidade: R$ " + this.mensalidade_curso*(1-this.desconto/100)+ "\n";
			}
			else resp += "Mensalidade: R$ " + this.mensalidade_curso+ "\n";
			if (this.curso_finalizado)
			{
			 resp += "Curso finalizado em "+ano_finalização + "\n";
			 if (this.tem_trabalho)
			 {
				resp += "Título ";
				switch (nível_curso)
				{
				 case "Graduação": resp += "do TCC: "; break;
				 case "Lato sensu": resp += "da monografia: "; break;
				 case "Mestrado": resp += "da dissertação: "; break;
				 case "Doutorado": resp += "da tese: "; break;
				}
				resp += dados_tcc[1] + "\n";
				resp += "Orientador(a): Prof. " + dados_tcc[0] + "\n";
				resp += "Nota: " + dados_tcc[2];
			}
			}
			return resp;
		}
}

class Teste
{
	public static void main (String args[])
	{
		String dados1 [] = {null,null,null};
		Aluno aluno1 = new Aluno("Martin Fowler",
							"ADS",
							"Graduação",
							11223344,
							true,
							false,
							false,
							-1,
							920.50,
							20.5,
							dados1);
							
		String dados2 [] = {"Peter Coad","Impacto da Refatoração","9.5"};
		Aluno aluno2 = new Aluno("Kent Beck",
							"Computação Aplicada",
							"Mestrado",
							22334455,
							false,
							true,
							true,
							2019,
							2150.45,
							0,
							dados2);
		System.out.println(aluno1.getDados());
		System.out.println(aluno2.getDados());
	}
}