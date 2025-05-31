package hmmquiz;

public class App {
    public String getGreeting() {
        return "Welcome to HMMQuiz!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
