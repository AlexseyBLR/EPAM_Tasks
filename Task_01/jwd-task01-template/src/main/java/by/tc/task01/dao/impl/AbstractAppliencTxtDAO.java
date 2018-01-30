package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.FileParser;
import by.tc.task01.dao.properties.Property;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public abstract class AbstractAppliencTxtDAO implements ApplianceDAO {

        private static final File file = new File(Property.path);

    protected abstract String getTypeName();

    protected abstract Appliance buildAppliance(Map<String, String> applianceMap);

    @Override
    public  <E> Appliance find(Criteria<E> criteria)  {

        FileParser fileParser = new FileParser(file , criteria);

        Appliance appliance = null;
        try {

            Map<String , String> appMap = fileParser.getApplianceMap(getTypeName());
            if (appMap != null) {
                appliance = buildAppliance(appMap);
            }
        }catch (IOException e){
            throw new DAOException(e.getMessage());// и про это мы говорили, правда на прошлом тренинге
                // какой еще e.getMessage()?
        }catch (Exception e){
            throw new DAOException(e.getMessage());
        }
        return appliance;

    }










}
