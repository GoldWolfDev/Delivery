package ru.delivery.util;

import ru.delivery.question.SQLQuestionNoReturn;
import ru.delivery.question.SQLQuestionNoReturnImpl;
import ru.delivery.question.SQLQuestionReturn;
import ru.delivery.question.SQLQuestionReturnImpl;

public class Factory {

    private static Factory instance = null;

    private SQLQuestionNoReturn instanceSQLNoReturn = null;

    private SQLQuestionReturn instanceSQLReturn = null;

    private Factory(){}

    public static Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public SQLQuestionNoReturn getSQLNoReturn(){
        if (instanceSQLNoReturn == null){
            instanceSQLNoReturn = new SQLQuestionNoReturnImpl();
        }
        return instanceSQLNoReturn;
    }

    public SQLQuestionReturn getSQLReturn(){
        if (instanceSQLReturn == null){
            instanceSQLReturn = new SQLQuestionReturnImpl();
        }
        return instanceSQLReturn;
    }
}
