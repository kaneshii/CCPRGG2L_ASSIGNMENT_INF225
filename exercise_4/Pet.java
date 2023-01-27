import javax.sound.midi.SysexMessage;

public class Pet {

    String name;
    Person owner;

    Pet(String petName, Person ownerName) {
        this.name = petName;
        this.owner = ownerName;
    }
        void showOwnerName(){
            System.out.println("my name is " + this.name + " my owner is " + owner.name);
        }
    }
    

    

