package utils;

import java.io.*;

public class DadosTxt {
    private static String txtFeminino = "Julia;19;ENG CIVIL;3;2, 4;MASC;Virginiana com ascendente em peixes e lua em sagitário, tigre no horóscopo.\n" +
            "Maria;21;BSI;6;1,6;MASC;Curto uma breja, uma cachaça e uma boa companhia para conversar. Vamos conversar e marcar um barzinho?\n" +
            "Eduarda;23;JD;8;4, 5;MASC;Difícil falar de nós mesmos. Sou autêntica, romântica, carinhosa, sempre muito sincera e simples. Adoro uma boa conversa, boa música e boa companhia.\n" +
            "Laura;20;ENG ELETRICA;3;2,3;MASC;Sou cristã, adoro conhecer novas pessoas e amo viajar.\n" +
            "Gabrielle;19;BCC;2;4, 6;MASC;Me chama la (41)9552-3420\n" +
            "Paula Beatriz;19;BCC;2;2, 5;MASC;Adoro viajar e as praias me fascinam. Vivo a vida intensamente, e você?\n" +
            "Fernanda;20;BSI;3;1, 2;MASC;Não tenho medo das novas ideias, mas das velhas sim.\n" +
            "Marcela;21;JD;6;1, 3;MASC;Não tão louca quanto pareço\n" +
            "Talita;22;ENG CIVIL;8;1, 4;MASC;Simpática, engraçada e simples\n" +
            "Julia;19;ENG QUIMICA;4;1, 5;MASC;Eu gosto de cantar, caras com cabelos bagunçados, ler um livro nas manhãs de domingo.\n" +
            "Beatriz;20;ENG BIOMEDICA;6;1, 6;MASC;Simples, doce e objetiva.\n" +
            "Karol;24;BSI;7;3, 4;MASC;Cansada de procurar e não encontrar.\n" +
            "Vitória;19;BCS;3;3, 5;MASC;Gosto muito de pessoas honestas, bem humoradas e gentis.\n" +
            "Camila;21;JD;4;3, 6;MASC;Eu não sei me descrever e nem sei puxar assunto.Eu não sei me descrever e nem sei puxar assunto.\n" +
            "Sara;22;BCS;5;4, 5;MASC;Quer alguém pra construir um relacionamento ? Então pode me esquecer\n" +
            "Sarah;22;ENG SOFTWARE;8;4, 6;MASC;Tranquila e de bem com a vida.\n" +
            "Thaysa;20;BSI;1;2, 6;MASC;Se você está procurando alguém só pra ficar, pode passar pra próxima\n" +
            "Isabella;23;ENG CIVIL;6;5, 6;MASC;Não procuro relacionamentos, só vim dar umas risadas.\n" +
            "Bianca;22;JD;2;1, 2;MASC;Pouco me importa a marca de suas roupas, bolsa, carro, etc. Mas sim, que tipo de pessoa você é em seu coração\n" +
            "Manuela;21;ENG MECANICA;4;1, 3;MASC;Sei o que quero da minha vida, quero te encontrar e dizer que vale a pena ficar com você.\n" +
            "Helena;20;ENG COMPUTAÇÃO;2;1, 4;MASC;Procurando novos amigos, para sair, beber, conversar e dançar.\n" +
            "Isabelly;19;BCC;3;1, 5;MASC;Amo a vida, adoro viajar.\n" +
            "Ana;20;BSI;3;5, 6;MASC;Filhos, corrida, escalada, estudar, conhecer pessoas.\n" +
            "Rebeca;18;ENG ELÉTRICA;1;2, 3;MASC;Isso aqui é um cardápio humano, me tire daqui!\n" +
            "Emanuelly;20;ENG PRODUÇÃO;3;2, 4;MASC;Sou tudo o que você está procurando.\n" +
            "Sophia;23;ENG MECATRONICA;5;2, 5;MASC;As vezes vale a pena viver por aquilo que você morreria!\n" +
            "Carolina;22;BSI;6;2, 6;MASC;A procura de um namorado, espero o seu sinal.\n" +
            "Ester;21;JD;3;3, 5;MASC;A procura de um amigo, se possível, quem queira relacionamento sério.\n" +
            "Rayssa;20;JD;2;3, 6;MASC;Por uma vida com mais sorrisos e gentilezas.\n" +
            "Jennifer;20;BCS;1;3, 4;MASC;A vida está aí e passa muito depressa. Está a fim de viver? Vem comigo!\n" +
            "Amanda;21;BCS;5;5, 6;MASC;Os pequenos detalhes são sempre os mais importantes\n" +
            "Gabriela;22;BCS;7;4, 5;MASC;Casa comigo?\n" +
            "Clara;21;BSI;6;4, 6;MASC;O futuro não está escrito. Nós fazemos nosso próprio destino.\n" +
            "Rosanna;19;ENG BIOMEDICA;6;1, 3;MASC;Não tenho medo das novas ideias, mas das velhas sim.\n" +
            "Heloisa;18;ENG COMPUTAÇÃO;2;1, 2;MASC;Cinema, exposições, bares, shows, rock, jazz, bossa nova, cerveja, vinho, caipirinha, séries, livros.\n" +
            "Alícia;23;ENG CIVIL;6;1, 4;MASC;O ontem é história, o amanhã é um mistério, mas o hoje é uma dádiva. É por isso que se chama presente.\n" +
            "Maria;22;ENG PRODUÇÃO;8;1, 6;MASC;O que quer que aconteça amanhã, teremos o hoje!\n" +
            "Carolina;20;ENG ELÉTRICA;4;1, 5;MASC;A diferença do amor e o ódio é que por ódio você mata… por amor você morre!\n" +
            "Milena;21;ENG SOFTWARE;4;2, 3;MASC;Capacidade de falar não é sinal de inteligência!\n" +
            "Nathalia;21;ENG MECANICA;3;2, 4;MASC;As pessoas temem o que não entendem.\n" +
            "Gabrielly;21;ENG MECATRONICA;2;2, 5;MASC;Porque se disfarçar, se você pode se destacar?\n" +
            "Luana;20;ENG QUIMICA;5;2, 6;MASC;tentando pagar meu aluguel, tocar minha música e fazer o meu caminho.\n" +
            "Bruna;19;BCC;1;3, 4;MASC;Você deveria saber que eu odeio idosos, crianças e cães.\n" +
            "Juliana;23;ENG MECANICA;6;3, 5;MASC;A gente pensa demais no tempo que nos resta e acaba não vivendo.\n" +
            "Maitê;20;BSI;4;3, 6;MASC;Ansiosa para viajar para o nordeste no verão.";

