package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

public class EndpointsAsyncTaskTest extends AndroidTestCase {

    public void testGetJoke() throws Exception {
        String result = new EndpointsAsyncTask(getContext()).doInBackground(getContext());

        assertNotSame("", result);
    }
}