package com.wuzhongyuan.hotfixapplication;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Author: wuzhongyuan
 * Date: 2022/8/4
 * describe:
 */
public class MyApplication extends TinkerApplication {

    public MyApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL,
                "com.wuzhongyuan.hotfixapplication.MyApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader",
                false);
    }
}
