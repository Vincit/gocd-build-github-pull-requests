package in.ashwanthkumar.gocd.github.util.field;

public enum Secure implements FieldBoolean {
    YES, NO;

    @Override
    public boolean toBoolean() {
        return this == YES;
    }
}
