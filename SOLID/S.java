package SOLID;
public class S {
    //A class should have only one reason to change
    //Single Responsibility Principle
}

class Marker{
    String name;
    String color;
    double price;

    public Marker(String name, String color, double price){
        this.name = name;
        this.color = color;
        this.price = price;
    }
}


//without SRP
class Invoice{
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public double calculateTotal(){
        return marker.price * quantity;
    }

    public void printInvoice(){
        //print invoice details
    }

    public void saveToDB(){
        //save invoice to database
    }   
}

//with SRP
class InvoiceSRP{
    private Marker marker;
    private int quantity;

    public InvoiceSRP(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public double calculateTotal(){
        return marker.price * quantity;
    }
}

class InvoicePrinter{
    public void printInvoice(InvoiceSRP invoice){
        //print invoice details
    }
}

class InvoiceDB{
    public void saveToDB(InvoiceSRP invoice){
        //save invoice to database
    }   
}

