package ru.delivery.dao;


import ru.delivery.model.Category;
import ru.delivery.model.Product;

import java.util.List;

public interface SelectDAO {

    //Получаю лист категорий
    public List<Category> getListCategory();
    //Получаю лист продуктов после того как выбрал категорию
    public List<Product> getListProduct(Category category);

}
