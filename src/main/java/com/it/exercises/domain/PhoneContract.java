package com.it.exercises.domain;

/**
 * Created by TechTalks on 1/15/2018.
 */
public class PhoneContract implements Contract {
    private PhoneDeals dealBought;

    public PhoneContract(PhoneDeals deal) {
        dealBought = deal;
    }

    private Deal deal;
    private int rewardPoints;

    public Deal getDeal() {
        return deal;
    }

    public int getRewardPoints() {
        switch (dealBought) {
            case iPhoneUnlimited:
                return 500;
            case SamsungSupreme:
                return 200;
            default:
                return 100;

        }
    }
}
