package main;

import model.Loan;
import model.Loans;
import util.UserInterface;

public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        Loans loans = new Loans();

        for(int i = 0; i < 4; i++){
            System.out.println("Digite o valor do " + (i+1) + "º financiamento");
            float housingValue = userInterface.getHousingValue();
            int deadlineFinancing = userInterface.getDeadlineFinancing();
            float annualInterestRate = userInterface.getAnnualInterestRate();
            loans.addNewLoan(new Loan(housingValue, deadlineFinancing, annualInterestRate));
        }

        loans.listAllLoans();
    }
}