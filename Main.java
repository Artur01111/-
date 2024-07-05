public class Main {
    public static void main(String[] args) {

        Level2Class objectA = new Level2Class("Example 2", new ComplexType("Complex 1"), ColorEnum.BLACK);
        Level3Class objectB = new Level3Class("Example 3B", new ComplexType("Complex 2"), ColorEnum.BROWN);
        Level3Class objectC = new Level3Class("Example 3C", new ComplexType("Complex 3"), ColorEnum.WHITE);

        System.out.println(objectA);
        System.out.println("     ");
        System.out.println(objectB);
        System.out.println("     ");
        System.out.println(objectC);
        System.out.println("     ");

        objectA.overloadedMethod();
        objectA.overloadedMethod("Hello");
        objectA.overloadedMethod(42);

        objectB.overloadedMethod();
        objectB.overloadedMethod("World");
        objectB.overloadedMethod(24);
    }
}
