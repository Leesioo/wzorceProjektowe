package templateMethod;

public abstract class BakingTemplate {
    public final void bake() {
        prepareIngerdients();
        prepareCake();
        heatUpOwen();
        bakeCake();
        decorate();
    }

    protected abstract void decorate();

    protected abstract void bakeCake();

    protected abstract void heatUpOwen();

    protected abstract void prepareCake();

    protected abstract void prepareIngerdients();
}
