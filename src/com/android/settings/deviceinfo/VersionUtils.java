
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getCannedVersion(){
        String buildType = SystemProperties.get("ro.cannedversion","");
	return buildType.equals("") ? "" : buildType;
    }
}
