package model;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Loans {
    ArrayList<Loan> loans = new ArrayList<>();

    public void addNewLoan(Loan loan){
        loans.add(loan);
    }

    public void listAllLoans(){
        float housingTotal = loans
                .stream()
                .map(Loan::getHousingValue)
                .reduce(0.0f, Float::sum);

        float financingTotal = loans
                .stream()
                .map(Loan::calculateTotalPayment)
                .reduce(0.0f, Float::sum);

        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        loans.forEach(loan -> {
            System.out.println("--------------------------------------");
            System.out.println("valor do imóvel: R$ " + decimalFormat.format(loan.getHousingValue()));
            System.out.println("valor do financiamento: R$ " + decimalFormat.format(loan.calculateTotalPayment()));
            System.out.println("--------------------------------------");
        });

        System.out.println("--------------------------------------");
        System.out.println("Valor total dos imoveis: R$ " + decimalFormat.format(housingTotal));
        System.out.println("Valor total dos financiamentos: R$ " + decimalFormat.format(financingTotal));
        System.out.println("--------------------------------------");
    }
}
