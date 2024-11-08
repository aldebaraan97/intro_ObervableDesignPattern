package org.example.observablepropertydemo;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.Observable;
import javafx.beans.InvalidationListener;

public class ObservablePropertyDemo {
    public static void main(String[] args) {
        DoubleProperty balance = new SimpleDoubleProperty();
        // Using a Lambda expression
        balance.addListener(ov -> {
            System.out.println("The new value is " + balance.doubleValue());


        // Without using Lambda expression
//        balance.addListener(new InvalidationListener() {
//            public void invalidated(Observable observable) {
//                System.out.println("The new value is " + balance.doubleValue());
//            }
        });
        balance.set(4.5);
    }
}
