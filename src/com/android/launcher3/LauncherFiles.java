package com.android.launcher3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Central list of files the Launcher writes to the application data directory.
 *
 * To add a new Launcher file, create a String constant referring to the filename, and add it to
 * ALL_FILES, as shown below.
 */
public class LauncherFiles {

    private static final String XML = ".xml";

    public static final String LAUNCHER_DB = "launcher.db";
    public static final String LAUNCHER_DB2 = "zapps.db";
    public static final String SHARED_PREFERENCES_KEY = BuildConfig.APPLICATION_ID + "_preferences";
    public static final String OLD_SHARED_PREFERENCES_KEY = "com.saggitt.omega.prefs";
    public static final String MANAGED_USER_PREFERENCES_KEY = "com.saggitt.omega.managedusers.prefs";
    // This preference file is not backed up to cloud.
    public static final String DEVICE_PREFERENCES_KEY = "com.saggitt.omega.device.prefs";

    public static final String WIDGET_PREVIEWS_DB = "widgetpreviews.db";
    public static final String APP_ICONS_DB = "app_icons.db";

    // Google Reflection client preferences
    public static final String REFLECTION_PREFERENCES_KEY = "reflection.private.properties";

    public static final List<String> ALL_FILES = Collections.unmodifiableList(Arrays.asList(
            LAUNCHER_DB,
            LAUNCHER_DB2,
            SHARED_PREFERENCES_KEY + XML,
            WIDGET_PREVIEWS_DB,
            MANAGED_USER_PREFERENCES_KEY + XML,
            DEVICE_PREFERENCES_KEY + XML,
            REFLECTION_PREFERENCES_KEY + XML,
            APP_ICONS_DB));
}
