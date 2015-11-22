package fragmentexercisehda.test.com.fragmentexercisehda;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WorkoutDetailsFragments workoutFragment = (WorkoutDetailsFragments)getFragmentManager().findFragmentById(R.id.deails_fragment);
        workoutFragment.set_workoutId(1);
    }
}
