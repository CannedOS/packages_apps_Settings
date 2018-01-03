
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getCannedVersion(){
        String buildType = SystemProperties.get("ro.canned.build.version","");
	return buildType.equals("") ? "" : buildType;
    }
}
