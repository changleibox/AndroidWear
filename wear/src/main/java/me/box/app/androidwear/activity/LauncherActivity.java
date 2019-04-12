package me.box.app.androidwear.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.baidaojuhe.library.baidaolibrary.activity.BDBaseActivity;
import com.baidaojuhe.library.baidaolibrary.util.BDLayout;

import butterknife.OnClick;
import me.box.app.androidwear.R;
import me.box.app.androidwear.service.IWatchFaceService;

/**
 * Created by box on 2019/4/11.
 */
public class LauncherActivity extends BDBaseActivity {

    @Override
    public void onInitViews(@NonNull Bundle arguments, @Nullable Bundle savedInstanceState) {
    }

    @Override
    public void onInitDatas(@NonNull Bundle arguments, @Nullable Bundle savedInstanceState) {
    }

    @Override
    public void onInitListeners(@NonNull Bundle arguments, @Nullable Bundle savedInstanceState) {
    }

    @Override
    public BDLayout getContainerLayout(@NonNull Bundle arguments, @Nullable Bundle savedInstanceState) {
        return BDLayout.create(R.layout.activity_launcher);
    }

    @OnClick({R.id.layout_classic_black, R.id.layout_wangxingren})
    public void onViewClicked(View view) {
        final Intent intent = new Intent(IWatchFaceService.ACTION_CHANGE_THEME);
        switch (view.getId()) {
            case R.id.layout_classic_black:
                intent.putExtra("theme", 1);
                break;
            case R.id.layout_wangxingren:
                intent.putExtra("theme", 2);
                break;
        }
        sendBroadcast(intent);
        finish();
    }
}
