package cn.keking.config;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

/**
 * @author kl (http://kailing.pub)
 * @since 2021/2/8
 */
public class AppBanner implements Banner {
    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        out.println(
                "  _      _      ______   _   _         __      __  _                   \n" +
                " | |    | |    |  ____| (_) | |        \\ \\    / / (_)                  \n" +
                " | | __ | | __ | |__     _  | |   ___   \\ \\  / /   _    ___  __      __\n" +
                " | |/ / | |/ / |  __|   | | | |  / _ \\   \\ \\/ /   | |  / _ \\ \\ \\ /\\ / /\n" +
                " |   <  |   <  | |      | | | | |  __/    \\  /    | | |  __/  \\ V  V / \n" +
                " |_|\\_\\ |_|\\_\\ |_|      |_| |_|  \\___|     \\/     |_|  \\___|   \\_/\\_/  \n");
    }
}
