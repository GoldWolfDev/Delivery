package ru.delivery.controller;

import org.json.JSONArray;
import ru.delivery.model.*;

import java.util.List;

public interface SQLParser {

    public JSONArray parseListCategory(List<Category> list);
    public JSONArray parseListClient(List<Client> list);
    public JSONArray parseListCurrency(List<Currency> list);
    public JSONArray parseListOperation(List<Operation> list);
    public JSONArray parseListOrder(List<Order> list);
    public JSONArray parseListProduct(List<Product> list);
    public JSONArray parseListTypeCurrency(List<TypeCurrency> list);

}
