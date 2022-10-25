import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] values = new int[100];
        Random gen = new Random();

        for (int l = 0; l < values.length; l++)
            values[l] = gen.nextInt(100) + 1;

        for (int l = 0; l < values.length; l++)
            System.out.printf("%3d", values[l]);

        String[] names = {"Tom", "Dick", "Harry"};

        String[] items = new String[100];

        int itemCount = 0;
        items[0] = "Radio";
        itemCount++;

        System.out.println(names.length);

        System.out.println(names[0]); //Tom


        //traversal - list all the elements in order
        for (int r = 0; r < names.length; r++)
            System.out.println(names[r]);

        for (String r : names)
            System.out.println(r);

        int sum = 0;
        for (int l = 0; l < values.length; l++)
            sum += values[l];

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + sum / values.length);

        int min = values[0];
        int max = values[0];
        for (int l = 0; l < values.length; l++) {
            if (values[l] < min)
                min = values[l];
            if (values[l] > max)
                max = values[l];
        }
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);


        //Search algorithms

        int target = 53;

        for (int t = 0; t < values.length; t++) {
            if (values[t] == target)
                System.out.println("Found at: " + t);
        }
        System.out.println("Finished search");

        //find first - stop search after finding

        boolean found = false;
        target = 53;

        for (int t = 0; t < values.length; t++) {
            if (values[t] == target)
                System.out.println("Found at: " + t);
            found = true;
            break;
        }
        System.out.println("Finished search");

        //write a loop that traverses backwards to implement find last
        boolean found1 = false;
        target = 53;


        for (int t=values.length-1; t>=0; t--)
        {
            if(values[t] == target)
            {
                System.out.println("Found at: " + t);
                found1 = true;
                break;
            }
        }
        System.out.println("Finished search");
        if (!found1)
        {
            System.out.println("Couldnt find");
        }

    }
}