package ArchitecturePO_SEM2;

public class RubyGenerator extends ItemFabric{
    @Override
    public IGameItem createItem() {
        System.out.println("Создал новый сундук с рубинами");
        return new RubyReward();
    }
}
