package stage_02.MyPhone;

/*手机卡类 特征：卡类型、卡号、用户名、密码、账户余额、通话时长(分钟)、上网流量 行为：显示（卡号 + 用户名 + 当前余额*/
public class PhoneCard {
    private String cardType;
    private int cardNum;
    private String name;
    private String password;
    private double remainder;
    private float callTime;

    public float getFlow() {
        return flow;
    }

    public void setFlow(float flow) {
        this.flow = flow;
    }

    private float flow;
    //无参构造方法
    PhoneCard(){

    }
    //有参构造方法
    public PhoneCard(String cardType, int cardNum, String name, String password, double remainder, float callTime,
                     float netFlow) {
        super();
        this.cardType = cardType;
        this.cardNum = cardNum;
        this.name = name;
        this.password = password;
        this.remainder = remainder;
        this.callTime = callTime;
        this.flow = flow;
    }
    //show方法
    public void show() {
        System.out.println("卡信息：卡号为"+this.getCardNum()+" 用户名为"+this.getName()+" 当前余额为"+this.getRemainder());
    }

    public int getCardNum() {
        return cardNum;
    }
    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public double getRemainder() {
        return remainder;
    }
    public void setRemainder(double remainder) {
        this.remainder = remainder;
    }
    public float getCallTime() {
        return callTime;
    }
    public void setCallTime(float callTime) {
        this.callTime = callTime;
    }


}

