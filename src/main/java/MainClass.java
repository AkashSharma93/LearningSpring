import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by akash on 07/08/17.
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Performer p = (Performer) ctx.getBean("Duke");
        p.perform();
        p = (Juggler) ctx.getBean("Mike");
        p.perform();

        Stage s = (Stage) ctx.getBean("Stage");
        s.announce();
    }
}
