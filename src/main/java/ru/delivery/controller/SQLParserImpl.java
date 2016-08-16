package ru.delivery.controller;

import org.json.JSONArray;
import ru.delivery.model.*;

import java.util.List;

public class SQLParserImpl  implements SQLParser{

    public JSONArray parseListCategory(List<Category> list) {
        JSONArray getCategory = new JSONArray(list);
        return getCategory;
    }

    public JSONArray parseListClient(List<Client> list) {
        JSONArray getClient = new JSONArray(list);
        return getClient;
    }

    public JSONArray parseListCurrency(List<Currency> list) {
        JSONArray getCurrency = new JSONArray(list);
        return getCurrency;
    }

    public JSONArray parseListOperation(List<Operation> list) {
        JSONArray getOperation = new JSONArray(list);
        return getOperation;
    }

    public JSONArray parseListOrder(List<Order> list) {
        JSONArray getOrder = new JSONArray(list);
        return getOrder;
    }

    public JSONArray parseListProduct(List<Product> list) {
        JSONArray getProduct = new JSONArray(list);
        return getProduct;
    }

    public JSONArray parseListTypeCurrency(List<TypeCurrency> list) {
        JSONArray getTypeCurrency = new JSONArray(list);
        return getTypeCurrency;
    }
}
