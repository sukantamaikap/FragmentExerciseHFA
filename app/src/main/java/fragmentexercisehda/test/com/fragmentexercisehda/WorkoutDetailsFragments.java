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
public class WorkoutDetailsFragments extends Fragment
{
    private int _workoutId;
    private static final String _WORKOUT_KEY = "workoutId";

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        if(savedInstanceState != null) {
            this._workoutId = (int)savedInstanceState.getLong(_WORKOUT_KEY);
        }
        return inflater.inflate(R.layout.workout_details_fragment, container, false);
    }

    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Workout workout = Workout.workouts[this._workoutId];
            title.setText(workout.getName());

            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(workout.getDescription());
        }
    }

    public void setWorkoutId(long workoutId) {
        this._workoutId = (int)workoutId;
    }

    public void onSaveInstanceState(Bundle saveInstanceState) {
        saveInstanceState.putLong(_WORKOUT_KEY, _workoutId);
    }
}