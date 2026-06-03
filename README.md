# Card Widget (Material 3) — presentation 3 June 2026

Minimal Android Studio sample: `MaterialCardView` in XML with a Kotlin `AppCompatActivity`.

**Package:** `com.example.card`

## Run

1. Clone **https://github.com/k-nizy/widget-presentation** (public repo).
2. Open the folder in **Android Studio** → wait for Gradle sync.
3. Start an emulator (API 24+) or connect a device → click **Run ▶** on the `app` module.
4. You should see a centered **MaterialCardView** with title, description, and button.



## Presentation & submission notes

For the **code and verbal explanation** (3–5 min), walk the class step by step: `AndroidManifest.xml` registers the launcher → `MainActivity.kt` calls `setContentView(R.layout.activity_main)` → `activity_main.xml` uses a centered `FrameLayout` and `MaterialCardView` with a `LinearLayout` for title, description, and button → `themes.xml` applies `Theme.Material3` and `colorPrimary` for the stroke. Code is organised and lightly commented so each line maps to the UI on the emulator.

For the **widget attribute demonstration**, name three properties in `activity_main.xml` and change them live: **`cardCornerRadius`** (default `0dp`, demo `24dp` → rounded shape; try `40dp` for a stronger curve—used for visual emphasis); **`cardElevation`** (default `0dp`, demo `8dp` → shadow/depth; compare `0dp` vs `16dp`—used to show hierarchy and interactivity); **`strokeWidth`** + **`strokeColor`** (default no border, demo `2dp` + primary color → outline; set width to `0dp` to remove—used when you want a clear edge without relying on shadow alone). The **GitHub repo** is public at **k-nizy/widget-presentation** with run steps above, attribute notes here, a screenshot in `docs/screenshot.png`, and meaningful commits by **k-nizy**—post the link before **5:00 PM** on the due date.

## Project structure

```
app/src/main/
├── java/com/example/card/MainActivity.kt
├── res/layout/activity_main.xml
├── res/values/themes.xml
└── AndroidManifest.xml
```

## Essential code

### `activity_main.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="24dp">

    <com.google.android.material.card.MaterialCardView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        app:cardCornerRadius="24dp"
        app:cardElevation="8dp"
        app:strokeWidth="2dp"
        app:strokeColor="?attr/colorPrimary">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:padding="20dp">

            <TextView
                android:id="@+id/card_title"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="@string/card_title"
                android:textAppearance="?attr/textAppearanceHeadlineSmall" />

            <TextView
                android:id="@+id/card_description"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="8dp"
                android:text="@string/card_description"
                android:textAppearance="?attr/textAppearanceBodyMedium" />

            <com.google.android.material.button.MaterialButton
                android:id="@+id/card_action"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:text="@string/card_action" />

        </LinearLayout>

    </com.google.android.material.card.MaterialCardView>

</FrameLayout>
```

### `MainActivity.kt`

```kotlin
package com.example.card

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
```

### `themes.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>

    <style name="Theme.CardWidget" parent="Theme.Material3.DayNight.NoActionBar">
        <item name="colorPrimary">@color/md_theme_primary</item>
        <item name="colorOnPrimary">@color/md_theme_on_primary</item>
        <item name="colorSurface">@color/md_theme_surface</item>
        <item name="colorOnSurface">@color/md_theme_on_surface</item>
    </style>

</resources>
```

Made by **k-nizy** (Kevin Nizy).
