package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Vishal", "Shukla");
        em1.setMailboxCapacity(120);
        System.out.println(em1.Showinfo());
        // System.out.println(em1.getMailboxCapacity());
        // em1.setAlternateEmail("abc@gmail.com");
        // System.out.println(em1.getAlternateEmail());
        // em1.changePassword("password");
        // System.out.println(em1.getPassword());
    }
}
