package by.tc.task01.dao.impl.txtSourceImpl;

import by.tc.task01.dao.impl.AbstractAppliencTxtDAO;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.*;

public class OvenTxtDAOImpl extends AbstractAppliencTxtDAO {

    @Override
    protected String getTypeName(){
        return "Oven";
    }



    @Override
    protected Oven buildAppliance( Map<String, String> applianceMap){

        Oven oven = new Oven();

        oven.setCapacity(Float.parseFloat(applianceMap.get(SearchCriteria.Oven.CAPACITY.name())));

        oven.setDepth(Float.parseFloat(applianceMap.get(SearchCriteria.Oven.DEPTH.name())));

        oven.setHeight(Float.parseFloat(applianceMap.get(SearchCriteria.Oven.HEIGHT.name())));

        oven.setPowerConsumption(Float.parseFloat(applianceMap.get(SearchCriteria.Oven.POWER_CONSUMPTION.name())));

        oven.setWeight(Float.parseFloat(applianceMap.get(SearchCriteria.Oven.WEIGHT.name())));

        oven.setWidth(Float.parseFloat(applianceMap.get(SearchCriteria.Oven.WIDTH.name())));

        return oven;
    }


}
