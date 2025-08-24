package SOLID;

public class O {
    //Objects or entities should be open for extension but closed for modification
    //Open-Closed Principle
}

//without OCP
class InvoiceDao{
    InvoiceSRP invoice;

    public InvoiceDao(InvoiceSRP invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        //save invoice to database
    }

    //it is prone to bugs
    public void loadFromDB(int id){
        //load invoice from database
    }
}


//with OCP
interface InvoiceDaoInterface{
    void save();
}
class InvoiceDaoOCP implements InvoiceDaoInterface{
    InvoiceSRP invoice;

    public InvoiceDaoOCP(InvoiceSRP invoice){
        this.invoice = invoice;
    }

    public void save(){
        //save invoice to database
    }
}

class InvoiceFileOCP implements InvoiceDaoInterface{
    InvoiceSRP invoice;

    public InvoiceFileOCP(InvoiceSRP invoice){
        this.invoice = invoice;
    }

    public void save(){
        //save invoice to file
    }
}


