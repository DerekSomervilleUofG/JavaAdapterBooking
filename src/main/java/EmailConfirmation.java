public class EmailConfirmation implements Confirmation{

    public void confirm(String name){
        System.out.println("Email to " + name);
    }
}
