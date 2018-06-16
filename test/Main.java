
import java.util.Scanner;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Murilo
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1   -   Iniciar testes");
        int in = scan.nextInt();

        if (in == 1) {

            Result result = JUnitCore.runClasses(TestSuite.class);

            if (result.getFailureCount() == 0) {
                System.out.println("");
                System.out.println("Não houveram erros");
            } else {

                System.out.println("Erros:");

                for (Failure failure : result.getFailures()) {
                    System.out.println(failure.toString());
                    System.out.println(failure.getMessage());
                }
            }
        }
    }
}
