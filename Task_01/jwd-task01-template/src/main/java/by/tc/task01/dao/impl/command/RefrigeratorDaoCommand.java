package by.tc.task01.dao.impl.command;

import by.tc.task01.dao.impl.txtSourceImpl.RefrigeratorTxtDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;


public class RefrigeratorDaoCommand implements Command {

   private Criteria criteria;

    public RefrigeratorDaoCommand(Criteria criteria) {// передача сюда критериев как параметров заставляет тебя создавать новый объект, что нецелесообразно
       // а в твоей реализации ты создаешь аж целую группу объектов, из которой нужен только один
        this.criteria = criteria;
    }

    @Override
    public Appliance execute() {
        return new RefrigeratorTxtDAOImpl().find(criteria);
    }
}
