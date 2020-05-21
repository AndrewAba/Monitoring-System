package com.example.monitoringsystem.ui.humidity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.monitoringsystem.R;

public class HumidityFragment extends Fragment {

    private static final String TAG = "API RESPONSE:";
    private TextView temp;
    private Button button;
    private HumidityViewModel humidityViewModel;
    private String data;


    public static HumidityFragment newInstance() {
        return new HumidityFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        humidityViewModel = new ViewModelProvider(this).get(HumidityViewModel.class);


        humidityViewModel.init();

        humidityViewModel.getData().observe(this, data -> {

            this.data = data.toString();
            System.out.printf(this.data);
            Log.d(TAG,this.data);
            temp.setText(data.toString());

        });


    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_temperature, container, false);

        temp = (TextView) view.findViewById(R.id.dataTextView);
        return view;
    }

}
