package stage_02.MyPhone;

public enum  EnumPhoneCardType {
    BIG("大卡"),SMALL("小卡"),MICRO("微型卡");
    private final String cardType ;
    private EnumPhoneCardType(String cardType) {
        this.cardType = cardType;
    }
    public String getCardType(){
        return this.cardType;
    }
}
