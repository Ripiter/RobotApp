package com.skp.Robot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.skp.Robot.controll.BothHandFragment;
import com.skp.Robot.controll.RighttHandFragment;
import com.skp.Robot.controll.LeftHandFragment;
import com.sanbot.opensdk.base.TopBaseActivity;
import com.sanbot.opensdk.beans.FuncConstant;
import com.sanbot.opensdk.function.beans.finger.CombinationFingerMotion;
import com.sanbot.opensdk.function.beans.handmotion.CombinationHandMotion;
import com.sanbot.opensdk.function.unit.FingerMotionManager;
import com.sanbot.opensdk.function.unit.HandMotionManager;
import com.sanbot.opensdk.function.unit.HardWareManager;
import com.sanbot.opensdk.function.unit.interfaces.hardware.HandStatusListener;
import com.sanbot.opensdk.setting.Setting;

public class MainActivity extends AppCompatActivity {

    private FingerMotionManager fingerMotionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fingerMotionManager = (FingerMotionManager) getUnitManager(FuncConstant.FINGER_MANAGER)

    }
}