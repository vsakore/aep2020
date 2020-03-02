package edu.berkeley.aep;

public enum Unit {

    INCHES(1, 0, "Inches", UnitType.LENGTH),
    FEET(12, 0, "Feet", UnitType.LENGTH),
    YARD(36, 0, "Yard", UnitType.LENGTH),
    MILE(1760 * 36, 0, "Mile", UnitType.LENGTH),
    TSP(1, 0, "Tsp", UnitType.VOLUME),
    TBSP(3, 0, "Tbsp", UnitType.VOLUME),
    OZ(6, 0, "Tsp", UnitType.VOLUME),
    CUP(48, 0, "Tsp", UnitType.VOLUME),
    FAHRENHEIT(5, -32, "F", UnitType.TEMPERATURE),
    CELSIUS(9, 0, "C", UnitType.TEMPERATURE);

    private enum UnitType { LENGTH, VOLUME, TEMPERATURE; }

    private final int inBaseUnits;
    private final int offset;
    private final UnitType type;
    private final String name;

    Unit(int inBaseUnits, int offset, String name, UnitType type) {
        this.inBaseUnits = inBaseUnits;
        this.offset = offset;
        this.type = type;
        this.name = name;
    }

    int convertTo(Unit unit, int size) throws Exception {
        if (unit.type != type)
            throw new Exception("Cannot compare " + type + " to " + unit.type);
        return (size + offset) * inBaseUnits / unit.inBaseUnits - unit.offset;
    }

    @Override
    public String toString() {
        return name;
    }
}
