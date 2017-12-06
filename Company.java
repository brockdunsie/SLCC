public class Company {
    private Employee a, b, c;
    public Company()
    {
        a = new Employee();
        b = new Employee();
        c = new Employee();
    }
    public void email(String s){
        System.out.println("RSVP " + s);
    }
    public void dailyEmail()
    {
        a.email("Scrum meeting at 9:00 am. RSVP");
        b.email("Scrum meeting at 9:00 am. RSVP");
        c.email("Scrum meeting at 9:00 am. RSVP");
    }
    public static void main(String[]args)
    {
        Company egor = new Company();
        egor.dailyEmail();
    }
}
