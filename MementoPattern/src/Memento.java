/**
 * Created by developer on 2016/11/4.
 */
public class Memento {
    String me_state1;
    String me_state2;

    public String getMe_state1() {
        return me_state1;
    }

    public void setMe_state1(String me_state1) {
        this.me_state1 = me_state1;
    }

    public String getMe_state2() {
        return me_state2;
    }

    public void setMe_state2(String me_state2) {
        this.me_state2 = me_state2;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "me_state1='" + me_state1 + '\'' +
                ", me_state2='" + me_state2 + '\'' +
                '}';
    }
}
