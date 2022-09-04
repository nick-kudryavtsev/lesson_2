package lt.nick;

public class Friend {
    private RelationType type;

    public Friend(RelationType type){
        this.type = type;
    }

    public void sayHello(RelationType relationType){
        switch (relationType){
            case ENEMY:
                System.out.println("Everybody wants to be my enemy...");
                break;

            case FRIEND:
                System.out.println("I've heart myself today...");
                break;

            case REGULAR:
                System.out.println("Have a nice day!");
                break;

            default:
                System.out.println("really don't know u");
        }
    }

    public RelationType getRelationType(){
        return this.type;
    }
}
