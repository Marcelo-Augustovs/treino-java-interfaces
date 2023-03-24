package model.service;

public class PaypalService implements TaxService{

    public double tax(double amount,int parcelas){

        double valueParcelas = amount + amount * (0.01 * parcelas);
        return valueParcelas;

    }

}
