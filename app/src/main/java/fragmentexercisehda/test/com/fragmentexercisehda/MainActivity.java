package fragmentexercisehda.test.com.fragmentexercisehda;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements WorkoutListListener
{

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void itemClicked (long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if(fragmentContainer != null) {
            WorkoutDetailsFragments detailsFragments = new WorkoutDetailsFragments();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            detailsFragments.setWorkoutId(id);
            fragmentTransaction.replace(R.id.fragment_container, detailsFragments);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            fragmentTransaction.commit();
        } else {
            Intent intent = new Intent(this, WorkoutDetailsActivity.class);
            intent.putExtra(WorkoutDetailsActivity.EXTRA_WORKOUT_ID, (int)id);
            startActivity(intent);
        }
    }
}
