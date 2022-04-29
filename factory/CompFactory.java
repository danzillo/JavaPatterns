
package factory;

public class CompFactory {
    public Competition createComp(CompType type) {
        Competition comp = null;

        //какой тип сорев - такой и экземпляр класса
        switch (type) {
            case TOMSKFEDIRATIONTNG -> comp = new TomskFedirationTng();

            case RUSSIANFEDIRATIONTNG -> comp = new RussianFedirationTng();

            case TOMSKFEDIRATIONLOCLCOMP -> comp = new TomskFedirationLocalComp();

            case RUSSIANFEDIRATIONWORLDCOMP -> comp = new RussianFedirationWorldComp();

        }
        return comp;
    }
}
