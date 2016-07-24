package in.ashwanthkumar.gocd.github.util.field;

public enum PartOfIdentity implements FieldBoolean {
    YES, NO;

    @Override
    public boolean toBoolean() {
        return this == YES;
    }
}
