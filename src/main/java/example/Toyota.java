package example;

// Child  -  Sub
public class Toyota implements IPractice, IPracticeTwo{


    public static void main(String[] args) {
        Toyota t = new Toyota();
        t.doors();

        Honda h = new Honda();
        h.sound();
    }

    public void sound() {
        System.out.println("sound from Toyota");
    }
    public void doors() {
        System.out.println("doors from Toyota");
    }
    public void wheels() {
        System.out.println("wheels from Toyota");
    }

    public void roof() {
        System.out.println("Roof from Toyota");
    }
}
