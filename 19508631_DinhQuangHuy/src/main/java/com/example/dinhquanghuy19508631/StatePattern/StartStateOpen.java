                                                            package com.example.dinhquanghuy19508631.StatePattern;

public class StartStateOpen implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Circuit Breaker is in start date");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
