package com.it.exercises.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TechTalks on 1/15/2018.
 */
public class Customer {
    private List<PhoneContract> myContracts=new ArrayList<>();
    private int rewardPoints=0;

    public void buyContract(){
        PhoneContract contract= new PhoneContract(PhoneDeals.iPhoneUnlimited);
        rewardPoints=rewardPoints+contract.getRewardPoints();
        myContracts.add(contract);
    }

    public List<Deal> getDeals(String filter){
        return DealService.getDeals(filter);
    }

    public int myRewardPoints(){
        return rewardPoints;
    }

    public int myContracts(){
        return myContracts.size();
    }
}
