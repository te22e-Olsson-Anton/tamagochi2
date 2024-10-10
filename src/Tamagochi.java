import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tamagochi
{
    int hunger = 0;
    int boredom = 0;

    List<String> words = new ArrayList<>();

    boolean isAlive = true;
    String name;





    public void feed()
    {


        if (hunger > 0)
        {
            hunger =+ 2;
            System.out.println(name + "är nu mindre hungrig. Hunger: " + hunger);
        }
        else
        {
            System.out.println(name + " är inte hungrig");
        }
    }
    public void hi()
    {
        if (words.isEmpty())
        {
            System.out.println(name + " har inte lärt sig några ord ännu.");
        } else
            {
            Random random = new Random();
            String randomWord = words.get(random.nextInt(words.size()));
            System.out.println(name + " säger: " + randomWord);
            reduceBoredom();
            }
        }
    public void teachWord(String Word)
    {
        words.add(Word);

        System.out.println(name + " har lärt sig ordet " + Word);
    }
    public void tick()
    {
        hunger++;
        boredom++;
    }
    public void printStats()
    {
        System.out.println("hunger är " + hunger);
        System.out.println("Boredom är " + boredom);
    }
    public void reduceBoredom()
    {
        if (boredom > 0)
        {
            boredom =+ 2;
            System.out.println(name + "har nu mindre tråkigt. Boredom: " + boredom);
        }
        else
        {
            System.out.println(name + " har inte tråkigt");
        }
    }
}