class Level1Class {
    private String name;
    private ComplexType complexField;
    private ColorEnum colorEnum;

    public Level1Class(String name, ComplexType complexField, ColorEnum colorEnum) {
        this.name = name;
        this.complexField = complexField;
        this.colorEnum = colorEnum;
    }

    public String getName() {
        return name;
    }

    public ComplexType getComplexField() {
        return complexField;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    @Override
    public String toString() {
        return "Level1Class{" +
                "name='" + name + '\'' +
                ", complexField=" + complexField +
                ", colorEnum=" + colorEnum +
                '}';
    }
}