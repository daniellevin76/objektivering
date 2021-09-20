package com.example.objektivering;


import java.util.ArrayList;


public class TableObject  {

    String OrderDate , Region, Rep1, Rep2, Item, Units, UnitCost, Total;

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



    public TableObject(ArrayList<String> rowData) {

        if(rowData.get(0) != null) {OrderDate = rowData.get(0);}

        if(rowData.get(1) != null){   Region =rowData.get(1);}
        if(rowData.get(2) != null){Rep1 =rowData.get(2);}

        if(rowData.get(3) != null){ Rep2 =rowData.get(3);}

        if(rowData.get(4) != null){ Item =rowData.get(4);}


        if(rowData.get(5) != null){Units = rowData.get(5);}

        if(rowData.get(6) != null){UnitCost = rowData.get(6);}

        if(rowData.get(7) != null){Total = rowData.get(7);} else{Total = "";}


    }
}