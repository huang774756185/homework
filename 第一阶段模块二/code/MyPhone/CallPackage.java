package stage_02.MyPhone;
/*
    电话套餐
*/

public class CallPackage extends SamePackage implements CallService {
    private float callTime; // 通话时长
    private int messageCount;// 短信条数


    // 构造方法
    public CallPackage(){}
    public CallPackage(float callTime, int messageCount, double cost){
        super();
        this.callTime = callTime;
        this.messageCount = messageCount;
        this.cost = cost;
    }
    public float getCallTime() {
        return callTime;
    }

    public void setCallTime(float callTime) {
        this.callTime = callTime;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(int messageCount) {
        this.messageCount = messageCount;
    }

    // 行为
    public void show(){
        System.out.println("套餐信息：当前套餐通话时长为"+this.getCallTime()+"分钟， 短信条数为"+
                this.getMessageCount()+"， 每月资费为"+this.getCost()+"元");
    }
    // 通话方法。
    @Override
    public void callService(float callTime, PhoneCard phoneCard) {
        System.out.println("通话服务：用户"+phoneCard.getName()+"卡号"+phoneCard.getCardNum()+"通话"+callTime+"分钟");
        //卡通话时间累加
        phoneCard.setCallTime(phoneCard.getCallTime()+callTime);
        //套餐通话时间剩余
        this.callTime=this.callTime-callTime;
        //卡消费金额
        phoneCard.setRemainder( phoneCard.getRemainder() - this.cost);

    }
}
