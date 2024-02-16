# Clean Empty Jetpack Compose App Template

This is the default Jetpack Compose template app that I use as a starting point. There are no themes.xml and colors.xml in the project. By default, Gradle KTS is used, and no testing libraries are included. 

For different versions of this template app, refer to different branches of this repository

## Requirements
- Android Studio Giraffe or later

## Tech Stack
| Tech Stack | High-level Implementation Description |
| --- | --- |
| [Jetpack Compose](https://developer.android.com/jetpack/compose) | Implement reactive UI using composable functions | 
| [Accompanist System UI Controller](https://google.github.io/accompanist/systemuicontroller) | Set system bars color |
| [New Splash Screen](https://developer.android.com/develop/ui/views/launch/splash-screen) | Implement new splash screen based on API >= 31 that works on all previous API levels |
| [Material 3 Dynamic Color](https://m3.material.io/styles/color/dynamic-color/overview) | Add dynamic color support for >= API 31 |
| [Version Catalog](https://docs.gradle.org/current/userguide/platforms.html) (master_vercatalog branch) | Implement version catalog as central declaration of dependencies |
| [Gradle KTS](https://docs.gradle.org/current/userguide/kotlin_dsl.html) / [Groovy](https://groovy-lang.org/) (master_groovy branch) | Migrate build script from Groovy to Gradle KTS |
| [Material 3](https://m3.material.io/) / [Material 2](https://m2.material.io/) (master_groovy branch) | Use the latest material design |
| [BuildUtils](https://github.com/vinchamp77/buildutils) (own library) | Avoid hard coding build version code (API level) to improve code readability |
| [Spotless Plugin](https://plugins.gradle.org/plugin/com.diffplug.gradle.spotless) | Automate code formatting for Kotlin and copyright text | 

## Articles
- [Clean Empty Jetpack Compose App Template](https://vtsen.hashnode.dev/clean-empty-jetpack-compose-app-template) - Rename the App Example. See [diff](https://github.com/vinchamp77/Demo_CleanEmptyCompose/commit/4f86b00ebfa04a91e830f312cfd6c442d23e885a).
- [Beginner's Guide to Understand Build Gradle Files in Android Studio](https://vtsen.hashnode.dev/beginners-guide-to-understand-build-gradle-files-in-android-studio)
- [How to Convert Android Gradle Groovy to KTS?](https://vtsen.hashnode.dev/how-to-convert-android-gradle-groovy-to-kts)
- [How to add Version Catalog to your Android App?](https://vtsen.hashnode.dev/how-to-add-version-catalog-to-your-android-app)
- [Implement Default Splash Screen Prior to Android 12](https://vtsen.hashnode.dev/implement-default-splash-screen-prior-to-android-12)
- [Convert Android App to Use Material 3 Design](https://vtsen.hashnode.dev/convert-android-app-to-use-material-3-design)
- [How to Add Spotless Code Formatter to your Android Project?](https://vtsen.hashnode.dev/how-to-add-spotless-code-formatter-to-your-android-project)

## Branches
- [master](https://github.com/vinchamp77/Demo_CleanEmptyCompose) - Gradle KTS (no testing libraries)
- [master_withtest](https://github.com/vinchamp77/Demo_CleanEmptyCompose/tree/master_notest) - Gradle KTS (with testing libraries)
- [master_vercatalog](https://github.com/vinchamp77/Demo_CleanEmptyCompose/tree/master_vercatalog) - Gradle KTS (version catalog, no testing libraries) 
- [master_groovy](https://github.com/vinchamp77/Demo_CleanEmptyCompose/tree/master_groovy) - Gradle Groovy (no testing libraries, material 2)

## License
```
Copyright 2023 Vincent Tsen

Licensed under the Apache License, Version 2.0 (the "License");

you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
