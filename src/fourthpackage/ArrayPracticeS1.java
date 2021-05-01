package fourthpackage;

public class ArrayPracticeS1 {

    public static void main(String[] args) {

        String name = "Shahlla, Kamal, Zahra, Maira";
       // System.out.println(name);


        String[] names = {"Shahlla", "Kamal", "Zahra","Maira"};
        //System.out.println(names[2]);

        int [] years = {2022, 2023, 2024};

       // System.out.println(years[0]);

        Object [] everything = {"USA", 2021,true};

        Object yearFromEverything = everything[1];
       // System.out.println(yearFromEverything);

        for(int i=0;i<names.length;i++){
            String dataOnLoop = names[i];
            System.out.println(dataOnLoop);
        }
    }
}

