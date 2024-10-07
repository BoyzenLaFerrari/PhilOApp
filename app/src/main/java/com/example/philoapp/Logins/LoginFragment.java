package com.example.philoapp.Logins;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.philoapp.R;
import com.example.philoapp.databinding.ActivityLoginsBinding;
import com.google.firebase.auth.FirebaseAuth;

public class LoginFragment extends Fragment {



    public LoginFragment() {
        // required empty public constructor.
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {



        {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        view.findViewById(R.id.txtUpperFragLogins);
        return view;
    }

}}
