abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    @Override
    void write(){
        System.out.println("Writing");
    }
    @Override
    void refill(){
        System.out.println("Refilled");
    }
    void changeNib(){
        System.out.println("Changed Nib");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    void dance(){
        System.out.println("Dancing");
    }
}

abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends TelePhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("Lifiting...");
    }
    public void disconnect(){
        System.out.println("Disconnected...");
    }
}

interface TVRemote{
    void switchON();
    void switchOFF();
}

interface SmartTVRemote extends TVRemote{
    void playMusic();
    void playGames();
}

class TV implements TVRemote{
    public void switchON(){
        System.out.println("Turning ON");
    }
    public void switchOFF(){
        System.out.println("Turning OFF");
    }
    public void playMusic(){
        System.out.println("Playing Music...");
    }
    public void playGames(){
        System.out.println("Loading Games...");
    }
}

class Abstract1{
    public static void main(String[] args) {
        //reference of FountainPen class and object of FountainPen
        FountainPen ob1 = new FountainPen();
        //reference of Pen class and object of FountainPen
        Pen ob2 = new FountainPen();
    //  Pen ob3 = new Pen(); not alloweD
        ob1.write();
        ob1.refill();
        ob1.changeNib();
        ob2.write();
        ob2.refill();
    //  ob2.changeNib(); not allowed

        //reference of Human class and object of human class
        Human h1 = new Human(); 
        //reference of Monkey class and object of human class
        Monkey h2 = new Human();
        //reference of BasicAnimal interface and object of human class
        BasicAnimal h3 = new Human();
    //  
        h1.bite();
        h1.jump();
        h1.dance();
        h1.eat();
        h1.sleep();

        h2.bite();
        h2.jump();
    //  h2.dance(); not allowed  
    //  h2.eat();   not allowed
    //  h2.sleep(); not allowed

    //  h3.jump();  not allowed
    //  h3.bite();  not allowed
    //  h3.dance()  not allowed;
        h3.eat();
        h3.sleep();

    }
}