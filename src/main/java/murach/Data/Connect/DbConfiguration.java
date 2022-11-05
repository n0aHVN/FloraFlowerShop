package murach.Data.Connect;

public class DbConfiguration {
    public static final String HOST_NAME = "ec2-52-1-17-228.compute-1.amazonaws.com";
    public static final String DB_NAME = "d7qr0iu7igc22g";
    public static final String DB_PORT = "5432";
    public static final String USER_NAME = "aikzlnpvrofvmj";
    public static final String PASSWORD = "a7b26f06c32229dd0ffc890c398e78d7ff6cec029605830d833b7d9755353bdc";
    public static final String DB_DRIVER = "org.postgresql.Driver";
    public static final int DB_MIN_CONNECTIONS = 2;
    public static final int DB_MAX_CONNECTIONS = 4;
    // jdbc:mysql://hostname:port/dbname
    public static final String CONNECTION_URL = "jdbc:postgresql://" + HOST_NAME + ":" + DB_PORT + "/" + DB_NAME;
     
    private DbConfiguration() {
        super();
    }
}
