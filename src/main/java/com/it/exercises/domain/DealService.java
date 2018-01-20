package com.it.exercises.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DealService
{
    private static List<Deal> deals;

    private static List<Deal> setupDeals(){
        if(deals==null) {
            deals = new ArrayList<>();
            deals.add(getIPhoneDeal());
            deals.add(getSamsungDeal());
            deals.add(getSonyDeal());
        }
        return deals;
    }
    public static List<Deal> getDeals(String filter){
        setupDeals();
        if(filter.toLowerCase().equals("all"))
            return deals;
        else
            return  deals.stream().filter(deal -> deal.getType().equals(filter)).collect(Collectors.toList());
    }

    private static Deal getIPhoneDeal() {
        Deal iPhone=new Deal();
        iPhone.setPlanName("35$ Plan");
        iPhone.setPhoneName("iPhone XI");
        iPhone.setRAM("64");
        iPhone.setPrice("600");
        iPhone.setType("iOS");
        return iPhone;
    }

    private static Deal getSamsungDeal() {
        Deal samsung=new Deal();
        samsung.setPlanName("48$ Plan");
        samsung.setPhoneName("Samsung Galaxy");
        samsung.setRAM("32");
        samsung.setPrice("200");
        samsung.setType("Android");
        return samsung;
    }

    private static Deal getSonyDeal() {
        Deal sony=new Deal();
        sony.setPlanName("48$ Plan");
        sony.setPhoneName("Sony");
        sony.setRAM("32");
        sony.setPrice("0");
        sony.setType("Android");
        return sony;
    }
}
