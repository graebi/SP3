package de.tg76.sp3;


/*
 * Fragment1 - Displays live car park data on fragment 1
 * Thorsten Graebner
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;

@SuppressWarnings("ALL")
public class Fragment1 extends Fragment {

    //Variable declaration
    Button buttonGet;
    ListView list;
    TextView id;
    TextView name;
    TextView spaces;

    //Creating ArrayList of type HashMap
    ArrayList<HashMap<String, String>> oslist = new ArrayList<>();

    //URL to get JSON Array
    private static String url = "http://ec2-52-17-188-91.eu-west-1.compute.amazonaws.com/FetchTest.php";

    //JSON Node Names
    public static final String Key_ARRAY = "result";
    public static final String KEY_ID = "CARPARK_ID";
    public static final String KEY_NAME = "CARPARKNAME";
    public static final String KEY_SPACES = "SPACE";

    //Creating JSONArray
    JSONArray cities = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragment1, container, false);

    }


}