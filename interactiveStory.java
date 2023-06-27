package P2;
import java.util.Scanner;
public class interactiveStory {

//Criando uma função para dar print e não ficar muito poluido de System.out.println no codigo
public static void printString(String a) {
        System.out.println(a);
}

    public static void main(String[] args) {
       
        personagem  Sofia = new personagem("Sofia", 100);
        personagem  Adam = new personagem("Adam", 50);
        boolean amor = true;
        //INTRODUÇÂO
        Scanner scanner = new Scanner(System.in);
        printString("Shades of Charm, Maybe a happy story. \n");
        printString("Era uma vez uma mulher misteriosa chamada Sofia.\n "+
        "Ela vivia em uma cidade ensolarada beira-mar, onde as ondas "+
        "quebravam suavemente na areia.\n Sofia era conhecida por sua voz "+
        "encantadora e melancolica, e todas as noites ela se apresentava em "+
        "um pub local,\n onde sua musica ecoava pelas paredes.");
        printString("Foi em uma dessas noites que Sofia conheceu um homem "+
        "intrigante chamado Adam.\n Enquanto Sofia cantava suas melodias "+
        "envolventes, Adam estava lá,\n perdido em suas letras profundas e"+
        " na beleza de sua voz.");
        printString("Durante uma pausa na apresentação de Sofia, Adam se "+
        "aproxima dela no bar do pub à beira-mar.\n Ele olha para ela com "+
        "admiração e um toque de nervosismo,\n antes de finalmente reunir coragem para falar:\n");
        printString("Adam:\n Ei, Sofia! Desculpe interromper seu momento, "+
        "mas sua música tocou profundamente em mim.\n Sua voz é simplesmente incrível.\n");
        printString("Sofia sorri, agradecida pelo elogio, mas também cautelosa.");
        printString("Sofia:\n Obrigada, Adam. Fico feliz em saber que você "+
        "aprecia minha música.\n");
        printString("Adam:\n Você sabe, eu adoraria poder conversar com "+
        "você mais depois da sua apresentação. Eu gostaria de conhecê-la melhor.");
        printString("Sofia olha para ele, sua expressão revelando uma mistura de emoções.\n");
        // 1° ESCOLHA
        int contador = 0;
        while(contador == 0 && amor == true){
            printString("Qual a sua escolha? Sofia deve ter ou não o encontro com Adam?\n");
            printString(" - Digite Sim para terem o encontro.\n");
            printString(" - Digite Nao para terem o encontro.");
            printString("");
            String resposta1 = scanner.nextLine();
            String recusa = "nao";
            String aceita = "sim";
            
            if(resposta1.equalsIgnoreCase(recusa)){
                // 1. FINAL - A Recusa de Sofia
                
                printString("Sofia, sentindo-se insegura e não pronta para"+
                " se envolver emocionalmente,\n educadamente recusa o pedido de"+
                " Adam. Embora Adam fique desapontado, \nele respeita a decisão"+
                " de Sofia e a admira ainda mais por sua honestidade.\n"+
                "Enquanto Sofia continua a cantar no palco, os tons de frieza"+
                " que ecoam diante da música\n cantada por ela envolvem Adam,"+
                " que embora triste,\ndeixa o pub com a esperança de que "+
                "seus caminhos possam se cruzar novamente no futuro.");
                Sofia.mudapaixao(10);
                printString("");
                Adam.mudapaixao(-50);
                printString("");
                contador++;
            }
            else if(resposta1.equalsIgnoreCase(aceita)){ 
                printString("");
                Sofia.mudapaixao(0);
                printString("");
                Adam.mudapaixao(50);
                printString("Adam ficou extremamente feliz por sofia ter aceitado seu convite.");
                printString("\n \n Sofia e Adam passam o número um do outro para"+
                " que possam conversar por mensagens mais tarde naquele mesmo dia.\n");
                printString("Adam:\n Sofia, estou feliz que você tenha concordado"+
                " em ter esse encontro comigo. Eu estava ansioso para passar mais "+
                "tempo com você.\n Que tal irmos ao Mariner's Bistro & Lounge? A comida"+
                " é incrível, e tenho certeza de que você irá adorar o ambiente.\n");
                printString("Sofia: sorri suavemente\n Isso parece maravilhoso. "+
                "Adoro a ideia de um jantar à beira-mar. Parece o cenário perfeito"+
                " para nos conhecermos melhor\n");
                printString("Adam: empolgado\n Ótimo!\n");
                printString("No dia seguinte, Sofia e Adam se encontram em um "+
                "aconchegante restaurante à beira-mar.\n O clima é descontraído "+
                "e a conversa flui naturalmente. Durante o jantar, eles compartilham"+
                " histórias engraçadas e risadas contagiantes.\n A química entre "+
                "eles é palpável, e ambos estão se divertindo.\n Enquanto saboreiam a"+
                " sobremesa, uma pausa ocorre na conversa, e é nesse momento que"+
                " Sofia decide abrir o coração:\n");
                printString("Sofia:\n Adam, estou realmente gostando de passar esse"+
                " tempo com você.\n Sinto que temos uma conexão especial. \nMas também "+
                "tenho medo de me machucar novamente.\n O que você procura em um "+
                "relacionamento? O que você espera de nós?");
                    int contador2 = 0;
                    while(contador2==0 && amor == true){
                    printString(" A escolha que você "+
                    "fizer determinará a direção do relacionamento entre os dois.\n"+
                    " - Digite 1 para uma resposta positiva e encorajadora\n"+" - Digite 2 para"+
                    " uma resposta mais cautelosa e incerta.\n");
                    int resposta2 = scanner.nextInt();
                    if (resposta2 == 1){
                        //2. FINAL - O Encontro Promissor:
                       
                        printString("Adam:\n Sofia, desde o momento em que nos "+
                        "conhecemos, senti algo especial entre nos.\n Eu tambem estou "+
                        "gostando de passar esse tempo com voce.\n No entanto, entendo "+
                        "seus medos e quero que saiba que estou disposto a construir "+
                        "algo significativo.\n Estou buscando um relacionamento honesto e "+
                        "comprometido, e acho que temos potencial para isso. \nVamos "+
                        "levar as coisas devagar, respeitando o tempo um do outro e "+
                        "permitindo que nosso amor cresça naturalmente.");
                        printString("Sofia se sente encorajada e emocionada com a "+
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
                        "duradouras e vivem uma história de amor cheia de felicidade e realizações"); 
                        printString("");
                        Sofia.mudapaixao(100);
                        printString("");
                        Adam.mudapaixao(100);
                        contador++;
                        contador2++;
                    }
                    else if(resposta2== 2){
                        //3. FINAL - O Relacionamento Complicado:
                        
                        printString(" Adam:\n Sofia, também estou apreciando muito "+
                        "a nossa companhia, mas confesso que estou um pouco incerto"+
                        " sobre o futuro. \nAcho que temos uma conexão especial, mas"+
                        " não quero apressar as coisas. \nVamos continuar aproveitando"+
                        " esses momentos juntos e ver onde eles nos levam.");
                        printString("Apesar de Sofia esperar uma resposta mais encorajadora,"+
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
                        "levando a uma separação dolorosa.");
                        printString("");
                        Sofia.mudapaixao(-50);
                        printString("Sofia teve momentos ruins em sua vida e seus pontos de"+
                        " paixao diminuiram.");
                        Adam.mudapaixao(-100);
                        printString("");
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