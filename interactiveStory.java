package P2;
import java.util.Scanner;
public class interactiveStory {

//Criando uma função para dar print e não ficar muito poluido de System.out.println no codigo
public static void printString(String a) {
        System.out.println(a);
}

    public static void main(String[] args) {
        //INTRODUÇÂO
        Scanner scanner = new Scanner(System.in);
        printString("Shades of charm, Maybe a happy story. ");
        printString("Era uma vez uma mulher misteriosa chamada Sofia. "+
        "Ela vivia em uma cidade ensolarada beira-mar, onde as ondas "+
        "quebravam suavemente na areia. Sofia era conhecida por sua voz "+
        "encantadora e melancolica, e todas as noites ela se apresentava em "+
        "um pub local, onde sua musica ecoava pelas paredes.");
        printString("Foi em uma dessas noites que Sofia conheceu um homem "+
        "intrigante chamado Adam. Enquanto Sofia cantava suas melodias "+
        "envolventes, Adam estava lá, perdido em suas letras profundas e"+
        " na beleza de sua voz.");
        printString("Durante uma pausa na apresentação de Sofia, Adam se "+
        "aproxima dela no bar do pub à beira-mar. Ele olha para ela com "+
        "admiração e um toque de nervosismo, antes de finalmente reunir coragem para falar:");
        printString("Adam:\n Ei, Sofia! Desculpe interromper seu momento, "+
        "mas sua música tocou profundamente em mim. Sua voz é simplesmente incrível.");
        printString("Sofia sorri, agradecida pelo elogio, mas também cautelosa.");
        printString("Sofia:\n Obrigada, Adam. Fico feliz em saber que você "+
        "aprecia minha música.");
        printString("Adam:\n Você sabe, eu adoraria poder conversar com "+
        "você mais depois da sua apresentação. Eu gostaria de conhecê-la melhor.");
        printString("Sofia olha para ele, sua expressão revelando uma mistura de emoções.");
        // 1° ESCOLHA
        int contador = 0;
        while(contador == 0){
            printString("Digite SIM para terem o encontro e NÃO para eles não terem o Encontro.");
            String resposta1 = scanner.nextLine();
            String recusa = "nao";
            String aceita = "sim";
            if(resposta1.equalsIgnoreCase(recusa)){
                printString("Sofia, sentindo-se insegura e não pronta para"+
                " se envolver emocionalmente, educadamente recusa o pedido de"+
                " Adam. Embora Adam fique desapontado, ele respeita a decisão"+
                " de Sofia e a admira ainda mais por sua honestidade. "+
                "Enquanto Sofia continua a cantar no palco, os tons de frieza"+
                " que ecoam diante da música cantada por ela envolvem Adam,"+
                " que embora triste, deixa o pub com a esperança de que "+
                "seus caminhos possam se cruzar novamente no futuro.");
                contador++;
            }
            else if(resposta1.equalsIgnoreCase(aceita)){
                printString("Sofia e Adam passam o número um do outro para que possam conversar por mensagens mais tarde naquele mesmo dia.");
                printString("Adam:\n Sofia, estou feliz que você tenha concordado em ter esse encontro comigo. Eu estava ansioso para passar mais tempo com você. Que tal irmos ao Mariner's Bistro & Lounge? A comida é incrível, e tenho certeza de que você irá adorar o ambiente.");
                printString("Sofia: sorri suavemente\n Isso parece maravilhoso. Adoro a ideia de um jantar à beira-mar. Parece o cenário perfeito para nos conhecermos melhor");
                printString("Adam: empolgado\n Ótimo!");
                printString("No dia seguinte, Sofia e Adam se encontram em um aconchegante restaurante à beira-mar. O clima é descontraído e a conversa flui naturalmente. Durante o jantar, eles compartilham histórias engraçadas e risadas contagiantes. A química entre eles é palpável, e ambos estão se divertindo. Enquanto saboreiam a sobremesa, uma pausa ocorre na conversa, e é nesse momento que Sofia decide abrir o coração:");
                printString("Sofia:\n Adam, estou realmente gostando de passar esse tempo com você. Sinto que temos uma conexão especial. Mas também tenho medo de me machucar novamente. O que você procura em um relacionamento? O que você espera de nós?");
                    int contador2 = 0;
                    while(contador2==0){
                    printString("Agora é a sua vez de escolher a resposta de Adam. Digite 2 para uma resposta positiva e encorajadora, ou 2 para uma resposta mais cautelosa e incerta. A escolha que você fizer determinará a direção do relacionamento entre os dois.");
                    int resposta2 = scanner.nextInt();
                    if (resposta2 == 1){
                        printString("Adam:\n Sofia, desde o momento em que nos conhecemos, senti algo especial entre nos. Eu tambem estou gostando de passar esse tempo com voce. No entanto, entendo seus medos e quero que saiba que estou disposto a construir algo significativo. Estou buscando um relacionamento honesto e comprometido, e acho que temos potencial para isso. Vamos levar as coisas devagar, respeitando o tempo um do outro e permitindo que nosso amor cresça naturalmente.");
                        printString("Sofia se sente encorajada e emocionada com a resposta positiva de Adam. Ela vê nele um parceiro em potencial, alguem disposto a investir tempo e esforço para construir um relacionamento significativo. Ambos concordam em levar as coisas devagar, respeitando o tempo um do outro. Conforme o tempo passa, eles continuam a se conhecer, explorando suas afinidades, compartilhando momentos de alegria e superando desafios juntos. O relacionamento deles se desenvolve em uma conexão profunda e amorosa, repleta de compreensão, apoio mútuo e crescimento pessoal. Sofia e Adam constroem uma vida juntos, enfrentando as adversidades de mãos dadas e encontrando alegria nas pequenas coisas. Eles criam memórias duradouras e vivem uma história de amor cheia de felicidade e realizações");
                        contador++;
                        contador2++;
                    }
                    else if(resposta2== 2){
                        printString(" Adam:\n Sofia, também estou apreciando muito a nossa companhia, mas confesso que estou um pouco incerto sobre o futuro. Acho que temos uma conexão especial, mas não quero apressar as coisas. Vamos continuar aproveitando esses momentos juntos e ver onde eles nos levam.");
                        printString("Apesar de Sofia esperar uma resposta mais encorajadora, ela entende a cautela de Adam e decide respeitar suas palavras. Eles continuam a sair e se conhecer, mas as incertezas e os receios permanecem presentes em seu relacionamento. A falta de clareza sobre o futuro e a falta de comprometimento podem criar tensões e inseguranças entre eles. O relacionamento se torna um desafio constante, com momentos de proximidade e momentos de distância emocional. Sofia e Adam lutam para encontrar uma harmonia entre suas expectativas e desejos pessoais. À medida que o tempo passa, eles podem perceber que as diferenças fundamentais são difíceis de superar, resultando em um relacionamento instável e eventualmente levando a uma separação dolorosa.");
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




}
}