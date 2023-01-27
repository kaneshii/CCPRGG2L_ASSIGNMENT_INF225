import javax.xml.ws.Holder;

public class App {
    

    public static void main(String[] args) {

        Person friend = new Person("Tehrence Llenarez", 19 );

        Myself me = new Myself("Mark Joshua", 18 );

        Pet cat = new Pet("shinichi", friend);

        Car vehicle = new Car("bugatti", me);

        me.addFriend(friend);
        cat.showOwnerName();
        vehicle.showHolderName();




    }
}
