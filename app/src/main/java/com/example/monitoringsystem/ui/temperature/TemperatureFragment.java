package com.example.monitoringsystem.ui.temperature;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.monitoringsystem.R;
import com.example.monitoringsystem.ui.humidity.HumidityViewModel;

public class TemperatureFragment extends Fragment {

    private TemperatureViewModel temperatureViewModel;

    public static TemperatureFragment newInstance() {
        return new TemperatureFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        temperatureViewModel = new ViewModelProvider(this).get(TemperatureViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tab_temperature, container, false);

        return root;
    }

}
