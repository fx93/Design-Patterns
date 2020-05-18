
public class NBT extends Handler{
    @Override
    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getTax() + invoice.getAmount()*0.02);
        System.out.println("NBT calculated");
        if (invoice.getAmount()> 100 && invoice.getAmount()<=200){
            return invoice.getTax();
        }
        return successor.applyTax(invoice);
    }
}
