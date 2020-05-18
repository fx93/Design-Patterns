

public class Application {

    public static void main(String[] args) {
        VAT vat=new VAT();
        NBT nbt=new NBT();
        BTT btt=new BTT();
        SSF ssf=new SSF();

//        Tax tax1=new Tax();
//        tax1.setSuccessor(vat);
//        vat.setSuccessor(nbt);
//        nbt.setSuccessor(btt);
//        btt.setSuccessor(ssf);
//
//        Invoice invoice1=new Invoice(1, 50);
//        System.out.println(tax1.applyTax(invoice1));
//
//        Invoice invoice2=new Invoice(2, 150);
//        System.out.println(tax1.applyTax(invoice2));
//
//        Invoice invoice3=new Invoice(3, 550);
//        System.out.println(tax1.applyTax(invoice3));


        Tax tax2=new Tax();
        tax2.setSuccessor(nbt);
        vat.setSuccessor(nbt);
        nbt.setSuccessor(btt);
        btt.setSuccessor(ssf);

        Invoice invoice1=new Invoice(1, 50);
        System.out.println(tax2.applyTax(invoice1));

        Invoice invoice2=new Invoice(2, 150);
        System.out.println(tax2.applyTax(invoice2));

        Invoice invoice3=new Invoice(3, 550);
        System.out.println(tax2.applyTax(invoice3));

    }
}
