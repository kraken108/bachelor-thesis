package Tests;

public class ServerInfo {
    private final static String serverIp = "localhost";
    private final static String SFTPUsername = "jakdan";
    private final static String SFTPPassword = "Daggen123";

    public static String getServerIp(){
        return serverIp;
    }

    public static String getSFTPUsername(){
        return SFTPUsername;
    }

    public static String getSFTPPassword(){
        return SFTPPassword;
    }
}
