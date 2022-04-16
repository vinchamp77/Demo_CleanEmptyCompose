package vtsen.hashnode.dev.newemptycomposeapp

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("vtsen.hashnode.dev.newemptycomposeapp", appContext.packageName)
    }

    @Test
    fun helloAndroidText_exists() {
        val text = composeTestRule.activity.getString(R.string.hello_android)
        composeTestRule.onNodeWithText(text).assertExists()
    }
}