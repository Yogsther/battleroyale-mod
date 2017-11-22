import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;


public class Main extends JavaPlugin{

    public static List<Player> players;

    public void onEnable(){

        // Get commands
        this.getCommand("start").setExecutor((CommandExecutor)new start());
        this.getCommand("initiate").setExecutor((CommandExecutor)new initiate());

    }


    public void onDisable(){
        System.out.println("mcBR disabled.");
    }

}
