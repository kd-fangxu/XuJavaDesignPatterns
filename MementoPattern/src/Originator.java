/**
 * Created by developer on 2016/11/4.
 */
public class Originator {
    String me_state1;
    String me_state2;
    Memento memento;
    public void initMento(){//发起人获取了初始的备忘录的数据 管理者保存备忘录实例或数据  发起人对自身从备忘录赋值的数据各种折腾后  可以通过管理者保存的备忘录数据  恢复修改前状态
        if(memento==null){
            memento=new Memento();
            memento. me_state1="1";
            memento.me_state2="2";
            me_state1=memento.me_state1;
            me_state2=memento.me_state2;
        }
    }

    public void modifyMemento(){
        if (memento!=null){

            me_state1="1.1";
            me_state2="2.2";

        }
    }

    public void recoverData(Memento m){
        me_state1=m.me_state1;
        me_state2=m.me_state2;
    }

    public void show(){
        System.out.println( toString());
       ;
    }
    @Override
    public String toString() {
        return "Originator{" +
                "me_state1='" + me_state1 + '\'' +
                ", me_state2='" + me_state2 + '\'' +
                ", memento=" + memento +
                '}';
    }
}
