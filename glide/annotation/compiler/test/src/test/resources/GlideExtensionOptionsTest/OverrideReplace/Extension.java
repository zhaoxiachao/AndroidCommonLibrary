package com.bumptech.glide.test;

import com.bumptech.glide.annotation.GlideExtension;
import com.bumptech.glide.annotation.GlideOption;
import com.bumptech.glide.request.BaseRequestOptions;

import androidx.annotation.NonNull;

@GlideExtension
public final class Extension {

    private Extension() {
        // Utility class.
    }

    @NonNull
    @GlideOption(override = GlideOption.OVERRIDE_REPLACE)
    public static BaseRequestOptions<?> centerCrop(BaseRequestOptions<?> requestOptions) {
        return requestOptions.centerCrop();
    }
}