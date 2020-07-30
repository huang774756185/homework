package stage_02.MyPhone;

public class Test {
    public static void main(String[] args) {
        // 卡类型
        EnumPhoneCardType cardType = EnumPhoneCardType.MICRO;
        // 实例化电话卡
        PhoneCard phoneCard = new PhoneCard(cardType.getCardType(),200,
                "huanghuang","aaa",100,0,0);
        phoneCard.show();
        // 通话套餐
        CallPackage callPackage = new CallPackage();
        callPackage.setCallTime(3.5f);
        callPackage.setMessageCount(10);
        callPackage.setCost(300.1);
        callPackage.show();
        // 流量套餐
        OnlinePackage onlinePackage = new OnlinePackage();
        onlinePackage.setCost(300.4);
        onlinePackage.setFlow(56.34f);
        onlinePackage.show();

        // 通话套餐多态
        SamePackage callPackage1 = new CallPackage(100,50,100);
        callPackage1.show();
        // 流量套餐多态
        SamePackage onlinePackage1 = new OnlinePackage(100,100);
        onlinePackage1.show();
        // 通话服务
        ((CallPackage)callPackage1).callService(100,phoneCard);
        // 上网流量服务
        ((OnlinePackage)onlinePackage1).onlineService(300,phoneCard);
        // 实例化用户消费
        UserConsumption uc = new UserConsumption(phoneCard.getCallTime(), phoneCard.getFlow(),
                callPackage1.getCost()+onlinePackage1.getCost());

        uc.show();

    }
}
