package model.entities;

import model.service.TaxService;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Contract {
    private static SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
    private TaxService taxService;
    private Date date;

    private Double amount;
    private Integer numberContract;
    private Integer parcelas;


    public Contract(Integer numberContract, Integer parcelas,Double amount,Date date, TaxService taxService) {
        this.numberContract = numberContract;
        this.parcelas = parcelas;
        this.amount = amount;
        this.taxService = taxService;
        this.date = date;
    }


    public Integer getNumberContract() {
        return numberContract;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public Double getAmount() {
        return amount;
    }

    public String getDate(){
        return fmt.format(date);
    }

    public TaxService getTaxService() {
        return taxService;
    }


}
