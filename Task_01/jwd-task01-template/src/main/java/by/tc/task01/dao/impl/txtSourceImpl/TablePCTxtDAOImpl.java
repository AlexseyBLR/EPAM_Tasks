package by.tc.task01.dao.impl.txtSourceImpl;

import by.tc.task01.dao.impl.AbstractAppliencTxtDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class TablePCTxtDAOImpl extends AbstractAppliencTxtDAO {
    @Override
    protected String getTypeName() {
        return "TabletPC";
    }

    @Override
    protected Appliance buildAppliance(Map<String, String> applianceMap) {

        TabletPC tabletPC = new TabletPC();

        tabletPC.setBatteryCapacity(Float.parseFloat(applianceMap.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.name())));

        tabletPC.setColor(applianceMap.get(SearchCriteria.TabletPC.COLOR.name()));

        tabletPC.setDisplayInchs(Float.parseFloat(applianceMap.get(SearchCriteria.TabletPC.DISPLAY_INCHES.name())));

        tabletPC.setFlashMemoryCapacity(Float.parseFloat(applianceMap.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name())));

        tabletPC.setMemoryRom(Float.parseFloat(applianceMap.get(SearchCriteria.TabletPC.MEMORY_ROM.name())));

        return tabletPC;
    }
}
