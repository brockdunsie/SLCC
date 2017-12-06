public class Company2 {
        private Employee2 a, b, c;
        public Company2()
        {
            a = new Employee2();
            b = new Employee2();
            c = new Employee2();
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
            Company2 egor = new Company2();
            egor.dailyEmail();
        }
    }

