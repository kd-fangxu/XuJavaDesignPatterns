/**
 * Created by developer on 2016/11/4.
 */
public class App {


    public static void main(String[] args) {
        Originator originator=new Originator();
        originator.initMento();
        originator.show();

        CareTaker careTaker=new CareTaker();
        careTaker.setMemento(originator.memento);


        originator.modifyMemento();//各种折腾数据
        originator.show();

        originator.recoverData(careTaker.getMemento());
        originator.show();

    }
}
