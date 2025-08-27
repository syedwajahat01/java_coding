package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String mobileNumber;
    StocksObservable observable;

    public MobileAlertObserverImpl(String mobileNumber, StocksObservable observable){
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendMsgOnMobile(mobileNumber, "Product is in stock!!");
    }

    private void sendMsgOnMobile(String mobileNumber, String message){
        System.out.println("Msg sent to: " + mobileNumber);
    }
}
