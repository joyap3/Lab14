/**
 * Created by joyapuryear on 7/20/17.
 */
public class TestProgramConfig {
    public static void main(String[] args) {
        ProgramConfiguration instance = ProgramConfiguration.getInstance();
        instance.setConnectionLimit(1);
        instance.setPortNumber(2);
        instance.setTimeout(3);
        instance.setUrl("https://www.grandcircus.co");

        System.out.println(instance.getConnectionLimit());
        System.out.println(instance.getPortNumber());
        System.out.println(instance.getTimeout());
        System.out.println(instance.getUrl());

    }
}
