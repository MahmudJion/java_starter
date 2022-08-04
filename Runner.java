package ood;

public class Runner
{
    public static void main(String[] args)
    {
        Family smiths;
        smiths = new Family("Mary","Fred");
        // create the children
        Person child1;
        child1 = new Person("Anne",12);
        Person child2 = new Person("Joe",16); // shortcut
        Person child3 = new Person("Anil",14);

        Dog d1 = new Dog("Rex", "alsatian");
        d1.setAge(5);

        // add the children to the array
        smiths.addChild(child1);
        smiths.addChild(child2);
        // child3 ??
        smiths.addChild (new Person("0lek", 7)); //shortcut using an anonymous object
        smiths.addChild("Ivan",6);  // alternative way to add a child - see Family code

        // display calling the mutator
        System.out.println("***** Using showAllChildren()");
        smiths.showAllChildren();

        // display calling the accessor
        System.out.println("***** Using getAllChildren()");
        String xx = smiths.getAllChildren();
        // client has control of what to do with the data
        System.out.println(xx);
        //OR shortcut :  System.out.println(smiths.getAllChildren());

        // different ways of adding a dog
        smiths.addDog(d1);
        smiths.addDog(new Dog("Loopy","Collie"));  // shortcut
        smiths.addDog("Fido", "Terrier");  // alternative way to add a dog in Family

        // display calling the mutator
        System.out.println("***** Using showAllDogs()");
        smiths.showAllDogs();

        // display calling the accessor
        System.out.println("***** Using getAllDogs()");
        System.out.println(smiths.getAllDogs());

    }
}
