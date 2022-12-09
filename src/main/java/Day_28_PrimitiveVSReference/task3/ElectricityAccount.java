package Day_28_PrimitiveVSReference.task3;

public class ElectricityAccount {
    int totalWph;
    double rate = 0.7;
    double bill;

    public void calculateBill(){
        bill += totalWph * rate;
        bill = Math.ceil(bill);
    }
}
