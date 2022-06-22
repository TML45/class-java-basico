package aulas.trabalhandoComDatas.javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Exemplo de formatação de data com SimpleDateFormat
 */
public class Exemplo009 {
    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:mmm");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
        
        SimpleDateFormat formatterNew = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSSZ");

        String dataFormatadaNew = formatterNew.format(agora);

        System.out.println(dataFormatadaNew);
        // 14/07/2019

    }
}
