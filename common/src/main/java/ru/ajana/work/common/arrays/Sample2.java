package ru.ajana.work.common.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrey Kharintsev on 11.06.2019
 */
public class Sample2 {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getArrayProduct());
        System.out.println(order.getProductList());
    }
}

class Order implements IOrder {
    @Override
    public String[] getArrayProduct() {
        return new String[0];
    }

    @Override
    public ArrayList<String> getProductList() {
        return new ArrayList<>();
    }
}

interface IOrder {
    Object[] getArrayProduct();

    List<String> getProductList();
}