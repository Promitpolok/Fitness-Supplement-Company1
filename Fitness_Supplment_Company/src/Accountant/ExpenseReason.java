/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accountant;

/**
 *
 * @author USER
 */
class ExpenseReason {
    private String spendReason;
    private float amount;
    private Integer date;

    public ExpenseReason(String spendReason, float amount, Integer date) {
        this.spendReason = spendReason;
        this.amount = amount;
        this.date = date;
    }

    public String getSpendReason() {
        return spendReason;
    }

    public void setSpendReason(String spendReason) {
        this.spendReason = spendReason;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ExpenseReason{" + "spendReason=" + spendReason + ", amount=" + amount + ", date=" + date + '}';
    }

    
    
}
