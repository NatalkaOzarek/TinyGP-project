enum Operation {
    ADD (110),
    SUB (111),
    MUL (112),
    DIV (113);
    private final int value;
    Operation(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    //TODO Da radę wykorzystać tego enuma?
}
