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

        Performer p1 = (Juggler) ctx.getBean("dupPerf");
        Performer p2 = (Juggler) ctx.getBean("dupPerf");
  //      ApplicationContext dupCtx = new ClassPathXmlApplicationContext("config.xml");
  //      Performer dp1 = (Juggler) dupCtx.getBean("dupPerf");
        System.out.println("p1 == p2: " + (p1 == p2));
  //      System.out.println("p1 == dp1: " +  (p1 == dp1));

        Performer p3 = (Juggler) ctx.getBean("uniquePerf");
        Performer p4 = (Juggler) ctx.getBean("uniquePerf");
        System.out.println("p3 == p4: " + (p3 == p4));

        Auditorium a = (Auditorium) ctx.getBean("auditorium");
    }
}
