package stage_02.MyPhone;

public class OnlinePackage extends SamePackage implements OnlineService {
    private float flow;// 流量

    // 构造方法
    public OnlinePackage(){}
    public OnlinePackage(float flow, double cost){
        super();
        this.flow = flow;
        this.cost = cost;
    }

    public float getFlow() {
        return flow;
    }

    public void setFlow(float flow) {
        this.flow = flow;
    }


    // 行为
    public void show(){
        System.out.println("套餐信息：当前上网流量为"+this.getFlow()+"M， 每月资费为"+this.getCost()+"元");
    }

    @Override
    public void onlineService(float flow, PhoneCard phoneCard) {
        System.out.println("上网服务：用户"+phoneCard.getName()+"卡号"+phoneCard.getCardNum()+"上网"+flow+"M流量");
        phoneCard.setFlow(phoneCard.getFlow()+flow);
        this.flow=this.flow-flow;
        //卡消费金额
        phoneCard.setRemainder(phoneCard.getRemainder()-this.cost);

    }
}
