package com.jdk.adarsh.file;


import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchKey;
import java.nio.file.WatchEvent;
import java.nio.file.WatchService;

import static java.nio.file.StandardWatchEventKinds.*;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: ${File.version} $, $Date:: 19/7/13 9:50 AM
 * @see
 */
public class FileWatcher {

    public static void main(String[] args) {
        FileWatcher fileWatcher = new FileWatcher();
        fileWatcher.startWatching("c:/test");
    }


    public final void startWatching(String directoryPath) {

        //define a folder root
        Path myDir = Paths.get(directoryPath);

        try {
            WatchService watcher = myDir.getFileSystem().newWatchService();
            myDir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);


                WatchKey watckKey = watcher.take();
                final List<WatchEvent<?>> events = watckKey.pollEvents();
                for (WatchEvent event : events) {

                    if (event.kind() == ENTRY_CREATE) {
                        System.out.println("Created: " + event.context().toString());
                    }
                    if (event.kind() == ENTRY_DELETE) {
                        System.out.println("Delete: " + event.context().toString());
                    }
                    if (event.kind() == ENTRY_MODIFY) {
                        System.out.println("Modify: " + event.context().toString());
                    }
                }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }

}
