/**
 * Precompiled [android-base-app.gradle.kts][Android_base_app_gradle] script plugin.
 *
 * @see Android_base_app_gradle
 */
class AndroidBaseAppPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Android_base_app_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
