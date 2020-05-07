package com.example.monitoringsystem.ui.humidity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.monitoringsystem.R;
import com.example.monitoringsystem.ui.co2.CO2ViewModel;

public class HumidityFragment extends Fragment {

    private HumidityViewModel humidityViewModel;

    public static HumidityFragment newInstance() {
        return new HumidityFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        humidityViewModel = new ViewModelProvider(this).get(HumidityViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tab_humidity, container, false);

        return root;
    }
}
