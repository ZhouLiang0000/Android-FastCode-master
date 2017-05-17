package com.tangce.fastcode.routerlib.route;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by admin on 16/9/5.
 */
public interface IActivityRoute{

    /**
     * launch activity
     * @param context context
     */
    void open(Context context);

    /**
     * Create intent by extras data and bundle that parsed by uri
     * @param context The context to create intent
     * @return Intent that contains of extras data and bundle that parsed by uri
     */
    Intent createIntent(Context context);

    /**
     * set request code for {@link android.app.Activity#startActivityForResult(Intent, int)}
     * @param requestCode request code
     * @return IActivityRoute
     */
    IActivityRoute requestCode(int requestCode);

    /**
     * set anim to apply to {@link android.app.Activity#overridePendingTransition(int, int)}
     * @param enterAnim enter animation
     * @param exitAnim exit animation
     * @return IActivityRoute
     */
    IActivityRoute setAnim(int enterAnim, int exitAnim);

    /**
     * reset bundle to {@link ActivityRouteBundleExtras}
     * @param extras bundle data
     * @return IActivityRoute
     */
    IActivityRoute addExtras(Bundle extras);

    /**
     * {@link Intent#addFlags(int)}
     * @param flag flag
     * @return IActivityRoute
     */
    IActivityRoute addFlags(int flag);

    /**
     * replace {@link ActivityRouteBundleExtras} to {@link ActivityRoute}
     * @param extras {@link ActivityRouteBundleExtras}
     */
    IActivityRoute replaceBundleExtras(ActivityRouteBundleExtras extras);
}
