package net.lovexq.game.java;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import net.lovexq.game.core.GameMain;

public class GameMainDesktop {
    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "新决战朝鲜";
        config.width = 800;
        config.height = 600;
        new LwjglApplication(new GameMain(), config);
    }
}
