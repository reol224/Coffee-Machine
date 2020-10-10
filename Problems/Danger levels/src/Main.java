enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    int level;

    DangerLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
    public static DangerLevel findByLevel(int level) {
        for (DangerLevel value: values()) {
            if (level == (value.level)) {
                return value;
            }
        }
        return null;
}}