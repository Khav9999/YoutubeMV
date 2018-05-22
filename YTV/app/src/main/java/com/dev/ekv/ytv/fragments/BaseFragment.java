package com.dev.ekv.ytv.fragments;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.dev.ekv.ytv.activities.BaseActivity;

/**
 * Created by EKV on 5/11/2018 AD.
 */

public class BaseFragment extends Fragment {
    protected BaseActivity mActivity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(mActivity==null && context instanceof BaseActivity){
            mActivity = (BaseActivity) context;
        }
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
    }
}
