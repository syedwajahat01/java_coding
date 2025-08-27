package DesignPatterns.ObserverPattern.Observer;

import DesignPatterns.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emaiId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emaiId, StocksObservable observable){
        this.emaiId = emaiId;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendEmail(emaiId, "Product is in stock!!");
    }

    private void sendEmail(String emaiId, String message){
        System.out.println("Mail sent to: "+emaiId);
    }
}
