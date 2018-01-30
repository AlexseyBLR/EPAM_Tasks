package by.tc.task01.dao.impl.txtSourceImpl;

import by.tc.task01.dao.impl.AbstractAppliencTxtDAO;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class RefrigeratorTxtDAOImpl extends AbstractAppliencTxtDAO {

    @Override
    protected String getTypeName(){
        return "Refrigerator";
    }



    @Override
    protected Refrigerator buildAppliance(Map<String, String> applianceMap){

        Refrigerator ref = new Refrigerator();

        ref.setFreezerCapacity(Float.parseFloat(applianceMap.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.name())));// слишком длинные методы

        ref.setHeight(Float.parseFloat(applianceMap.get(SearchCriteria.Refrigerator.HEIGHT.name())));

        ref.setOverallCapacity(Float.parseFloat(applianceMap.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.name())));

        ref.setPowerConsumption(Float.parseFloat(applianceMap.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.name())));

        ref.setWeight(Float.parseFloat(applianceMap.get(SearchCriteria.Refrigerator.WEIGHT.name())));

        ref.setWidth(Float.parseFloat(applianceMap.get(SearchCriteria.Refrigerator.WIDTH.name())));

        return ref;
    }

}
