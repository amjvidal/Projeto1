package P2;
import java.util.Scanner;
public class interactiveStory {

//Criando uma função para dar print e não ficar muito poluido de System.out.println no codigo
public static void printString(String a) {
        System.out.println(a);
}

    public static void main(String[] args) {
        String cap1 = "\nEra uma vez uma mulher misteriosa chamada Sofia.\n "+
                            "Ela vivia em uma cidade ensolarada beira-mar, onde as ondas "+
                            "quebravam suavemente na areia.\n Sofia era conhecida por sua voz "+
                            "encantadora e melancolica, e todas as noites ela se apresentava em "+
                            "um pub local,\n onde sua musica ecoava pelas paredes.\n "+
                            "\nFoi em uma dessas noites que Sofia conheceu um homem "+
                            "intrigante chamado Adam.\n Enquanto Sofia cantava suas melodias "+
                            "envolventes, Adam estava lá,\n perdido em suas letras profundas e"+
                            " na beleza de sua voz."+
                            "\nDurante uma pausa na apresentação de Sofia, Adam se "+
                            "aproxima dela no bar do pub à beira-mar.\n Ele olha para ela com "+
                            "admiração e um toque de nervosismo,\n antes de finalmente reunir coragem para falar:\n"+
                            "\nAdam:\n Ei, Sofia! Desculpe interromper seu momento, "+
                            "mas sua música tocou profundamente em mim.\n Sua voz é simplesmente incrível.\n"+
                            "\nSofia sorri, agradecida pelo elogio, mas também cautelosa."+
                            "\nSofia:\n Obrigada, Adam. Fico feliz em saber que você "+
                            "aprecia minha música.\n"+
                            "\nAdam:\n Você sabe, eu adoraria poder conversar com "+
                            "você mais depois da sua apresentação. Eu gostaria de conhecê-la melhor.\n"+
                            "\nSofia olha para ele, sua expressão revelando uma mistura de emoções.\n";
        String pergunta1 = "Qual a sua escolha? Sofia deve ter ou n\u00E3o o encontro com Adam?\n";
        String final1 = "\nSofia, sentindo-se insegura e não pronta para"+
                        " se envolver emocionalmente,\n educadamente recusa o pedido de"+
                        " Adam. Embora Adam fique desapontado, \nele respeita a decisão"+
                        " de Sofia e a admira ainda mais por sua honestidade.\n"+
                        "\nEnquanto Sofia continua a cantar no palco, os tons de frieza"+
                        " que ecoam diante da música\n cantada por ela envolvem Adam,"+
                        " que embora triste,\ndeixa o pub com a esperança de que "+
                        "seus caminhos possam se cruzar novamente no futuro.";
        String cap2 ="\nAdam ficou extremamente feliz por sofia ter aceitado seu convite."+
                        "\n \n Sofia e Adam passam o número um do outro para"+
                        " que possam conversar por mensagens mais tarde naquele mesmo dia.\n"+
                        "\nAdam:\n Sofia, estou feliz que você tenha concordado"+
                        " em ter esse encontro comigo. Eu estava ansioso para passar mais "+
                        "tempo com você.\n Que tal irmos ao Mariner's Bistro & Lounge? A comida"+
                        " é incrível, e tenho certeza de que você irá adorar o ambiente.\n"+
                        "\nSofia: sorri suavemente\n Isso parece maravilhoso. "+
                        "Adoro a ideia de um jantar à beira-mar. Parece o cenário perfeito"+
                        " para nos conhecermos melhor\n"+
                        "\nAdam: empolgado\n Ótimo!\n"+
                        "\nNo dia seguinte, Sofia e Adam se encontram em um "+
                        "aconchegante restaurante à beira-mar.\n O clima é descontraído "+
                        "e a conversa flui naturalmente. Durante o jantar, eles compartilham"+
                        " histórias engraçadas e risadas contagiantes.\n A química entre "+
                        "eles é palpável, e ambos estão se divertindo.\n Enquanto saboreiam a"+
                        " sobremesa, uma pausa ocorre na conversa, e é nesse momento que"+
                        " Sofia decide abrir o coração:\n";

        String pergunta2 ="\nSofia:\n Adam, estou realmente gostando de passar esse"+
                        " tempo com você.\n Sinto que temos uma conexão especial. \nMas também "+
                        "tenho medo de me machucar novamente.\n O que você procura em um "+
                        "relacionamento? O que você espera de nós?\n"+
                        "\n A escolha que você fizer determinará a direção do relacionamento entre os dois.\n";
        String final2 ="\nAdam:\n Sofia, desde o momento em que nos "+
                        "conhecemos, senti algo especial entre nos.\n Eu tambem estou "+
                        "gostando de passar esse tempo com voce.\n No entanto, entendo "+
                        "seus medos e quero que saiba que estou disposto a construir "+
                        "algo significativo.\n Estou buscando um relacionamento honesto e "+
                        "comprometido, e acho que temos potencial para isso. \nVamos "+
                        "levar as coisas devagar, respeitando o tempo um do outro e "+
                        "permitindo que nosso amor cresça naturalmente."
                        +"\nSofia se sente encorajada e emocionada com a "+
                        "resposta positiva de Adam. \nEla vê nele um parceiro em potencial, "+
                        "alguem disposto a investir tempo e esforço para construir"+
                        " um relacionamento significativo. \nAmbos concordam em levar "+
                        "as coisas devagar, respeitando o tempo um do outro. \nConforme "+
                        "o tempo passa, eles continuam a se conhecer, \nexplorando suas "+
                        "afinidades, compartilhando momentos de alegria e superando"+
                        " desafios juntos. \nO relacionamento deles se desenvolve em "+
                        "uma conexão profunda e amorosa, repleta de compreensão, "+
                        "apoio mútuo e crescimento pessoal. \nSofia e Adam constroem "+
                        "uma vida juntos, enfrentando as adversidades de mãos dadas "+
                        "e encontrando alegria nas pequenas coisas. \nEles criam memórias "+
                        "duradouras e vivem uma história de amor cheia de felicidade e realizações";
        String final3 = "\nAdam:\n Sofia, também estou apreciando muito "+
                        "a nossa companhia, mas confesso que estou um pouco incerto"+
                        " sobre o futuro. \nAcho que temos uma conexão especial, mas"+
                        " não quero apressar as coisas. \nVamos continuar aproveitando"+
                        " esses momentos juntos e ver onde eles nos levam."+
                        "\nApesar de Sofia esperar uma resposta mais encorajadora,"+
                        " \nela entende a cautela de Adam e decide respeitar suas palavras."+
                        " \nEles continuam a sair e se conhecer, mas as incertezas e os receios"+
                        " permanecem presentes em seu relacionamento. \nA falta de clareza "+
                        "sobre o futuro e a falta de comprometimento podem criar tensões e"+
                        " inseguranças entre eles. \nO relacionamento se torna um desafio"+
                        " constante, com momentos de proximidade e momentos de distância"+
                        " emocional. \nSofia e Adam lutam para encontrar uma harmonia entre"+
                        " suas expectativas e desejos pessoais. \nÀ medida que o tempo passa,"+
                        " eles podem perceber que as diferenças fundamentais são difíceis de"+
                        " superar, \nresultando em um relacionamento instável e eventualmente "+
                        "levando a uma separação dolorosa.";
            // CRIAÇÃO DOS ARRAYS DAS RESPOSTAS E DAS ESCOLHAS
            String[] respostas1 = new String[2];
            respostas1[0] = "nao";
            respostas1[1] = "sim";
            String[] respostas2 = new String[2];
            respostas2[0] = "escolha positiva";
            respostas2[1] = "escolha incerta";
            String[] escolhas1 = new String[2];
            escolhas1[0] = "\n - Digite Sim para terem o encontro.\n";
            escolhas1[1] = "\n - Digite Nao para NÂO terem o encontro.\n";
            String[] escolhas2 = new String[2];
            escolhas2[0] = "\n - Digite ESCOLHA POSITIVA para uma resposta positiva e encorajadora\n";
            escolhas2[1] = "\n - Digite ESCOLHA INCERTA para uma resposta mais cautelosa e incerta.\n";
        // DECLARAÇÃO DOS PERSONAGENS E CAPITULOS
        personagem  Sofia = new personagem("Sofia", 100);
        personagem  Adam = new personagem("Adam", 50);
        capitulo capitulo1 = new capitulo(cap1, pergunta1, escolhas1,
         respostas1, Adam, Sofia, 0, 0);
        capitulo fim1 = new capitulo(final1,"",null,
         null,  Sofia, Adam, 0,-50);
        capitulo capitulo2 = new capitulo(cap2, pergunta2,escolhas2,
         respostas2, Sofia, Adam,0,0);
        capitulo fim2 = new capitulo(final2, "",null,
        null,Sofia, Adam, 100,100);
        capitulo fim3 = new capitulo(final3, "",null,
        null, Sofia, Adam, -50,-100);
        boolean amor = true;
        //INTRODUÇÂO
        Scanner scanner = new Scanner(System.in);
        printString("Shades of Charm, Maybe a happy story. \n");
        capitulo1.mostrar();
        // 1° ESCOLHA
        int contador = 0;
        while(contador == 0 && amor == true){

            int n1 = capitulo1.escolher( respostas1);
            
            if(n1 == 0){
                // 1. FINAL - A Recusa de Sofia
                
                fim1.mostrar();
                contador++;
            }
            else if(n1 == 1){ 
                    //cap2
                    capitulo2.mostrar();
               
                    int contador2 = 0;
                    while(contador2==0 && amor == true){
                    int n2 = capitulo2.escolher( respostas2);
                    if (n2 == 0){
                        //2. FINAL - O Encontro Promissor:
                       
                        fim2.mostrar();

                        contador++;
                        contador2++;
                    }
                    else if(n2 == 1){
                        //3. FINAL - O Relacionamento Complicado:
                        
                        
                        fim3.mostrar();
                        contador++;
                        contador2++;                    
                    }
                    else{
                        printString("Resposta Incorreta, Por favor responda novamente!");
                    }
                }
            }
            else{
                printString("Resposta Incorreta, Por favor responda novamente.");
            }
        }
scanner.close();
}
}