package factory;

public class Check {
    public static void main(String[] args) {
        Site tomskFederation = new TomskFederationSite();
        tomskFederation.newComp(CompType.TOMSKFEDIRATIONTNG);

        Site rusFederation = new RussianFederationSite();
        rusFederation.newComp(CompType.RUSSIANFEDIRATIONWORLDCOMP);
    }
}
