public class Student
    {
        private int ID;
        private String Imie;
        private String Nazwisko;
        public static int counter = 0;

        Student(int id, String imie, String nazwisko)
        {
            ID = id;
            Imie = imie;
            Nazwisko = nazwisko;
            counter++;
        }

        public void display_data()
        {
            System.out.println(ID + " " + Imie + " " + Nazwisko);
        }

        int get_id()
        {
            return ID;
        }

        String get_Nazwisko()
        {
            return Nazwisko;
        }

        String get_Imie()
        {
            return Imie;
        }

        public static int how_many()
        {
            return counter;
        }
    }