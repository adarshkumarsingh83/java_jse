package com.espark.adarsh.shell;

import jdk.jshell.JShell;
import jdk.jshell.Snippet;
import jdk.jshell.SnippetEvent;
import jdk.jshell.SourceCodeAnalysis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class JShellScriptExecutor {

    public void evaluate(String scriptFileName) {
        try (JShell jshell = JShell.create()) {
            // Handle snippet events. We can print value or take action if evaluation failed.
            jshell.onSnippetEvent(snippetEvent -> snippetEventHandler(snippetEvent));
            String scriptContent = new String(Files.readAllBytes(Paths.get(scriptFileName)));
            String s = scriptContent;
            while (true) {
                // Read source line by line till semicolon (;)
                SourceCodeAnalysis.CompletionInfo an = jshell.sourceCodeAnalysis().analyzeCompletion(s);
                if (!an.completeness().isComplete()) {
                    break;
                }
                // If there are any method declaration or class declaration
                // in new lines, resolve it.
                jshell.eval(trimNewlines(an.source()));
                // EOF
                if (an.remaining().isEmpty()) {
                    break;
                }
                // If there is semicolon, execute next seq
                s = an.remaining();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void snippetEventHandler(SnippetEvent snippetEvent) {
        String value = snippetEvent.value();
        if (!Objects.isNull(value) && value.trim().length() > 0) {
            // Prints output of code evaluation
            System.out.println(value);
        }
        // If there are any erros print and exit
        if (Snippet.Status.REJECTED.equals(snippetEvent.status())) {
            System.out.println("Evaluation failed : " + snippetEvent.snippet().toString()
                    + "\nIgnoring execution of above script");
        }
    }

    private String trimNewlines(String s) {
        int b = 0;
        while (b < s.length() && s.charAt(b) == '\n') {
            ++b;
        }
        int e = s.length() - 1;
        while (e >= 0 && s.charAt(e) == '\n') {
            --e;
        }
        return s.substring(b, e + 1);
    }


}
