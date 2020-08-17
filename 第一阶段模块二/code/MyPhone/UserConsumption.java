package stage_02.MyPhone;

public class UserConsumption {
    /*特征：统计通话时长、统计上网流量、每月消费金额 */
    private float callTime;
    private float flow;
    private double cost;
    public UserConsumption(){}
    public UserConsumption(float callTime,float flow, double cost){
        super();
        this.callTime = callTime;
        this.flow = flow;
        this.cost = cost;
    }

    public float getCallTime() {
        return callTime;
    }

    public void setCallTime(float callTime) {
        this.callTime = callTime;
    }

    public float getFlow() {
        return flow;
    }

    public void setFlow(float flow) {
        this.flow = flow;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void show(){
        System.out.println("该用户统计通话时长为"+this.getCallTime()+" 统计上网流量为"+this.getFlow()+" 每月消费金额为"+this.getCost());
    }
}
