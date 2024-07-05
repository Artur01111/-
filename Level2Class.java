class Level2Class extends Level1Class {
    public Level2Class(String name, ComplexType complexField, ColorEnum colorEnum) {
        super(name, complexField, colorEnum);
    }

    public void overloadedMethod() {
        System.out.println("Overloaded method with no parameters");
    }

    public final void overloadedMethod(String message) {
        System.out.println("Overloaded method with String: " + message);
    }

    public void overloadedMethod(int number) {
        System.out.println("Overloaded method with int: " + number);
    }

    @Override
    public String toString() {
        return "Level2Class{" +
                "name='" + getName() + '\'' +
                ", complexField=" + getComplexField() +
                ", colorEnum=" + getColorEnum() +
                '}';
    }
}
