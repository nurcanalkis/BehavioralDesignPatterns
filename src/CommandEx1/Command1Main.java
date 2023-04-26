package CommandEx1;

public class Command1Main
{
    public static void main(String[] args) {
        Document doc = new Document();
        ActionListenerCommand clickOpen = new ActionOpen(doc);
        ActionListenerCommand clickSave = new ActionSave(doc);
        MenuOptions menu = new MenuOptions(clickOpen, clickSave);

        menu.clickOpen();
        menu.clickSave();

    }
}
