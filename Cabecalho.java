public class Cabecalho  {
    String faculdade = "UNIFAN - Centro Universitário Alfredo Nasser";
    String aluno = "Arthur Rocha";
    String professor = "Brenno Pimenta da Costa";
    String tema = "Segurança da Informação";

    public void escrevaCabecalho() {
        System.out.println("==================================================");
        System.out.println("                  QUIZ - PERGUNTAS E RESPOSTAS");
        System.out.println("==================================================");
        System.out.println("Faculdade: " + this.faculdade);
        System.out.println("Aluno:     " + this.aluno);
        System.out.println("Professor: " + this.professor);
        System.out.println("Tema:      " + this.tema);
        System.out.println("==================================================");
        System.out.println();
    }
}

