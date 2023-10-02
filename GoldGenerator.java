package ArchitecturePO_SEM2;
public class GoldGenerator extends ItemFabric{
    @Override
    public IGameItem createItem() {
        System.out.println("Создал новый сундук с золотом");
        return new GoldReward();
    }
}
