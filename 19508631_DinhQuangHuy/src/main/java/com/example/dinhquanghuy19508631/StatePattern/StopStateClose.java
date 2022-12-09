package com.example.dinhquanghuy19508631.StatePattern;

public class StopStateClose implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Circuit Breaker is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
