/*
 * Copyright (C) 2013 AOKP by Mike Wilson - Zaphod-Beeblebrox && Steve Spear - Stevespear426
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.internal.util.vanir;

public class VanirConstants {

    public static final String ASSIST_ICON_METADATA_NAME = "com.android.systemui.action_assist_icon";

    public static enum VanirConstant {
        ACTION_HOME          { @Override public String value() { return "**home**";}},
        ACTION_BACK          { @Override public String value() { return "**back**";}},
        ACTION_MENU          { @Override public String value() { return "**menu**";}},
        ACTION_SEARCH        { @Override public String value() { return "**search**";}},
        ACTION_RECENTS       { @Override public String value() { return "**recents**";}},
        ACTION_ASSIST        { @Override public String value() { return "**assist**";}},
        ACTION_POWER         { @Override public String value() { return "**power**";}},
   //     ACTION_SCREENSHOT    { @Override public String value() { return "**screenshot**";}},
        ACTION_NOTIFICATIONS { @Override public String value() { return "**notifications**";}},
        ACTION_CLOCKOPTIONS  { @Override public String value() { return "**clockoptions**";}},
        ACTION_VOICEASSIST   { @Override public String value() { return "**voiceassist**";}},
        ACTION_LAST_APP      { @Override public String value() { return "**lastapp**";}},
        ACTION_RECENTS_GB    { @Override public String value() { return "**recentsgb**";}},
        ACTION_TORCH         { @Override public String value() { return "**torch**";}},
        ACTION_IME           { @Override public String value() { return "**ime**";}},
        ACTION_KILL          { @Override public String value() { return "**kill**";}},
        ACTION_SILENT        { @Override public String value() { return "**ring_silent**";}},
        ACTION_VIB           { @Override public String value() { return "**ring_vib**";}},
        ACTION_SILENT_VIB    { @Override public String value() { return "**ring_vib_silent**";}},
        ACTION_EVENT         { @Override public String value() { return "**event**";}},
        ACTION_TODAY         { @Override public String value() { return "**today**";}},
        ACTION_ALARM         { @Override public String value() { return "**alarm**";}},
        ACTION_NULL          { @Override public String value() { return "**null**";}},
        ACTION_BLANK         { @Override public String value() { return "**blank**";}},
        ACTION_APP           { @Override public String value() { return "**app**";}};
        public String value() { return this.value(); }
    }

    public static VanirConstant fromString(String string) {
        VanirConstant[] allTargs = VanirConstant.values();
        for (int i=0; i < allTargs.length; i++) {
            if (string.equals(allTargs[i].value())) {
                return allTargs[i];
            }
        }
        // not in ENUM must be custom
        return VanirConstant.ACTION_APP;
    }
}
