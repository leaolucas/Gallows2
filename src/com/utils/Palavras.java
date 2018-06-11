package com.utils;

import java.util.Random;

public class Palavras {

    private String[] palavras = new String[] {"CANUDOS","LAMARCKISMO","HISTOLOGIA","HEREDITARIEDADE","MEC�NICA","�PTICA","FASCISMO","ELETROVALENTE","�ONS","ESTEQUIOMETRIA","�XIDO","ONU","PIT�GORAS","HIPOTENUSA", "HITLER", "PROPAROX�TONA",
    											"MES�CLISE","LAGOMORFOS","MONOTREMADOS","AMP�RE","EXOESQUELETO","PREDICATIVO","SUBORDINA��O","VERSALHES", "JANGO"
    											};

    private String[] dicas = new String[] {
    		"Confronto entre o Ex�rcito Brasileiro  e os integrantes de um movimento popular de fundo s�cio-religioso ocorrido na Bahia, que durou de 1896 a 1897, liderado por Ant�nio Conselheiro. GUERRA DE _________",
    		"Teoria que explica a evolu��o dos seres vivos baseada em 2 principais conceitos : os seres vivos tendem a evolu�rem para um n�vel de complexidade cada vez maior e um �rg�o, se utilizado, evolui, se n�o, atrofia.",
    		"� a ci�ncia que estuda os tecidos biol�gicos, desde a sua forma��o(origem), estrutura e funcionamento.",
    		"Considerado pai da gen�tica, Mendel impulsinou os estudos sobre ______________.",
    		"O som � um exemplo de onda ___________ que possui  intensidade e frequ�ncia. ",
    		"� o ramo da f�sica que estuda os fen�menos relacionados � luz. Explica os fen�menos da reflex�o, refra��o e difra��o.",
    		"Sistema pol�tico, econ�mico e social conhecido por caracter�sticas como totalismo, nacionalismo, anti-socialismo, viol�ncia contra minorias, forte propaganda, militarismo, censura, entre outras.",
    		"Tipo de liga��o onde um �tomo cede e outro recebe definitivamente um ou mais el�trons.",
    		"�tomos que adquirem ou cedem cargas el�tricas.",
    		"� o c�lculo que permite relacionar quantidades de reagentes e produtos, que participam de uma rea��o qu�mica com o aux�lio das equa��es qu�micas correspondentes.",
    		"� um composto qu�mico bin�rio formado por �tomos de oxig�nio com outro elemento em que o oxig�nio � o mais eletronegativo.",
    		"Organiza��o internacional cujo objetivo declarado � facilitar a coopera��o em mat�ria de direito internacional, seguran�a internacional, desenvolvimento econ�mico, progresso social, direitos humanos e a realiza��o da paz mundial.",
    		"a�=b�+c�, essa equa��o tamb�m � conhecida como teorema de ________________",
    		"Lado de um tri�ngulo que fica oposto ao �ngulo reto.",
    		"L�der do fascimo alem�o.",
    		"Classifica��o das palavras em que a antepen�ltima s�laba � a t�nica.",
    		"Dar-te-ei e Falar-vos-ei s�o exemplos de ____________ .",
    		"Os coelhos s�o representante da ordem dos_____________.",
    		"A �quidna e o ornitorrinco s�o representantes da ordem dos_________________.",
    		"Unidade de medida da corrente el�trica.",
    		"Estrutura presente nos insetos, que serve para prote��o dos �rg�os internos, locomo��o e que � trocado devido ao crescimento do animal.",
    		"Elemento do predicado que se refere ao sujeito, completando o verbo de liga��o.",
    		"Per�odo composto por _________________ � onde h� uma rela��o de depend�ncia entre a primeira ora��o para com a segunda.",
    		"Tratado de paz assinado pelas pot�ncias europeias que encerrou oficialmente a Primeira Guerra Mundial.",
    		"Como tamb�m era conhecido o ex-Presidente do Brasil Jo�o Goulart."
    		
    		
    		
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