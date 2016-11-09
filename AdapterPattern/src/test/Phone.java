package test;

/**
 * Created by developer on 2016/11/4.
 */
public class Phone {
    EnergyAdapter energyAdapter;

    public void charge(){
        if (energyAdapter!=null){
            System.out.println("手机在使用"+energyAdapter.translateEnergy()+"充电");
        }
    }



    public EnergyAdapter getEnergyAdapter() {
        return energyAdapter;
    }

    public void setEnergyAdapter(EnergyAdapter energyAdapter) {
        this.energyAdapter = energyAdapter;
    }
}
