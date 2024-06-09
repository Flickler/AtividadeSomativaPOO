package util;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    private final String rejectMessage = "Valores negativos não são permitidos, tente novamente com um valor válido";

    public float getHousingValue() {
        System.out.println("Digite o valor do Financiamento: ");
        float housingValue = this.scanner.nextFloat();
        if(housingValue < 0){
            System.out.println(this.rejectMessage);
            return this.getHousingValue();
        }
        return housingValue;
    }

    public int getDeadlineFinancing() {
        System.out.println("Digite o prazo do Financiamento: ");
        int deadlineFinancing = this.scanner.nextInt();
        if(deadlineFinancing < 0){
            System.out.println(this.rejectMessage);
            return this.getDeadlineFinancing();
        }
        return deadlineFinancing;
    }

    public float getAnnualInterestRate() {
        System.out.println("Digite a taxa anual do Financiamento: ");
        float annualInterestRate = this.scanner.nextFloat();
        if(annualInterestRate < 0){
            System.out.println(this.rejectMessage);
            return this.getDeadlineFinancing();
        } else if(annualInterestRate > 100){
            System.out.println("A taxa de juros não pode ser acima de 100%, adicione um valor valido");
            return this.getDeadlineFinancing();
        }
        return annualInterestRate;
    }
}
