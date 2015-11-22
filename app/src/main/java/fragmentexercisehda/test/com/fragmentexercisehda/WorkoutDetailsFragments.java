package fragmentexercisehda.test.com.fragmentexercisehda;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailsFragments extends Fragment {

    private int _workoutId;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.workout_details_fragment, container, false);
    }

    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Workout workout = Workout.workouts[this._workoutId];
            title.setText(workout.get_name());

            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(workout.get_description());
        }
    }

    public void set_workoutId (int _workoutId) {
        this._workoutId = _workoutId;
    }
}
