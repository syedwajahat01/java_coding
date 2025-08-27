package DesignPatterns.ObserverPattern;

import DesignPatterns.ObserverPattern.Observable.IPhoneObservableImpl;
import DesignPatterns.ObserverPattern.Observable.StocksObservable;
import DesignPatterns.ObserverPattern.Observer.EmailAlertObserverImpl;
import DesignPatterns.ObserverPattern.Observer.MobileAlertObserverImpl;
import DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IPhoneObservableImpl();

        NotificationAlertObserver obs1 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver obs2 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver obs3 = new MobileAlertObserverImpl("9335000111", iphoneStockObservable);

        iphoneStockObservable.add(obs1);
        iphoneStockObservable.add(obs2);
        iphoneStockObservable.add(obs3);

        iphoneStockObservable.setStockCount(100);
    }
}
