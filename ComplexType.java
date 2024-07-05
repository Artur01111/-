class ComplexType {
    private String detail;

    public ComplexType(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    @Override
    public String toString() {
        return "ComplexType{" +
                "detail='" + detail + '\'' +
                '}';
    }
}
