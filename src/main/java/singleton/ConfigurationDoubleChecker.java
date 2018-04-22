package singleton;

public class ConfigurationDoubleChecker {
    private ApplicationLevels logLevel;
    private String logDirectory;
    private String applicationStatus;
    private int executions;

    private static ConfigurationDoubleChecker ourInstance;

    public static ConfigurationDoubleChecker getInstance()
    {
        if (ourInstance == null) {
            synchronized (ourInstance) {
                if (ourInstance == null) {
                    ourInstance = new ConfigurationDoubleChecker();
                }
            }
        }
        ourInstance.executions++;
        return ourInstance;
    }

    public ApplicationLevels getLogLevel() {
        executions++;
        return logLevel;
    }

    public void setLogLevel(ApplicationLevels logLevel) {
        executions++;
        this.logLevel = logLevel;
    }

    public String getLogDirectory() {
        executions++;
        return logDirectory;
    }

    public void setLogDirectory(String logDirectory) {
        executions++;
        this.logDirectory = logDirectory;
    }

    public String getApplicationStatus() {
        executions++;
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        executions++;
        this.applicationStatus = applicationStatus;
    }

    public int getExecutions() {
        executions++;
        return executions;
    }

    private ConfigurationDoubleChecker() {
        executions = 0;
    }
}
