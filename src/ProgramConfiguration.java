/**
 * Created by joyapuryear on 7/20/17.
 */
public class ProgramConfiguration {
    public int connectionLimit;
    public int portNumber;
    public String url;
    public int timeout;
    private static ProgramConfiguration instance = null;

    //Make a private constructor so that instances can't be created outside the class.
    private ProgramConfiguration(){};

    //getters and setters
    public int getConnectionLimit() {
        return connectionLimit;
    }

    public void setConnectionLimit(int connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    //getInstance method to create a programConfiguration if there isn't one.
    public static ProgramConfiguration getInstance() {
        if (instance == null){
            instance = new ProgramConfiguration();
        }
            return instance;
        }
    }

