package br.com.leandromax.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WorkoutDetailFragment extends Fragment {

    private long workoutId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    public void setWorkoutId(long id) {
        this.workoutId = id;
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView(); // The getView() method gets the fragment's root view
        if (view != null) {
            Workout workout = Workout.workouts[(int) workoutId];
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            title.setText(workout.getName());
            description.setText(workout.getDescription());
        }
    }

    public WorkoutDetailFragment() {
        // Required empty public constructor
    }
}
