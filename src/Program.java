import model.entities.Contract;
import model.service.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Entre os dados do contrato");
            System.out.print("Número: ");
            int numberContract = sc.nextInt();
            sc.nextLine();
            System.out.print("Data: ");
            Date date = fmt.parse(sc.nextLine());
            System.out.print("Valor do contrato: ");
            double amount = sc.nextDouble();
            sc.nextLine();
            System.out.print("Entre com o Número de parcelas: ");
            int parcelas = sc.nextInt();
            Contract contract = new Contract(numberContract,parcelas,amount,date,new PaypalService());


        }
        catch (ParseException e){
            System.out.println("Por favor, verifique a data e digite novamente");
        }
        finally {
            sc.close();
        }
    }
}
