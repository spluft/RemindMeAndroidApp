package ru.spluft.remindmeandroidapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.spluft.remindmeandroidapp.R;

public class BirthdayFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_example;

    public static BirthdayFragment getInstance(Context context) {
        Bundle bundle = new Bundle();
        BirthdayFragment fragment = new BirthdayFragment();
        fragment.setArguments(bundle);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_birthday));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
