package com.example.objektivering;


import java.util.ArrayList;

public class TableObject{

    public String getOrderDate() {
        return OrderDate;
    }

    public String getRegion() {
        return Region;
    }

    public String getRep1() {
        return Rep1;
    }

    public String getRep2() {
        return Rep2;
    }

    public String getItem() {
        return Item;
    }

    public String getUnits() {
        return Units;
    }

    public String getUnitCost() {
        return UnitCost;
    }

    public String getTotal() {
        return Total;
    }

    String OrderDate, Region, Rep1, Rep2, Item, Units, UnitCost, Total;

    public TableObject(ArrayList<String> rowData) {

        OrderDate =rowData.get(0);
        Region =rowData.get(1);
        Rep1 =rowData.get(2);
        Rep2 =rowData.get(3);
        Item =rowData.get(4);
        UnitCost =rowData.get(5);
        Total =rowData.get(6);
    }
}