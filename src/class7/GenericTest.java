package class7;

public class GenericTest {
    public static void main(String[] args) {
        IntegerTest integerTest = new IntegerTest(987);
        System.out.println(integerTest.getInteger());
        SpringTest springTest =new SpringTest("SQA learning");
        System.out.println(springTest.getString());
        DoubleTest doubleTest = new DoubleTest(987.77);
        System.out.println(doubleTest.getaDouble());
        LongTest longTest = new LongTest(6867l);
        System.out.println(longTest.getaLong());


        System.out.println("==========================================");

        Generic<Integer> integerGeneric = new Generic<>(243);
        System.out.println(integerGeneric.getObj());

        Generic<String> stringGeneric = new Generic<>("SQA");
        System.out.println(stringGeneric.getObj());
        Generic<Double> doubleGeneric = new Generic<>(68.6586);
        System.out.println(doubleGeneric.getObj());
        




    }
}
