package codingBat.logic1;

public class Logic1 {
    /**
     * When squirrels get together for a party, they like to have cigars.
     * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
     * Unless it is the weekend, in which case there is no upper bound on the number of cigars.
     * Return true if the party with the given values is successful, or false otherwise.
     *
     */
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && isWeekend) {
            return true;
        } else return (cigars >= 40 && cigars <= 60);
    }

    /**
     * You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes,
     * in the range 0..10, and "date" is the stylishness of your date's clothes.
     * The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
     * If either of you is very stylish, 8 or more, then the result is 2 (yes).
     * With the exception that if either of you has style of 2 or less, then the result is 0 (no).
     * Otherwise, the result is 1 (maybe).
     *
     */
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        } else return 1;
    }

    /**
     * The squirrels in Palo Alto spend most of the day playing.
     * In particular, they play if the temperature is between 60 and 90 (inclusive).
     * Unless it is summer, then the upper limit is 100 instead of 90.
     * Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
     *
     */
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return (temp >= 60 && temp <= 100);
        } else return (temp >= 60 && temp <= 90);
    }

    /**
     * We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each).
     * Return true if it is possible to make the goal by choosing from the given bricks.
     * This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
     */
    public boolean makeBricks(int small, int big, int goal) {
        int bigRest = goal / 5;
        int smallRest = goal - (bigRest * 5);
        return (big >= bigRest && small >= smallRest);
    }
}