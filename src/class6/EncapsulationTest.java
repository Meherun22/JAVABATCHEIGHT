package class6;

public class EncapsulationTest {
    public static void main(String[] args) {
        ReadOnlyTest readOnlyTest=new ReadOnlyTest();
        System.out.println(readOnlyTest.getName());
        WriteOnlyTest writeOnlyTest =new WriteOnlyTest();
        writeOnlyTest.setName("LABONNO");
        ReadWriteTest readWriteTest =new ReadWriteTest();
        readWriteTest.setAcc_no(12234);
        System.out.println(readWriteTest.getAcc_no());
        readWriteTest.setName("LABONNO");
        System.out.println(readWriteTest.getName());



    }


}
