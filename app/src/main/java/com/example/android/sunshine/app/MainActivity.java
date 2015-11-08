package com.example.android.sunshine.app;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            String [] fakeData = new String[12];
            fakeData[0] = "Today-Sunny-88/63";
            fakeData[1] = "Tomorrow-Rainy-21/53";
            fakeData[2] = "Weds-Foggy-42/53";
            fakeData[3] = "Thurs-Cloudy-12/75";
            fakeData[4] = "Fri-Sunny-17/74";
            fakeData[5] = "Sat-Foggy-63/12";
            fakeData[6] = "Today-Sunny-88/63";
            fakeData[7] = "Tomorrow-Rainy-21/53";
            fakeData[8] = "Weds-Foggy-42/53";
            fakeData[9] = "Thurs-Cloudy-12/75";
            fakeData[10] = "Fri-Sunny-17/74";
            fakeData[11] = "Sat-Foggy-63/12";

            ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview,fakeData);
            listView.setAdapter(adapter);

            return rootView;
        }
    }
}
