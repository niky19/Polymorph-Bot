import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.Activity

class PolymorphBotApplication {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val token = "token"

            //Create a new JDA instance
            val jda = JDABuilder.createDefault(token)
                .addEventListeners(PingCommand())
                .build()

            jda.upsertCommand("ping", "Send a ping command").queue()

            //Set the activity
            jda.presence.activity = Activity.playing("polymorphserqer")
        }
    }
}