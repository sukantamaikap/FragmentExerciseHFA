package fragmentexercisehda.test.com.fragmentexercisehda;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class StopwatchFragment extends Fragment {
    private static final String KEY_SECONDS = "Seconds";
    private static final String KEY_RUNNING ="Running";
    private static final String KEY_WAS_RUNNING = "Was_Running";

    private int _seconds = 0;
    private boolean _running;
    private boolean _wasRunning;

    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        if(savedInstance != null) {
            this._seconds = savedInstance.getInt(KEY_SECONDS);
            this._running = savedInstance.getBoolean(KEY_RUNNING);
            this._wasRunning = savedInstance.getBoolean(KEY_WAS_RUNNING);
        }
        if (this._wasRunning) {
            this._running = true;
        }
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_stopwatch, container, false);
        runTimer(layout);
        return layout;
    }

    @Override
    public void onPause() {
        super.onPause();
        this._wasRunning = this._running;
        this._running = false;
    }

    @Override
    public void onResume() {
        super.onResume();
        if(this._wasRunning) {
            this._running = true;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle saveInstance) {
        saveInstance.putInt(KEY_SECONDS, this._seconds);
        saveInstance.putBoolean(KEY_RUNNING, this._running);
        saveInstance.putBoolean(KEY_WAS_RUNNING, this._wasRunning);
    }

    private void runTimer (View layout) {

    }

}
