package fragmentexercisehda.test.com.fragmentexercisehda;

/**
 * Created by smaikap on 11/19/15.
 */
public class Workout {
    private String _name;
    private String _description;

    public static Workout[] workouts = {
            new Workout("The Limb Loosner","5 handstand pushups\n10 1-leged squats\n15 Pull-ups"),
            new Workout("Core Agony","100 Pull-ups\n100 Push ups\n100 Sit-ups\n100 Squats"),
            new Workout("The Wimp Special","5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strenght & Lenght","500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };

    public Workout (String _name, String _description) {
        this._name = _name;
        this._description = _description;
    }

    public String get_name () {
        return this._name;
    }

    public String get_description () {
        return this._description;
    }

    public String toString() {
        return this._name;
    }
}
