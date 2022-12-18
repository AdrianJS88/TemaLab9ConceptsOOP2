public class PhoneMenu {
    public static void main(String[] args) {
        //Abstraction
        System.out.println("Phone button menu :");

        VolButton volbutton = new VolButton();
        volbutton.button();
        volbutton.buttonType();
        System.out.println("  ");
        HomeButton homeButton = new HomeButton();
        homeButton.button();
        homeButton.buttonType();

    }
}
