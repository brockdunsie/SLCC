public class Employee2 {
        private static int num_of_Employees = 0;
        private final int ID;
        private Company2 boss;
        public Employee2()
        {
            num_of_Employees++;
            ID = num_of_Employees;
        }
        public void email(String s)
        {
            System.out.println(ID + " has been emailed:\n" + s);
            reply();
        }
        public void reply()
        {
            boss.email("I'll be there. " + ID);
        }
    }

