package utils;

import java.io.*;

public class DadosTxt {
    private static String txtFeminino = "Julia;admbot;19;ENG CIVIL;3;2;4;Virginiana com ascendente em peixes e lua em sagitário, tigre no horóscopo.\n" +
            "Maria;admbot;21;BSI;6;1;6;Curto uma breja, uma cachaça e uma boa companhia para conversar. Vamos conversar e marcar um barzinho?\n" +
            "Eduarda;admbot;23;JD;8;4;5;Difícil falar de nós mesmos. Sou autêntica, romântica, carinhosa, sempre muito sincera e simples. Adoro uma boa conversa, boa música e boa companhia.\n" +
            "Laura;admbot;20;ENG ELETRICA;3;2;3;Sou cristã, adoro conhecer novas pessoas e amo viajar.\n" +
            "Gabrielle;admbot;19;BCC;2;4;6;Me chama la (41)9552-3420\n" +
            "Paula Beatriz;admbot;19;BCC;2;2;5;Adoro viajar e as praias me fascinam. Vivo a vida intensamente, e você?\n" +
            "Fernanda;admbot;20;BSI;3;1;2;Não tenho medo das novas ideias, mas das velhas sim.\n" +
            "Marcela;admbot;21;JD;6;1;3;Não tão louca quanto pareço\n" +
            "Talita;admbot;22;ENG CIVIL;8;1;4;Simpática, engraçada e simples\n" +
            "Julia;admbot;19;ENG QUIMICA;4;1;5;Eu gosto de cantar, caras com cabelos bagunçados, ler um livro nas manhãs de domingo.\n" +
            "Beatriz;admbot;20;ENG BIOMEDICA;6;1;6;Simples, doce e objetiva.\n" +
            "Karol;admbot;24;BSI;7;3;4;Cansada de procurar e não encontrar.\n" +
            "Vitória;admbot;19;BCS;3;3;5;Gosto muito de pessoas honestas, bem humoradas e gentis.\n" +
            "Camila;admbot;21;JD;4;3;6;Eu não sei me descrever e nem sei puxar assunto.Eu não sei me descrever e nem sei puxar assunto.\n" +
            "Sara;admbot;22;BCS;5;4;5;Quer alguém pra construir um relacionamento ? Então pode me esquecer\n" +
            "Sarah;admbot;22;ENG SOFTWARE;8;4;6;Tranquila e de bem com a vida.\n" +
            "Thaysa;admbot;20;BSI;1;2;6;Se você está procurando alguém só pra ficar, pode passar pra próxima\n" +
            "Isabella;admbot;23;ENG CIVIL;6;5;6;Não procuro relacionamentos, só vim dar umas risadas.\n" +
            "Bianca;admbot;22;JD;2;1;2;Pouco me importa a marca de suas roupas, bolsa, carro, etc. Mas sim, que tipo de pessoa você é em seu coração\n" +
            "Manuela;admbot;21;ENG MECANICA;4;1;3;Sei o que quero da minha vida, quero te encontrar e dizer que vale a pena ficar com você.\n" +
            "Helena;admbot;;ENG COMPUTAÇÃO;2;1;4;Procurando novos amigos, para sair, beber, conversar e dançar.\n" +
            "Isabelly;admbot;19;BCC;3;1;5;Amo a vida, adoro viajar.\n" +
            "Ana;admbot;20;BSI;3;5;6;Filhos, corrida, escalada, estudar, conhecer pessoas.\n" +
            "Rebeca;admbot;18;ENG ELÉTRICA;1;2;3;Isso aqui é um cardápio humano, me tire daqui!\n" +
            "Emanuelly;admbot;20;ENG PRODUÇÃO;3;2;4;Sou tudo o que você está procurando.\n" +
            "Sophia;admbot;23;ENG MECATRONICA;5;2;5;As vezes vale a pena viver por aquilo que você morreria!\n" +
            "Carolina;admbot;22;BSI;6;2;6;A procura de um namorado, espero o seu sinal.\n" +
            "Ester;admbot;21;JD;3;3;5;A procura de um amigo, se possível, quem queira relacionamento sério.\n" +
            "Rayssa;admbot;20;JD;2;3;6;Por uma vida com mais sorrisos e gentilezas.\n" +
            "Jennifer;admbot;20;BCS;1;3;4;A vida está aí e passa muito depressa. Está a fim de viver? Vem comigo!\n" +
            "Amanda;admbot;21;BCS;5;5;6;Os pequenos detalhes são sempre os mais importantes\n" +
            "Gabriela;admbot;22;BCS;7;4;5;Casa comigo?\n" +
            "Clara;admbot;21;BSI;6;4;6;O futuro não está escrito. Nós fazemos nosso próprio destino.\n" +
            "Rosanna;admbot;19;ENG BIOMEDICA;6;1;3;Não tenho medo das novas ideias, mas das velhas sim.\n" +
            "Heloisa;admbot;18;ENG COMPUTAÇÃO;2;1;2;Cinema, exposições, bares, shows, rock, jazz, bossa nova, cerveja, vinho, caipirinha, séries, livros.\n" +
            "Alícia;admbot;23;ENG CIVIL;6;1;4;O ontem é história, o amanhã é um mistério, mas o hoje é uma dádiva. É por isso que se chama presente.\n" +
            "Maria;admbot;22;ENG PRODUÇÃO;8;1;6;O que quer que aconteça amanhã, teremos o hoje!\n" +
            "Carolina;admbot;0;ENG ELÉTRICA;4;1;5;A diferença do amor e o ódio é que por ódio você mata… por amor você morre!\n" +
            "Milena;admbot;21;ENG SOFTWARE;4;2;3;Capacidade de falar não é sinal de inteligência!\n" +
            "Nathalia;admbot;21;ENG MECANICA;3;2;4;As pessoas temem o que não entendem.\n" +
            "Gabrielly;admbot;21;ENG MECATRONICA;2;2;5;Porque se disfarçar, se você pode se destacar?\n" +
            "Luana;admbot;20;ENG QUIMICA;5;2;6;tentando pagar meu aluguel, tocar minha música e fazer o meu caminho.\n" +
            "Bruna;admbot;19;BCC;1;3;4;Você deveria saber que eu odeio idosos, crianças e cães.\n" +
            "Juliana;admbot;23;ENG MECANICA;6;3;5;A gente pensa demais no tempo que nos resta e acaba não vivendo.\n" +
            "Maitê;admbot;20;BSI;4;3;6;Ansiosa para viajar para o nordeste no verão.";

