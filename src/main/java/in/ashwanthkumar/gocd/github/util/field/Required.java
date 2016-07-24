package in.ashwanthkumar.gocd.github.util.field;

public enum Required implements FieldBoolean {
    YES, NO;

    @Override
    public boolean toBoolean() {
        return this == YES;
    }
}
