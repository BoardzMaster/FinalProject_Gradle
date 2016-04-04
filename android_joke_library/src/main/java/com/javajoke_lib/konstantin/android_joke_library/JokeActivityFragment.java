package com.javajoke_lib.konstantin.android_joke_library;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class JokeActivityFragment extends Fragment {

    public final static String EXTRA_JOKE = "com.udacity.gradle.builditbigger.JOKE";

    public JokeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bundle arguments = getArguments();
        View rootView = inflater.inflate(R.layout.fragment_main_lib, container, false);

        if (arguments != null) {

            TextView jokeView = (TextView) rootView.findViewById(R.id.joke_text);
            jokeView.setText(arguments.getString(JokeActivity.EXTRA_JOKE));

        }

        return rootView;

    }
}
