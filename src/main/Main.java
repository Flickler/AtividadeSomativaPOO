package main;

import model.Loan;
import util.UserInterface;

public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();

        float housingValue = userInterface.getHousingValue();
        int deadlineFinancing = userInterface.getDeadlineFinancing();
        float annualInterestRate = userInterface.getAnnualInterestRate();

        Loan loan = new Loan(housingValue, deadlineFinancing, annualInterestRate);
        System.out.println("Financiamento realizado");
        System.out.println("O valor do financiamento é de R$ " + loan.getHousingValue());
        System.out.println("O tempo anual previsto é de " + loan.getDeadlineFinancing() + " anos");
        System.out.println("A taxa anual do financiamento é de " + loan.getAnnualInterestRate() + "%");
        System.out.println("O pagamento mensal será de R$ " + loan.calculateMonthlyPayment());
        System.out.println("O pagamento anual será de R$ " + loan.calculateTotalPayment());
    }
}