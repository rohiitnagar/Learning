package Interfaces.Hero.Impl;

import Interfaces.Hero.SuperHero;

public class IronMan implements SuperHero {
    @Override
    public String usePower() {
        return "Iron Man using power";
    }

    @Override
    public String stopVillain(char c) {
        if(c=='y'){
            return "IronMan Killed villain"
        }else
        return "IronMan arrested  villain";
    }
}
