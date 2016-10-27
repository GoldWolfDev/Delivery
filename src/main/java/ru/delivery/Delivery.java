package ru.delivery;

import ru.delivery.util.Factory;

public class Delivery {
    public static void main(String[] args) {
        Factory.getInstance().getInstanceFunc().firstCreateTable();
    }
}
