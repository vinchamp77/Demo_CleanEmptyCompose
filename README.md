# Clean Empty Jetpack Compose App Template

This is the default Jetpack Compose template app that I use as a starting point. There are no themes.xml and colors.xml in the project. By default, Gradle KTS is used and no testing libraries are included. 

For different versions of this template app, refer to different branches of this repository

## Requirements
- Android Studio Electric Eel or later

## Tech Stack
- Jetpack Compose
- Accompanist System UI controller
- New Splash Screen based on API >= 31 (works on all previous API levels)
- Dynamic Color (API >= 31)
- Version Catalog (master_vercatalog branch)
- Gradle KTS / Groovy
- Material 3 / Material 2 (master_groovy branch)
- [BuildUtils](https://github.com/vinchamp77/buildutils) (own library)

## Articles
- [Clean Empty Jetpack Compose App Template](https://vtsen.hashnode.dev/clean-empty-jetpack-compose-app-template) - Rename the App Example. See [diff](https://github.com/vinchamp77/Demo_CleanEmptyCompose/commit/4f86b00ebfa04a91e830f312cfd6c442d23e885a).
- [How to Convert Android Gradle Groovy to KTS?](https://vtsen.hashnode.dev/how-to-convert-android-gradle-groovy-to-kts)
- [How to add Version Catalog to your Android App?](https://vtsen.hashnode.dev/how-to-add-version-catalog-to-your-android-app)
- [Implement Default Splash Screen Prior to Android 12](https://vtsen.hashnode.dev/implement-default-splash-screen-prior-to-android-12)

## Branches
- [master](https://github.com/vinchamp77/Demo_CleanEmptyCompose) - Gradle KTS (no testing libraries)
- [master_withtest](https://github.com/vinchamp77/Demo_CleanEmptyCompose/tree/master_notest) - Gradle KTS (with testing libraries)
- [master_vercatalog](https://github.com/vinchamp77/Demo_CleanEmptyCompose/tree/master_vercatalog) - Gradle KTS (version catalog, no testing libaries) 
- [master_groovy](https://github.com/vinchamp77/Demo_CleanEmptyCompose/tree/master_groovy) - Gradle Groovy (no testing libaries, material 2)
