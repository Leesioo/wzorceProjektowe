package singleton;

public class Main {
    public static void main(String[] args) {

        ConfigurationDoubleChecker instance1 = ConfigurationDoubleChecker.getInstance();
        System.out.println(instance1);
        instance1.setApplicationStatus("RUNNING");
        instance1.setLogDirectory("C:/");
        instance1.setLogLevel(ApplicationLevels.DEBUG);
        System.out.println(instance1.getExecutions());

        ConfigurationDoubleChecker instance2 = ConfigurationDoubleChecker.getInstance();
        System.out.println(instance2);
        System.out.println(instance2.getExecutions());

//        ConfigurationEager instance1 = ConfigurationEager.getInstance();
//        System.out.println(instance1);
//        instance1.setApplicationStatus("RUNNING");
//        instance1.setLogDirectory("C:/");
//        instance1.setLogLevel(ApplicationLevels.DEBUG);
//        System.out.println(instance1.getExecutions());
//
//        ConfigurationEager instance2 = ConfigurationEager.getInstance();
//        System.out.println(instance2);
//        System.out.println(instance2.getExecutions());
    }
}
