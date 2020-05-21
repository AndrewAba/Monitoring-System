package com.example.monitoringsystem.ui.humidity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.monitoringsystem.repository.Repository;
import com.example.monitoringsystem.model.Parameters;

import java.util.List;

public class HumidityViewModel extends ViewModel {
    private Repository repository;
    private MutableLiveData<List<Parameters>> mData;

    public void init(){
        if(mData != null){
            return;
        }
        repository = Repository.getInstance();
    }

    public HumidityViewModel(){
        repository = Repository.getInstance();
        mData=repository.getData();
    }

    public void updateData() {
        repository.updateData();
    }

    public LiveData<List<Parameters>> getData() {
        updateData();
        mData=repository.getData();
        return mData;
    }
}
