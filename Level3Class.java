final class Level3Class extends Level2Class {
    public Level3Class(String name, ComplexType complexField, ColorEnum colorEnum) {
        super(name, complexField, colorEnum);
    }

    @Override
    public void overloadedMethod() {
        System.out.println("Overloaded method with no parameters in Level3Class");
    }

    @Override
    public String toString() {
        return "Level3Class{" +
                "name='" + getName() + '\'' +
                ", complexField=" + getComplexField() +
                ", colorEnum=" + getColorEnum() +
                '}';
    }
}