    private static String txtMasculino = "Mikael;19;BCC;2;2, 6;Fem;O que gosto: trabalho, família, viajar e de uma boa companhia.\n" +
            "Thomas;18;BCC;2;5, 6;Fem;Não tenho expectativas neste Tinder da Politécnica… vamos ver o que acontece!\n" +
            "Enzo;19;BCC;2;4, 6;Fem;O bate-papo aqui é muito lento, passa o whats\n" +
            "Pietro;19;ENG CIVIL;3;1, 4;Fem;Bom, está com tempo? Então pega a cadeira que a história é longa.\n" +
            "Angelo;21;ENG MECÂNICA;4;2, 5;Fem;A procura de uma namorada, espero o seu sinal.\n" +
            "Murilo;25;ENG MECÂNICA;5;4, 6;Fem;Tranquilo e de bem com a vida\n" +
            "Samuel;17;JD;1;5, 6;Fem;Sou tudo aquilo que uma mulher procura.\n" +
            "Antônio;20;ENG PRODUÇÃO;3;1, 3;Fem;Sou simples, tranquilo, amante da natureza. Solteiro, sem filhos.\n" +
            "Thiago;18;ENG COMPUTAÇÃO;4;4, 6;Fem;Difícil falar de nós mesmos. Sou autêntico, cavalheiro, romântico, carinhoso, sempre muito sincero e simples.\n" +
            "Emanuel;22;ENG ELÉTRICA;3;2, 3;Fem;Adoro uma boa conversa, boa música e boa companhia.\n" +
            "Guilherme;26;ENG CIVIL;9;3, 5;Fem;Solteiro sem filhos, não fumo. A procura de uma amiga, se possível, quem queira relacionamento sério.\n" +
            "Diego;19;ENG BIOMÉDICA;1;3, 6;Fem;Pouco me importa a marca de suas roupas, bolsa, carro, etc. Mas sim, que tipo de pessoa você é em seu coração. Seja bem-vinda.\n" +
            "Leonardo;22;ENG SOFTWARE;5;4, 5;Fem;A vida está aí e passa muito depressa. Está a fim de viver? Vem comigo!\n" +
            "Giovanni;23;ENG QUÍMICA;6;1, 6;Fem;Sou simpático, romântico, adoro cinema, sair à noite para dançar. Sou sincero e extrovertido.\n" +
            "Marco;24;BCS;4;3, 4;Fem;Sou simples, tranquilo, amante da natureza.\n" +
            "Patrick;17;ENG ELÉTRICA;1;1, 5;Fem;Adoro cafuné, guerra de travesseiros e roubar o edredom durante a noite.\n" +
            "Henry;18;ENG COMPUTAÇÃO;2;1, 2;Fem;Sou do tipo que ama uma boa comida, então vou pedir um iFood para o nosso jantar virtual.\n" +
            "Nicolas;23;ENG MECATRÔNICA;7;2, 4;Fem;Não tenho COVID desde 1979\n" +
            "Kevin;25;BSI;5;2, 4;Fem;Se online já sou tudo de bom, espere até nos encontrarmos pessoalmente.\n" +
            "Robert;26;ENG BIOMÉDICA;9;2, 6;Fem;Queria alguém para maratonar séries comigo, topa!\n" +
            "Breno;21;ENG MECATRÔNICA;4;1, 5;Fem;Agora que já demos match, você está convidada para o nosso casamento!\n" +
            "Marcelo;24;ENG PRODUÇÃO;5;3, 4;Fem;Quem diria que uma deusa como você cometeria o deslize de conversar com um mortal como eu?\n" +
            "Thiago;25;JD;6;2, 4;Fem;Oi. Só passei pra avisar que a gente tá namorando. Acho que você ainda não sabia\n" +
            "José;27;ENG MECÂNICA;9;1, 2;Fem;Nunca acreditei em amor à primeira vista, mas, depois de te encontrar por aqui, acredito em amor ao primeiro match\n" +
            "Alexandre;20;ENG QUÍMICA;3;3, 4;Fem;Gata, você é a prova de que Deus existe mesmo, porque uma criatura perfeita assim só pode ser criação divina!\n" +
            "Tomás;23;BSI;5;2, 5;Fem;quer deletar o perfil deste aplicativo junto comigo? Acho que não precisamos mais dele...\n" +
            "Ricardo;25;ENG ELÉTRICA;7;5, 6;Fem;A vida pode até não estar fácil para você, mas eu estou.\n" +
            "Fernando;19;ENG SOFTWARE;2;1, 4;Fem;Estou procurando alguém com crédito para ligar e pedir uma pizza.\n" +
            "Lucas;24;BCS;6;5, 6;Fem;Nossa... Acho que vou te denunciar aqui. Esses olhos não podem ser reais!\n" +
            "Gustavo;22;ENG QUÍMICA;5;2, 3;Fem;Achei que esse aplicativo permitia apenas humanos, mas acho que estou enganado. Olha que anjo sem asas que acabo de encontrar!\n" +
            "Samuel;25;ENG MECATRÔNICA;8;2, 5;Fem;Viajar, aventuras, esportes radicais também são uma parte vital de mim, mas eu gosto de lisonjeá-los e assisti-los em vez de praticar.\n" +
            "Igor;18;ENG CIVIL;2;3, 4;Fem;Olá, se você está lendo este texto agora, saiba que eu quero tirá-la deste app. Me dê o seu melhor sorriso que eu o multiplicarei!\n" +
            "Jhonatan;26;ENG PRODUÇÃO;9;4, 5;Fem;Busco afinidade, sintonia e a sinergia entre duas pessoas. Se isso faz sentido para você, continue.\n" +
            "Everton;21;ENG COMPUTAÇÃO;6;5, 6;Fem;Adoro correr, conhecer novos lugares, um delicioso café descontraído com amigos.\n" +
            "Rafael;20;ENG CIVIL;4;3, 6;Fem;Quero conhecer mulheres interessadas em algo mais sério e tranquilo.\n" +
            "André;23;ENG BIOMÉDICA;7;1, 3;Fem;Um cara muito legal. Vamos dar risada porque a vida já é muito difícil!\n" +
            "George;18;ENG SOFTWARE;1;3, 5;Fem;Pessoa simples, que gosta de curtir a vida, adora uma boa festa, viajar.\n" +
            "Luiz;18;BSI;1;4, 6;Fem;Fiel à família e à vida. À procura de uma pessoa especial.\n" +
            "Fabrício;24;BSC;5;1, 2;Fem;Gosto de coisas simples como bons momentos com amigos, um cinema ou um bom show.\n" +
            "Anderson;25;ENG BIOMÉDICA;9;2, 4;Fem;Não tenho medo de me apaixonar. Adoro viver intensamente. O resto, fale-me você!\n" +
            "Paulo;22;BCC;6;1, 5;Fem;Sou simples, tranquilo, amante da natureza. Solteiro, sem filhos.\n" +
            "Patrick;20;JD;4;3, 5;Fem;Me tira do Tinder!!!\n" +
            "Robson;25;ENG MECÂNICA;8;2, 5;Fem;Te conto no caminho...\n" +
            "Mateus;19;ENG PRODUÇÃO;2;5, 6;Fem;Em busca de uma crush pra me acompanhar no casamento via Zoom do meu primo \n" +
            "Felipe;21;ENG QUÍMICA;5;2, 4;Fem;Louco para arrumar uma companhia para fazer vídeos engraçados no TikTok comigo";


