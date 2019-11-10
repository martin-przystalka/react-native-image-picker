package com.imagepicker.testing.media;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.WritableMap;
import com.imagepicker.media.ImageConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import java.io.File;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by rusfearuth on 11.04.17.
 */

@RunWith(RobolectricTestRunner.class)
public class ImageConfigTest
{

    private JavaOnlyMap defaultOptions()
    {
        JavaOnlyMap options = new JavaOnlyMap();
        options.putInt("maxWidth", 1000);
        options.putInt("maxHeight", 600);
        options.putDouble("quality", 0.5);
        options.putInt("rotation", 135);

        JavaOnlyMap storage = new JavaOnlyMap();
        storage.putBoolean("cameraRoll", true);

        options.putMap("storageOptions", storage);

        return options;
    }
}
