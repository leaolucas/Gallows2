package com.Gallows;

import com.utils.Palavras;
import com.utils.Replace;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends Activity implements OnClickListener {

    TextView tvPalavra;
    ImageView forca;
    Button bA, bB, bC, bD, bE, bF, bG, bH, bI, bJ, bK, bL, bM,
           bN, bO, bP, bQ, bR, bS, bT, bU, bV, bW, bX, bY, bZ, bDica;

    Palavras palavras = new Palavras();

    private String palavraSecreta, tracos, tipoJogo, dicas2;
    private int nTentativas,verificador;
    private char letra;
    

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        tipoJogo = getIntent().getExtras().getString("tipo");

        iniciarObjetos();
        iniciarJogo();
    }

    public void onClick(View v) {
        verificarClick(v);

        boolean acerto = verificarAcerto();

        if (!acerto) {
            nTentativas--;
            switch (nTentativas) {
            case 5:
                forca.setImageResource(R.drawable.forca_5);
                break;
            case 4:
                forca.setImageResource(R.drawable.forca_4);
                break;
            case 3:
                forca.setImageResource(R.drawable.forca_3);
                break;
            case 2:
                forca.setImageResource(R.drawable.forca_2);
                break;
            case 1:
                forca.setImageResource(R.drawable.forca_1);
                break;
            case 0:
                forca.setImageResource(R.drawable.forca_0);
                desabilitarBotoes();
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
                dialogBuilder.setTitle("Perdeu!")
                .setMessage("Deseja jogar novamente?")
                .setCancelable(false)
                .setPositiveButton("Sim", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        iniciarJogo();
                    }
                })
                .setNegativeButton("N�o", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        finish();
                    }
                })
                .create().show();
            }
        }

        if (Replace.replaceAll(tracos, " ", "").equalsIgnoreCase(palavraSecreta)) {
            desabilitarBotoes();
            AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
            dialogBuilder.setTitle("Parab�ns!")
            .setMessage("Deseja jogar novamente?")
            .setCancelable(false)
            .setPositiveButton("Sim", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface arg0, int arg1) {
                    iniciarJogo();
                }
            })
            .setNegativeButton("N�o", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface arg0, int arg1) {
                    finish();
                }
            })
            .create().show();
        }
    }

    private void verificarClick(View v) {
        switch (v.getId()) {
        case R.id.bA:
            bA.setEnabled(false); letra = 'A'; break;
        case R.id.bB:
            bB.setEnabled(false); letra = 'B'; break;
        case R.id.bC:
            bC.setEnabled(false); letra = 'C'; break;
        case R.id.bD:
            bD.setEnabled(false); letra = 'D'; break;
        case R.id.bE:
            bE.setEnabled(false); letra = 'E'; break;
        case R.id.bF:
            bF.setEnabled(false); letra = 'F'; break;
        case R.id.bG:
            bG.setEnabled(false); letra = 'G'; break;
        case R.id.bH:
            bH.setEnabled(false); letra = 'H'; break;
        case R.id.bI:
            bI.setEnabled(false); letra = 'I'; break;
        case R.id.bJ:
            bJ.setEnabled(false); letra = 'J'; break;
        case R.id.bK:
            bK.setEnabled(false); letra = 'K'; break;
        case R.id.bL:
            bL.setEnabled(false); letra = 'L'; break;
        case R.id.bM:
            bM.setEnabled(false); letra = 'M'; break;
        case R.id.bN:
            bN.setEnabled(false); letra = 'N'; break;
        case R.id.bO:
            bO.setEnabled(false); letra = 'O'; break;
        case R.id.bP:
            bP.setEnabled(false); letra = 'P'; break;
        case R.id.bQ:
            bQ.setEnabled(false); letra = 'Q'; break;
        case R.id.bR:
            bR.setEnabled(false); letra = 'R'; break;
        case R.id.bS:
            bS.setEnabled(false); letra = 'S'; break;
        case R.id.bT:
            bT.setEnabled(false); letra = 'T'; break;
        case R.id.bU:
            bU.setEnabled(false); letra = 'U'; break;
        case R.id.bV:
            bV.setEnabled(false); letra = 'V'; break;
        case R.id.bW:
            bW.setEnabled(false); letra = 'W'; break;
        case R.id.bX:
            bX.setEnabled(false); letra = 'X'; break;
        case R.id.bY:
            bY.setEnabled(false); letra = 'Y'; break;
        case R.id.bZ:
            bZ.setEnabled(false); letra = 'Z'; break;
        case R.id.bDica:
        	letra = '1';
        	dicas2= palavras.dica();
            AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
            dialogBuilder.setTitle("Dica").setMessage(dicas2).setCancelable(false)
            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface arg0, int arg1) {
                	bDica.setEnabled(true);
                }
            });
            
            
            
            AlertDialog alertDialog = dialogBuilder.create();
			alertDialog.show();
            
            break;
        }
    }

    private boolean verificarAcerto() {
        boolean acerto = false;
        for (int x = 0; x < palavraSecreta.length(); x++) {
            char tmp = ' ';
            char vogal = palavraSecreta.charAt(x);
            if (vogal == '�') tmp = 'A';
            if (vogal == '�') tmp = 'A';
            if (vogal == '�') tmp = 'A';
            if (vogal == '�') tmp = 'A';
            if (vogal == '�') tmp = 'E';
            if (vogal == '�') tmp = 'I';
            if (vogal == '�') tmp = 'O';
            if (vogal == '�') tmp = 'O';
            if (vogal == '�') tmp = 'O';
            if (vogal == '�') tmp = 'U';
            if (vogal == '�') tmp = 'C';
            if (vogal == letra || tmp == letra) {
                tracos = tracos.substring(0, 3 * x + 1) + vogal + tracos.substring(3 * x + 2);
                acerto = true;
            }
        }
        tvPalavra.setText(tracos);

        return acerto;
    }

    public void iniciarJogo() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        if (tipoJogo.equals("jogador1")) {
            palavraSecreta = palavras.sorteio();
            
            procedimentosInicio();
        } else {
            final EditText input = new EditText(this);
            dialogBuilder.setTitle("Palavra Secreta")
            .setMessage("Digite uma palavra para seu advers�rio.")
            .setView(input)
            .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface arg0, int arg1) {
                    palavraSecreta = input.getText().toString().toUpperCase();
                    verificador = 1;
                    procedimentosInicio();
                } 
            })
            .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface arg0, int arg1) {
                    finish();
                }
            })
            .create().show();
        }
    }

    private void procedimentosInicio() {
        nTentativas = 6;
        tracos = "";
        letra = ' ';
        for (int x = 0; x < palavraSecreta.length(); x++) {
            if (palavraSecreta.charAt(x) == '-') {
                tracos += " - ";
            } else if (palavraSecreta.charAt(x) == ' ') {
                tracos += "   ";
            } else {
                tracos += " _ ";
            }
        }

        habilitarBotoes();
        tvPalavra.setText(tracos);
        forca.setImageResource(R.drawable.forca_6);
    }

    private void habilitarBotoes() {
        bA.setEnabled(true);
        bB.setEnabled(true);
        bC.setEnabled(true);
        bD.setEnabled(true);
        bE.setEnabled(true);
        bF.setEnabled(true);
        bG.setEnabled(true);
        bH.setEnabled(true);
        bI.setEnabled(true);
        bJ.setEnabled(true);
        bK.setEnabled(true);
        bL.setEnabled(true);
        bM.setEnabled(true);
        bN.setEnabled(true);
        bO.setEnabled(true);
        bP.setEnabled(true);
        bQ.setEnabled(true);
        bR.setEnabled(true);
        bS.setEnabled(true);
        bT.setEnabled(true);
        bU.setEnabled(true);
        bV.setEnabled(true);
        bW.setEnabled(true);
        bX.setEnabled(true);
        bY.setEnabled(true);
        bZ.setEnabled(true);
        if(verificador!=1){
        	bDica.setEnabled(true);
        }
        else{
        	bDica.setEnabled(false);
        }
    }

    private void desabilitarBotoes() {
        bA.setEnabled(false);
        bB.setEnabled(false);
        bC.setEnabled(false);
        bD.setEnabled(false);
        bE.setEnabled(false);
        bF.setEnabled(false);
        bG.setEnabled(false);
        bH.setEnabled(false);
        bI.setEnabled(false);
        bJ.setEnabled(false);
        bK.setEnabled(false);
        bL.setEnabled(false);
        bM.setEnabled(false);
        bN.setEnabled(false);
        bO.setEnabled(false);
        bP.setEnabled(false);
        bQ.setEnabled(false);
        bR.setEnabled(false);
        bS.setEnabled(false);
        bT.setEnabled(false);
        bU.setEnabled(false);
        bV.setEnabled(false);
        bW.setEnabled(false);
        bX.setEnabled(false);
        bY.setEnabled(false);
        bZ.setEnabled(false);
        bDica.setEnabled(false);
        }

    private void iniciarObjetos() {
        tvPalavra = (TextView) findViewById(R.id.tvPalavra);
        forca = (ImageView) findViewById(R.id.ivForca);

        bA = (Button) findViewById(R.id.bA);
        bB = (Button) findViewById(R.id.bB);
        bC = (Button) findViewById(R.id.bC);
        bD = (Button) findViewById(R.id.bD);
        bE = (Button) findViewById(R.id.bE);
        bF = (Button) findViewById(R.id.bF);
        bG = (Button) findViewById(R.id.bG);
        bH = (Button) findViewById(R.id.bH);
        bI = (Button) findViewById(R.id.bI);
        bJ = (Button) findViewById(R.id.bJ);
        bK = (Button) findViewById(R.id.bK);
        bL = (Button) findViewById(R.id.bL);
        bM = (Button) findViewById(R.id.bM);
        bN = (Button) findViewById(R.id.bN);
        bO = (Button) findViewById(R.id.bO);
        bP = (Button) findViewById(R.id.bP);
        bQ = (Button) findViewById(R.id.bQ);
        bR = (Button) findViewById(R.id.bR);
        bS = (Button) findViewById(R.id.bS);
        bT = (Button) findViewById(R.id.bT);
        bU = (Button) findViewById(R.id.bU);
        bV = (Button) findViewById(R.id.bV);
        bW = (Button) findViewById(R.id.bW);
        bX = (Button) findViewById(R.id.bX);
        bY = (Button) findViewById(R.id.bY);
        bZ = (Button) findViewById(R.id.bZ);
        bDica = (Button) findViewById(R.id.bDica);
        bA.setOnClickListener(this);
        bB.setOnClickListener(this);
        bC.setOnClickListener(this);
        bD.setOnClickListener(this);
        bE.setOnClickListener(this);
        bF.setOnClickListener(this);
        bG.setOnClickListener(this);
        bH.setOnClickListener(this);
        bI.setOnClickListener(this);
        bJ.setOnClickListener(this);
        bK.setOnClickListener(this);
        bL.setOnClickListener(this);
        bM.setOnClickListener(this);
        bN.setOnClickListener(this);
        bO.setOnClickListener(this);
        bP.setOnClickListener(this);
        bQ.setOnClickListener(this);
        bR.setOnClickListener(this);
        bS.setOnClickListener(this);
        bT.setOnClickListener(this);
        bU.setOnClickListener(this);
        bV.setOnClickListener(this);
        bW.setOnClickListener(this);
        bX.setOnClickListener(this);
        bY.setOnClickListener(this);
        bZ.setOnClickListener(this);
       bDica.setOnClickListener(this);
    }
}