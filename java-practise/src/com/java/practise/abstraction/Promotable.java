package com.java.practise.abstraction;

public interface Promotable {
    static void broadcastGlobalSale() {

    }

    double getDiscountRate();

    default double applyPromo(double basepice){
        return  basepice - (basepice * getDiscountRate());
    }
    static  void broadCastGlobalSale(){
        System.out.println(">>> GLOBAL ALERT: Special promotions applied at checkout! <<<\"");
    }
}
