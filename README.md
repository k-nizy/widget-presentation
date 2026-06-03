# Card Widget (Material 3)

Minimal Android Studio sample: `MaterialCardView` in XML with a Kotlin `AppCompatActivity`.

**Package:** `com.example.card`

## Run

Open the project in Android Studio and run the **app** configuration on an emulator or device (API 24+).

## Project structure

```
app/src/main/
├── java/com/example/card/MainActivity.kt
├── res/layout/activity_main.xml
├── res/values/themes.xml
└── AndroidManifest.xml
```

## Card properties — 3-minute presentation

1. **Corner radius (`cardCornerRadius="24dp"`)** — Rounds the card’s corners so content reads as a contained surface instead of a sharp rectangle. Larger values feel softer and more prominent; smaller values stay closer to a standard panel.

2. **Elevation (`cardElevation="8dp"`)** — Lifts the card above the background with a shadow so it appears layered and tappable. Higher elevation increases separation from the screen; lower elevation keeps the card flatter and closer to the surface.

3. **Stroke (`strokeWidth="2dp"` + primary `strokeColor`)** — Draws a visible outline around the card edge without relying on shadow alone. Useful for emphasis, focus states, or when elevation is reduced; here the stroke uses the theme primary color so the border matches brand accent.

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
