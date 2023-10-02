package ArchitecturePO_SEM2;

public abstract class ItemFabric {
    public void openRewgard(){
        IGameItem gameItem = createItem();

        gameItem.open();
    }

    public abstract IGameItem createItem();
}