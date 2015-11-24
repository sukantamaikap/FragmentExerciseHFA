package fragmentexercisehda.test.com.fragmentexercisehda;


import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutListFragment extends ListFragment {

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        String[] names = new String[Workout.workouts.length];
        for(int i =0; i < names.length; i++) {
            names[i] = Workout.workouts[i].get_name();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
