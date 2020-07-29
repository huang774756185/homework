package stage_02.MyPhone;

public class Test {
    public static void main(String[] args) {
        CallPackage callPackage = new CallPackage();
        callPackage.setCallTime(3.5f);
        callPackage.setMessageCount(10);
        callPackage.setCost(300.1);
        callPackage.show();

        OnlinePackage onlinePackage = new OnlinePackage();
        onlinePackage.setCost(300.4);
        onlinePackage.setFlow(56.34f);
        onlinePackage.show();
    }
}
