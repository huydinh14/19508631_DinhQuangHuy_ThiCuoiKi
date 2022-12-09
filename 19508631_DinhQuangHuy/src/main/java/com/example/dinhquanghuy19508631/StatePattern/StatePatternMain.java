package com.example.dinhquanghuy19508631.StatePattern;

public class StatePatternMain {
    public static void main(String[] args) {
        Context context = new Context();

        StartStateOpen startState = new StartStateOpen();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopStateClose stopState = new StopStateClose();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
