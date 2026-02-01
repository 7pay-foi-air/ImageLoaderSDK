Setup instructions (for local use):
* 1.Once you have downloaded the repository, open it up as a new project in Android Studio.
* 2.Within the Android Studio terminal, position yourself in the project's root folder.
* 3.Excecute this command: $env:JAVA_HOME="C:\Program Files\Android\Android Studio\jbr" to set a temporary environment variable "JAVA_HOME" (alternatively you can set it globally on your system through enviroment variables and add it to your Path)
*the suggested path is an example, make sure that this aligns with your own system
* 4.Assemble your release using the command: /gradlew assembleRelease
* 5.Once assembled, publish your release locally using the command: ./gradlew publishToMavenLocal
* 6.The repository should now be locally published and you should be able to include it in your own project through build.gradle.kts using implementation("hr.foi.air:image-loader-sdk:1.0.3")
