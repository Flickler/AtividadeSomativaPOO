package model;

public class Loan {
    private final float housingValue;
    private final int deadlineFinancing;
    private final float annualInterestRate;

    public Loan(float housingValue, int deadlineFinancing, float annualInterestRate) {
        this.housingValue = housingValue;
        this.deadlineFinancing = deadlineFinancing;
        this.annualInterestRate = annualInterestRate;
    }

    public float getHousingValue() {
        return housingValue;
    }

    public float calculateMonthlyPayment(){
        return (this.housingValue / (this.deadlineFinancing * 12)) * (1 + (this.annualInterestRate / 12));
    }

    public float calculateTotalPayment(){
        return calculateMonthlyPayment() * this.deadlineFinancing * 12;
    }
}
