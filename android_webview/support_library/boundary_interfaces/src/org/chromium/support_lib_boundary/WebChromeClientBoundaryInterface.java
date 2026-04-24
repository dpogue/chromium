// Copyright 2026 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.support_lib_boundary;

import android.graphics.Color;
import android.webkit.WebView;

import androidx.annotation.IntDef;

import org.jspecify.annotations.NullMarked;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/** Boundary interface for WebChromeClientCompat. */
@NullMarked
public interface WebChromeClientBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    @IntDef({ViewportFitType.AUTO, ViewportFitType.CONTAIN, ViewportFitType.COVER})
    @Retention(RetentionPolicy.SOURCE)
    @interface ViewportFitType {
        int AUTO = 0;
        int CONTAIN = 1;
        int COVER = 2;
    }

    void onReceivedThemeColor(WebView view, Color color);

    void onViewportFitChanged(WebView view, @ViewportFitType int value);
}
