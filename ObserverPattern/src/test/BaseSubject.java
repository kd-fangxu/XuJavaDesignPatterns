package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by developer on 2016/11/2.
 */
public abstract class BaseSubject<T extends BaseObserver> {
    List<T> observerList = new ArrayList<T>();

    public void Attach(T observer) {
        observerList.add(observer);

    }
    public void detach(T observer) {

        observerList.remove(observer);
    }

    public void publishAll()

    {
        for (T t : observerList
                ) {
            t.update();
        }
    }



}
