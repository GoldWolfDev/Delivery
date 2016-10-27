package ru.delivery.util;

import ru.delivery.dao.*;

public class Factory {

    private static Factory instance = null;

    private SelectDAO instanceSQLReturn = null;

    private UpdateDAO instanceSQLNoReturn = null;

    private FunctionTableDAO instanceFunc = null;

    private Factory(){}

    public static Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public FunctionTableDAO getInstanceFunc(){
        if (instanceFunc == null){
            instanceFunc = new FunctionTableDAOImpl();
        }
        return instanceFunc;
    }

    public SelectDAO getSQLReturn(){
        if (instanceSQLReturn == null){
            instanceSQLReturn = new SelectDAOImpl();
        }
        return instanceSQLReturn;
    }

    public UpdateDAO getSQLNoReturn(){
        if (instanceSQLNoReturn == null){
            instanceSQLNoReturn = new UpdateDAOImpl();
        }
        return instanceSQLNoReturn;
    }
}
