package com.utils;

import java.util.Random;

public class Palavras {

    private String[] palavras = new String[] {"CANUDOS","LAMARCKISMO","HISTOLOGIA","HEREDITARIEDADE","MECÂNICA","ÓPTICA","FASCISMO","ELETROVALENTE","ÍONS","ESTEQUIOMETRIA","ÓXIDO","ONU","PITÁGORAS","HIPOTENUSA", "HITLER", "PROPAROXÍTONA",
    											"MESÓCLISE","LAGOMORFOS","MONOTREMADOS","AMPÈRE","EXOESQUELETO","PREDICATIVO","SUBORDINAÇÃO","VERSALHES", "JANGO"
    											};

    private String[] dicas = new String[] {
    		"Confronto entre o Exército Brasileiro  e os integrantes de um movimento popular de fundo sócio-religioso ocorrido na Bahia, que durou de 1896 a 1897, liderado por Antônio Conselheiro. GUERRA DE _________",
    		"Teoria que explica a evolução dos seres vivos baseada em 2 principais conceitos : os seres vivos tendem a evoluírem para um nível de complexidade cada vez maior e um órgão, se utilizado, evolui, se não, atrofia.",
    		"É a ciência que estuda os tecidos biológicos, desde a sua formação(origem), estrutura e funcionamento.",
    		"Considerado pai da genética, Mendel impulsinou os estudos sobre ______________.",
    		"O som é um exemplo de onda ___________ que possui  intensidade e frequência. ",
    		"É o ramo da física que estuda os fenômenos relacionados à luz. Explica os fenômenos da reflexão, refração e difração.",
    		"Sistema político, econômico e social conhecido por características como totalismo, nacionalismo, anti-socialismo, violência contra minorias, forte propaganda, militarismo, censura, entre outras.",
    		"Tipo de ligação onde um átomo cede e outro recebe definitivamente um ou mais elétrons.",
    		"Átomos que adquirem ou cedem cargas elétricas.",
    		"É o cálculo que permite relacionar quantidades de reagentes e produtos, que participam de uma reação química com o auxílio das equações químicas correspondentes.",
    		"É um composto químico binário formado por átomos de oxigênio com outro elemento em que o oxigênio é o mais eletronegativo.",
    		"Organização internacional cujo objetivo declarado é facilitar a cooperação em matéria de direito internacional, segurança internacional, desenvolvimento econômico, progresso social, direitos humanos e a realização da paz mundial.",
    		"a²=b²+c², essa equação também é conhecida como teorema de ________________",
    		"Lado de um triângulo que fica oposto ao ângulo reto.",
    		"Líder do fascimo alemão.",
    		"Classificação das palavras em que a antepenúltima sílaba é a tônica.",
    		"Dar-te-ei e Falar-vos-ei são exemplos de ____________ .",
    		"Os coelhos são representante da ordem dos_____________.",
    		"A équidna e o ornitorrinco são representantes da ordem dos_________________.",
    		"Unidade de medida da corrente elétrica.",
    		"Estrutura presente nos insetos, que serve para proteção dos órgãos internos, locomoção e que é trocado devido ao crescimento do animal.",
    		"Elemento do predicado que se refere ao sujeito, completando o verbo de ligação.",
    		"Período composto por _________________ é onde há uma relação de dependência entre a primeira oração para com a segunda.",
    		"Tratado de paz assinado pelas potências europeias que encerrou oficialmente a Primeira Guerra Mundial.",
    		"Como também era conhecido o ex-Presidente do Brasil João Goulart."
    		
    		
    		
    		};
    int z;
    
    public Palavras() {
    }

    public String sorteio() {
    	int x = (int)(random()*palavras.length);
        String palavraSorteada = palavras[x];
        z=x;

        return palavraSorteada;
    }
    
    public String dica(){
    	String dicaSorteada = dicas[z];
    	return dicaSorteada;
    	
    }

    public static double random() {
        Random r = new Random();

        return r.nextDouble();
    }
}