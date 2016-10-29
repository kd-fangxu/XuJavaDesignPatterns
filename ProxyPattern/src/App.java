/**
 * Created by developer on 2016/10/17.
 */
public class App {
    public static void main(String[] args) {
        Proxy proxy=new Proxy(new RealWorker());
        proxy.doWorkA();;
        proxy.doWorkB();
    }
}
