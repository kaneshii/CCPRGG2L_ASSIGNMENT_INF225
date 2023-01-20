public class weapon {
     
    String name;
    int damage;
    String rarity;

    public void saytheName() {
        System.out.println("Your weapon is " + name);
    }
    
    public void saytheDamage() {
        System.out.println("The damage is " + damage);
    }

    public void saytheRarity() {
        System.out.println("The rarity is " + rarity);
    }

    public void AddDamage(int additionalDamage){
        int newDamage = this.damage + additionalDamage;

        System.out.println("Damage Increased from" + damage + "to" + additionalDamage);

        this.damage = newDamage;

    }
    public String shownameandRarity() {
        return this.name + " " + this.rarity;
    }

}