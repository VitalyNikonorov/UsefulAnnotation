package net.nikonorov.lib;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Vitaly Nikonorov on 26.05.2018.
 * email@nikonorov.net
 */
@Retention(RetentionPolicy.SOURCE)
public @interface NeedRefactoring {
    String description();
}
