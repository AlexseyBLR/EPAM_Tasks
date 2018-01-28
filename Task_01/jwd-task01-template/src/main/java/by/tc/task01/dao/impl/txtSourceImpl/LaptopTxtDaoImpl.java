package by.tc.task01.dao.impl.txtSourceImpl;

import by.tc.task01.dao.impl.AbstractAppliencTxtDAO;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.SearchCriteria;


import java.util.Map;


public class LaptopTxtDaoImpl extends AbstractAppliencTxtDAO {


    @Override
    protected String getTypeName(){
        return "Laptop";
    }


    @Override
    protected Laptop buildAppliance(Map<String, String> applianceMap){

        Laptop laptop = new Laptop();

        laptop.setBatteryCapacity(Float.parseFloat(applianceMap.get(SearchCriteria.Laptop.BATTERY_CAPACITY.name())));

        laptop.setCpu(Float.parseFloat(applianceMap.get(SearchCriteria.Laptop.CPU.name())));

        laptop.setDisplayInchs(Float.parseFloat(applianceMap.get(SearchCriteria.Laptop.DISPLAY_INCHS.name())));

        laptop.setMemoryRom(Float.parseFloat(applianceMap.get(SearchCriteria.Laptop.MEMORY_ROM.name())));

        laptop.setOs(applianceMap.get(SearchCriteria.Laptop.OS.name()));

        laptop.setSystemMemory(Float.parseFloat(applianceMap.get(SearchCriteria.Laptop.SYSTEM_MEMORY.name())));

        return laptop;
    }
}
