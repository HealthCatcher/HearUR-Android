package com.hsfa.hearur_android.ui.diagnosis;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DiagnosisViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DiagnosisViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}