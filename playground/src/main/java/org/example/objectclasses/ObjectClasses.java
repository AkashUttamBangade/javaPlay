package org.example.objectclasses;

public class ObjectClasses {

    {
        System.out.println("Main....");
        System.out.println(this);
    }

//    static {
//        System.out.println(this);
//    }


    boolean bl;
    int first;
    ObjectClasses ob;

    public static void main(String[] args) {

        MyClass obj = new MyClass();
        obj.display();

        System.out.println();

        User user = new User();
        System.out.println(user.name);

        User user1 = new User("Geeks");
        System.out.println(user1.name);
        user.print().print();

        System.out.println("Addition = "+Addition.add(3,5));

        ObjectClasses ob = new ObjectClasses();
        System.out.println(ob.bl+"  "+ob.first+"  "+ob.ob);
    }
}
