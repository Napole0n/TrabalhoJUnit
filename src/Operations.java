
import com.sun.corba.se.impl.util.PackagePrefixChecker;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Murilo
 */
public class Operations {

    public static double calculaMedia(List<Integer> l) {

        int sum = 0;

        for (Integer i : l) {
            sum = sum + i;
        }
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double result = (double) sum / l.size();

        String s1 = df.format(result);
        String s2 = s1.replace(",", ".");

        return Double.valueOf(s2);
    }

    public static int calculaModa(List<Integer> l) {

        Integer[] vet = new Integer[l.size()];
        vet = l.toArray(vet);

        int nVezes = 1;
        int moda = 0;
        int comparaV = 0;

        for (int p = 0; p < vet.length; p++) {
            nVezes = 1;

            for (int k = p + 1; k < vet.length; k++) {
                if (vet[p] == vet[k]) {
                    ++nVezes;
                }
            }
            if (nVezes > comparaV) {
                moda = vet[p];
                comparaV = nVezes;
            }
        }
        return moda;
    }

    public static double calculaMediana(List<Integer> l) {

        Integer[] vet = new Integer[l.size()];
        vet = l.toArray(vet);

        Arrays.sort(vet);
        double mediana;
        if (vet.length % 2 == 0) {
            mediana = ((double) vet[vet.length / 2] + (double) vet[vet.length / 2 - 1]) / 2;
        } else {
            mediana = (double) vet[vet.length / 2];
        }

        return mediana;
    }

    public static double calculavariancia(List<Integer> l) {

        Double media = calculaMedia(l);
        double soma = 0;

        for (int i = 0; i < l.size(); i++) {
            soma = soma + ((l.get(i) - media) * (l.get(i) - media));
        }

        DecimalFormat df = new DecimalFormat("#,##0.00");
        String s1 = df.format(((double) 1 / (l.size() - 1)) * soma);
        String s2 = s1.replace(",", ".");

        return corrigePontos(s2);
    }

    public static double calculaDesvioPadrao(List<Integer> l) {

        if (l.size() == 1) {
            return 0.0;
        } else {
            double media = calculaMedia(l);
            double somatorio = 0l;
            for (int i = 0; i < l.size(); i++) {
                double result = l.get(i) - media;
                somatorio = somatorio + result * result;
            }

            DecimalFormat df = new DecimalFormat("#,##0.00");
            String s1 = df.format(Math.sqrt(((double) 1 / (l.size() - 1)) * somatorio));
            String s2 = s1.replace(",", ".");

            return Double.valueOf(s2);
        }
    }

    private static double corrigePontos(String s) {

        int cont = 0;
        char[] vec = new char[s.length()];
        vec = s.toCharArray();
        int indxFinal = 0;

        for (int i = 0; i < vec.length; i++) {
            if (vec[i] == '.') {
                cont++;
                if (cont > 1) {
                    vec[i] = ',';
                    indxFinal = i;
                }
            }

        } 
        String ret = "";
        for (int i = 0; i < vec.length; i++) {
            ret = ret + vec[i];
        }
        if(cont>1){
        ret = ret.substring(0, indxFinal);
        }
        return Double.valueOf(ret);

    }

}
