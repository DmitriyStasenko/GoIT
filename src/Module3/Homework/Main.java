package Module3.Homework;

/**
 * Created by Дима on 19.11.2016.
 */
public class Main {


    public static void main(String[] args) {

        testColl();
        testColl1();

    }

    static void testColl(){
        Coll coll = new Coll();


        System.out.println(coll.getAge());
        System.out.println(coll.getAge());
        System.out.println(coll.getCompany());
        System.out.println(coll.getId());




    }


    static void testColl1(){
        Coll coll1 = new Coll("Pasha", 19, "Test", 1001);

        System.out.println(" ");



        System.out.println(coll1);


        System.out.println(coll1.getAge());
        System.out.println(coll1.getName());
        System.out.println(coll1.getCompany());
        System.out.println(coll1.getId());


        coll1.setId(56324);
        coll1.setAge(20);
        long collId = coll1.getId();




        System.out.println(coll1.getAge());
        System.out.println(coll1.getId());



    }
}
