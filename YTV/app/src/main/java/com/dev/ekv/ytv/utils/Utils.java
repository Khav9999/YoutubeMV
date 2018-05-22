package com.dev.ekv.ytv.utils;

import android.graphics.Color;

import com.dev.ekv.ytv.R;

public class Utils {
    public static int[][] navigationItemStates = new int[][]{
            new int[]{-android.R.attr.state_enabled}, // State Disabled
            new int[]{android.R.attr.state_enabled} , // Satate Enabled
            new int[]{-android.R.attr.state_checked}, // State Unchecked
            new int[]{android.R.attr.state_pressed},  // State Pressed
            new int[]{android.R.attr.state_hovered},
    };
    public static int[] navigationItemColorFitWithStates = new int[]{
            R.color.colorPrimary,
            R.color.colorPrimary,
            R.color.colorPrimary,
            R.color.colorPrimary,
            R.color.colorPrimaryDark
    };
}
