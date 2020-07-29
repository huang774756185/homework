package stage_02.MyPhone;

/*将通话套餐类和上网套餐类中相同的特征和行为提取出来组成抽象套餐类*/
public abstract class SamePackage {
    protected double cost;// protected修饰供子类访问
    public double getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }


    public abstract void show();
}
