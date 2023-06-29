package utilities.constants;

public class GeneralConstants {
    public static final String CONSTANT_CLASS = "The class can't be instantiated because is a util class";
    public static final String USERS_CSV_PATH = "src/test/resources/data/adminUsers.csv";

    private GeneralConstants() {
        throw new IllegalStateException(CONSTANT_CLASS);
    }
}