    public static void criaArquivosTxt() {
        BufferedWriter arquivoTxtFem = null;
        BufferedWriter arquivoTxtMasc = null;

        try {
            //se não houver os arquivos txt nesse diretório será criado novos arquivos
            if (!verificaSeArquivoFemExiste()) {
                arquivoTxtFem = new BufferedWriter((new FileWriter("C:\\Windows\\Temp\\perfisFem.txt")));
                arquivoTxtFem.write(txtFeminino);

                //atualiza o txt com as novas informações
                arquivoTxtFem.flush();
            }
            if (!verificaSeArquivoMascExiste()) {
                arquivoTxtMasc = new BufferedWriter((new FileWriter("C:\\Windows\\Temp\\perfisMasc.txt")));
                arquivoTxtMasc.write(txtMasculino);

                //atualiza o txt com as novas informações
                arquivoTxtMasc.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean verificaSeArquivoMascExiste() {
        File arquivoTxtMasc = new File("C:\\Windows\\Temp\\perfisMasc.txt");
        if (!arquivoTxtMasc.exists()) {
            return false;
        }
        return true;
    }

    private static boolean verificaSeArquivoFemExiste() {
        File arquivoTxtFem = new File("C:\\Windows\\Temp\\perfisFem.txt");

        if (!arquivoTxtFem.exists()) {
            return false;
        }
        return true;
    }
}