public class Principal {

    public static void main(String[] args) {

        Cabecalho cabecalho = new Cabecalho();
        cabecalho.escrevaCabecalho();

        int acertos = 0;
        String resposta;


        Questao q1 = new Questao();
        q1.pergunta = "1) Na segurança da informação, a tríade CIA representa quais princípios?";
        q1.opcaoA = "A) Criptografia, Identidade e Acesso";
        q1.opcaoB = "B) Controle, Inspeção e Auditoria";
        q1.opcaoC = "C) Confidencialidade, Integridade e Disponibilidade";
        q1.opcaoD = "D) Certificação, Imunidade e Autenticação";
        q1.opcaoE = "E) Cópia, Isolamento e Antivírus";
        q1.correta = "C";
        q1.escrevaQuestao();
        resposta = q1.leiaResposta();
        if (q1.isCorreta(resposta)) {
            acertos++;
        }


        Questao q2 = new Questao();
        q2.pergunta = "2) O que é phishing?";
        q2.opcaoA = "A) Um programa que acelera o computador";
        q2.opcaoB = "B) Uma fraude que engana a vítima para roubar dados, geralmente por e-mails ou sites falsos";
        q2.opcaoC = "C) Um tipo de firewall";
        q2.opcaoD = "D) Um backup automático na nuvem";
        q2.opcaoE = "E) Um método de criptografia";
        q2.correta = "B";
        q2.escrevaQuestao();
        resposta = q2.leiaResposta();
        if (q2.isCorreta(resposta)) {
            acertos++;
        }


        Questao q3 = new Questao();
        q3.pergunta = "3) Qual malware sequestra (criptografa) os arquivos da vítima e exige pagamento de resgate?";
        q3.opcaoA = "A) Spyware";
        q3.opcaoB = "B) Adware";
        q3.opcaoC = "C) Keylogger";
        q3.opcaoD = "D) Ransomware";
        q3.opcaoE = "E) Rootkit";
        q3.correta = "D";
        q3.escrevaQuestao();
        resposta = q3.leiaResposta();
        if (q3.isCorreta(resposta)) {
            acertos++;
        }


        Questao q4 = new Questao();
        q4.pergunta = "4) Qual é a principal função de um firewall?";
        q4.opcaoA = "A) Filtrar e controlar o tráfego de rede, bloqueando acessos não autorizados";
        q4.opcaoB = "B) Aumentar a velocidade da internet";
        q4.opcaoC = "C) Armazenar senhas dos usuários";
        q4.opcaoD = "D) Fazer backup dos arquivos";
        q4.opcaoE = "E) Remover vírus do computador";
        q4.correta = "A";
        q4.escrevaQuestao();
        resposta = q4.leiaResposta();
        if (q4.isCorreta(resposta)) {
            acertos++;
        }


        Questao q5 = new Questao();
        q5.pergunta = "5) O que caracteriza a autenticação em dois fatores (2FA)?";
        q5.opcaoA = "A) Usar duas senhas iguais em dois sites";
        q5.opcaoB = "B) Digitar a mesma senha duas vezes";
        q5.opcaoC = "C) Ter dois antivírus instalados";
        q5.opcaoD = "D) Usar dois computadores ao mesmo tempo";
        q5.opcaoE = "E) Combinar duas formas diferentes de verificação, como senha e código enviado ao celular";
        q5.correta = "E";
        q5.escrevaQuestao();
        resposta = q5.leiaResposta();
        if (q5.isCorreta(resposta)) {
            acertos++;
        }


        Questao q6 = new Questao();
        q6.pergunta = "6) Qual das opções abaixo é um exemplo de senha mais segura?";
        q6.opcaoA = "A) 123456";
        q6.opcaoB = "B) minhasenha";
        q6.opcaoC = "C) T7#kP9!vQ2@m";
        q6.opcaoD = "D) data de nascimento";
        q6.opcaoE = "E) nome do animal de estimação";
        q6.correta = "C";
        q6.escrevaQuestao();
        resposta = q6.leiaResposta();
        if (q6.isCorreta(resposta)) {
            acertos++;
        }


        Questao q7 = new Questao();
        q7.pergunta = "7) O princípio da integridade garante que:";
        q7.opcaoA = "A) Apenas pessoas autorizadas vejam a informação";
        q7.opcaoB = "B) A informação não seja alterada de forma indevida ou não autorizada";
        q7.opcaoC = "C) O sistema esteja sempre disponível";
        q7.opcaoD = "D) Ninguém saiba quem acessou o sistema";
        q7.opcaoE = "E) Os dados sejam sempre apagados após o uso";
        q7.correta = "B";
        q7.escrevaQuestao();
        resposta = q7.leiaResposta();
        if (q7.isCorreta(resposta)) {
            acertos++;
        }


        Questao q8 = new Questao();
        q8.pergunta = "8) O que é engenharia social na segurança da informação?";
        q8.opcaoA = "A) Um curso sobre redes sociais";
        q8.opcaoB = "B) Uma técnica de programação em Java";
        q8.opcaoC = "C) Um tipo de antivírus";
        q8.opcaoD = "D) Manipulação psicológica de pessoas para obter informações sigilosas ou acesso indevido";
        q8.opcaoE = "E) Uma regra de convivência em redes sociais";
        q8.correta = "D";
        q8.escrevaQuestao();
        resposta = q8.leiaResposta();
        if (q8.isCorreta(resposta)) {
            acertos++;
        }


        Questao q9 = new Questao();
        q9.pergunta = "9) Em que consiste um ataque DDoS?";
        q9.opcaoA = "A) Sobrecarregar um serviço com um grande volume de requisições, deixando-o indisponível";
        q9.opcaoB = "B) Roubar senhas digitadas no teclado";
        q9.opcaoC = "C) Criptografar os arquivos da vítima";
        q9.opcaoD = "D) Enviar e-mails falsos";
        q9.opcaoE = "E) Instalar um programa espião";
        q9.correta = "A";
        q9.escrevaQuestao();
        resposta = q9.leiaResposta();
        if (q9.isCorreta(resposta)) {
            acertos++;
        }


        Questao q10 = new Questao();
        q10.pergunta = "10) Para que serve a criptografia?";
        q10.opcaoA = "A) Deixar o computador mais rápido";
        q10.opcaoB = "B) Apagar arquivos antigos";
        q10.opcaoC = "C) Bloquear propagandas";
        q10.opcaoD = "D) Aumentar o espaço de armazenamento";
        q10.opcaoE = "E) Transformar dados em um formato ilegível para quem não possui a chave";
        q10.correta = "E";
        q10.escrevaQuestao();
        resposta = q10.leiaResposta();
        if (q10.isCorreta(resposta)) {
            acertos++;
        }


        Questao q11 = new Questao();
        q11.pergunta = "11) Qual é a importância de realizar backups regularmente?";
        q11.opcaoA = "A) Impedir que hackers descubram senhas";
        q11.opcaoB = "B) Deixar a internet mais rápida";
        q11.opcaoC = "C) Permitir recuperar os dados em caso de perda, falha ou ataque";
        q11.opcaoD = "D) Evitar atualizações do sistema";
        q11.opcaoE = "E) Desativar o firewall";
        q11.correta = "C";
        q11.escrevaQuestao();
        resposta = q11.leiaResposta();
        if (q11.isCorreta(resposta)) {
            acertos++;
        }


        Questao q12 = new Questao();
        q12.pergunta = "12) No Brasil, qual lei trata da proteção e do tratamento de dados pessoais?";
        q12.opcaoA = "A) Lei Maria da Penha";
        q12.opcaoB = "B) LGPD - Lei Geral de Proteção de Dados";
        q12.opcaoC = "C) Lei Áurea";
        q12.opcaoD = "D) Código de Defesa do Consumidor, apenas";
        q12.opcaoE = "E) Lei de Diretrizes e Bases da Educação";
        q12.correta = "B";
        q12.escrevaQuestao();
        resposta = q12.leiaResposta();
        if (q12.isCorreta(resposta)) {
            acertos++;
        }


        Questao q13 = new Questao();
        q13.pergunta = "13) Qual é a principal característica de um worm (verme)?";
        q13.opcaoA = "A) Só age se o usuário abrir um arquivo anexo manualmente";
        q13.opcaoB = "B) Apenas exibe propagandas";
        q13.opcaoC = "C) Funciona somente em celulares";
        q13.opcaoD = "D) Replica-se e se espalha automaticamente pela rede, sem precisar de ação do usuário";
        q13.opcaoE = "E) É um tipo de backup";
        q13.correta = "D";
        q13.escrevaQuestao();
        resposta = q13.leiaResposta();
        if (q13.isCorreta(resposta)) {
            acertos++;
        }


        Questao q14 = new Questao();
        q14.pergunta = "14) O que faz um spyware?";
        q14.opcaoA = "A) Monitora as atividades do usuário e envia as informações a terceiros sem consentimento";
        q14.opcaoB = "B) Protege o computador contra invasões";
        q14.opcaoC = "C) Cria cópias de segurança";
        q14.opcaoD = "D) Atualiza o sistema operacional";
        q14.opcaoE = "E) Bloqueia e-mails de spam";
        q14.correta = "A";
        q14.escrevaQuestao();
        resposta = q14.leiaResposta();
        if (q14.isCorreta(resposta)) {
            acertos++;
        }


        Questao q15 = new Questao();
        q15.pergunta = "15) Qual a principal vantagem de usar uma VPN em redes Wi-Fi públicas?";
        q15.opcaoA = "A) Aumentar a velocidade da conexão";
        q15.opcaoB = "B) Eliminar a necessidade de senhas";
        q15.opcaoC = "C) Impedir qualquer tipo de vírus";
        q15.opcaoD = "D) Dar acesso gratuito a todos os sites pagos";
        q15.opcaoE = "E) Criar um túnel criptografado, protegendo os dados transmitidos";
        q15.correta = "E";
        q15.escrevaQuestao();
        resposta = q15.leiaResposta();
        if (q15.isCorreta(resposta)) {
            acertos++;
        }


        double media = (acertos / 15.0) * 100;

        System.out.println("==================================================");
        System.out.println("FIM DO QUIZ!");
        System.out.println("Questões acertadas: " + acertos + " de 15");
        System.out.printf("Média de acerto: %.2f%%%n", media);
        System.out.println("Obrigado por participar do nosso quiz sobre Segurança da Informação!");
        System.out.println("==================================================");
    }
}


