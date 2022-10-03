public class Main {

    public static void main(String[] args) {
        Wine Wine1 = new Wine("White Apple","Italy",1990);
        Wine Wine2 = new Wine("Elite","Spain",1960);
        Wine Wine3 = new Wine("Red & Sweet","Germany",2010);
        Wine [] Wines = {Wine1,Wine2,Wine3};

       int yearsOfAging1 = 2022 - Wine1.year;
        int yearsOfAging2 = 2022 - Wine2.year;
        int yearsOfAging3 = 2022 - Wine3.year;

            System.out.println(Wine1.name);
            System.out.println(Wine1.country);
            System.out.println(Wine1.year);
            System.out.println(yearsOfAging1);

            System.out.println(Wine2.name);
            System.out.println(Wine2.country);
            System.out.println(Wine2.year);
        System.out.println(yearsOfAging2);

            System.out.println(Wine3.name);
            System.out.println(Wine3.country);
            System.out.println(Wine3.year);
        System.out.println(yearsOfAging3);









    }
}