    private static String txtMasculino = "Mikael;admbot;19;BCC;2;2;6;O que gosto: trabalho, família, viajar e de uma boa companhia.\n" +
            "Thomas;admbot;18;BCC;2;5;6;Não tenho expectativas neste Tinder da Politécnica… vamos ver o que acontece!\n" +
            "Enzo;admbot;19;BCC;2;4;6;O bate-papo aqui é muito lento, passa o whats\n" +
            "Pietro;admbot;19;ENG CIVIL;3;1;4;Bom, está com tempo? Então pega a cadeira que a história é longa.\n" +
            "Angelo;admbot;21;ENG MECÂNICA;4;2;5;A procura de uma namorada, espero o seu sinal.\n" +
            "Murilo;admbot;25;ENG MECÂNICA;5;4;6;Tranquilo e de bem com a vida\n" +
            "Samuel;admbot;17;JD;1;5;6;Sou tudo aquilo que uma mulher procura.\n" +
            "Antônio;admbot;20;ENG PRODUÇÃO;3;1;3;Sou simples, tranquilo, amante da natureza. Solteiro, sem filhos.\n" +
            "Thiago;admbot;18;ENG COMPUTAÇÃO;4;4;6;Difícil falar de nós mesmos. Sou autêntico, cavalheiro, romântico, carinhoso, sempre muito sincero e simples.\n" +
            "Emanuel;admbot;22;ENG ELÉTRICA;3;2;3;Adoro uma boa conversa, boa música e boa companhia.\n" +
            "Guilherme;admbot;26;ENG CIVIL;9;3;5;Solteiro sem filhos, não fumo. A procura de uma amiga, se possível, quem queira relacionamento sério.\n" +
            "Diego;admbot;19;ENG BIOMÉDICA;1;3;6;Pouco me importa a marca de suas roupas, bolsa, carro, etc. Mas sim, que tipo de pessoa você é em seu coração. Seja bem-vinda.\n" +
            "Leonardo;admbot;22;ENG SOFTWARE;5;4;5;A vida está aí e passa muito depressa. Está a fim de viver? Vem comigo!\n" +
            "Giovanni;admbot;23;ENG QUÍMICA;6;1;6;Sou simpático, romântico, adoro cinema, sair à noite para dançar. Sou sincero e extrovertido.\n" +
            "Marco;admbot;24;BCS;4;3;4;Sou simples, tranquilo, amante da natureza.\n" +
            "Patrick;admbot;17;ENG ELÉTRICA;1;1;5;Adoro cafuné, guerra de travesseiros e roubar o edredom durante a noite.\n" +
            "Henry;admbot;18;ENG COMPUTAÇÃO;2;1;2;Sou do tipo que ama uma boa comida, então vou pedir um iFood para o nosso jantar virtual.\n" +
            "Nicolas;admbot;23;ENG MECATRÔNICA;7;2;4;Não tenho COVID desde 1979\n" +
            "Kevin;admbot;25;BSI;5;2;4;Se online já sou tudo de bom, espere até nos encontrarmos pessoalmente.\n" +
            "Robert;admbot;26;ENG BIOMÉDICA;9;2;6;Queria alguém para maratonar séries comigo, topa!\n" +
            "Breno;admbot;21;ENG MECATRÔNICA;4;1;5;Agora que já demos match, você está convidada para o nosso casamento!\n" +
            "Marcelo;admbot;24;ENG PRODUÇÃO;5;3;4;Quem diria que uma deusa como você cometeria o deslize de conversar com um mortal como eu?\n" +
            "Thiago;admbot;25;JD;6;2;4;Oi. Só passei pra avisar que a gente tá namorando. Acho que você ainda não sabia\n" +
            "José;admbot;27;ENG MECÂNICA;9;1;2;Nunca acreditei em amor à primeira vista, mas, depois de te encontrar por aqui, acredito em amor ao primeiro match\n" +
            "Alexandre;admbot;20;ENG QUÍMICA;3;3;4;Gata, você é a prova de que Deus existe mesmo, porque uma criatura perfeita assim só pode ser criação divina!\n" +
            "Tomás;admbot;23;BSI;5;2;5;quer deletar o perfil deste aplicativo junto comigo? Acho que não precisamos mais dele...\n" +
            "Ricardo;admbot;25;ENG ELÉTRICA;7;5;6;A vida pode até não estar fácil para você, mas eu estou.\n" +
            "Fernando;admbot;19;ENG SOFTWARE;2;1;4;Estou procurando alguém com crédito para ligar e pedir uma pizza.\n" +
            "Lucas;admbot;24;BCS;6;5;6;Nossa... Acho que vou te denunciar aqui. Esses olhos não podem ser reais!\n" +
            "Gustavo;admbot;22;ENG QUÍMICA;5;2;3;Achei que esse aplicativo permitia apenas humanos, mas acho que estou enganado. Olha que anjo sem asas que acabo de encontrar!\n" +
            "Samuel;admbot;25;ENG MECATRÔNICA;8;2;5;Viajar, aventuras, esportes radicais também são uma parte vital de mim, mas eu gosto de lisonjeá-los e assisti-los em vez de praticar.\n" +
            "Igor;admbot;18;ENG CIVIL;2;3;4;Olá, se você está lendo este texto agora, saiba que eu quero tirá-la deste app. Me dê o seu melhor sorriso que eu o multiplicarei!\n" +
            "Jhonatan;admbot;26;ENG PRODUÇÃO;9;4;5;Busco afinidade, sintonia e a sinergia entre duas pessoas. Se isso faz sentido para você, continue.\n" +
            "Everton;admbot;21;ENG COMPUTAÇÃO;6;5;6;Adoro correr, conhecer novos lugares, um delicioso café descontraído com amigos.\n" +
            "Rafael;admbot;20;ENG CIVIL;4;3;6;Quero conhecer mulheres interessadas em algo mais sério e tranquilo.\n" +
            "André;admbot;23;ENG BIOMÉDICA;7;1;3;Um cara muito legal. Vamos dar risada porque a vida já é muito difícil!\n" +
            "George;admbot;18;ENG SOFTWARE;1;3;5;Pessoa simples, que gosta de curtir a vida, adora uma boa festa, viajar.\n" +
            "Luiz;admbot;18;BSI;1;4;6;Fiel à família e à vida. À procura de uma pessoa especial.\n" +
            "Fabrício;admbot;24;BSC;5;1;2;Gosto de coisas simples como bons momentos com amigos, um cinema ou um bom show.\n" +
            "Anderson;admbot;25;ENG BIOMÉDICA;9;2;4;Não tenho medo de me apaixonar. Adoro viver intensamente. O resto, fale-me você!\n" +
            "Paulo;admbot;22;BCC;6;1;5;Sou simples, tranquilo, amante da natureza. Solteiro, sem filhos.\n" +
            "Patrick;admbot;20;JD;4;3;5;Me tira do Tinder!!!\n" +
            "Robson;admbot;25;ENG MECÂNICA;8;2;5;Te conto no caminho...\n" +
            "Mateus;admbot;19;ENG PRODUÇÃO;2;5;6;Em busca de uma crush pra me acompanhar no casamento via Zoom do meu primo \n" +
            "Felipe;admbot;21;ENG QUÍMICA;5;2;4;Louco para arrumar uma companhia para fazer vídeos engraçados no TikTok comigo";


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