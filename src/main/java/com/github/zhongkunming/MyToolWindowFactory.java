package com.github.zhongkunming;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBPanel;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jspecify.annotations.NonNull;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyToolWindowFactory implements ToolWindowFactory {

    @Override
    public boolean shouldBeAvailable(@NonNull Project project) {
        return true;
    }

    @Override
    public void createToolWindowContent(Project project, ToolWindow toolWindow) {
        MyToolWindow myToolWindow = new MyToolWindow();
        Content content = ContentFactory.getInstance()
                .createContent(myToolWindow.getContent(), null, false);
        toolWindow.getContentManager().addContent(content);
    }

    static class MyToolWindow {
        private final JBPanel<JBPanel<?>> content;

        public MyToolWindow() {
            content = new JBPanel<>();
            content.setLayout(new FlowLayout());

            JBLabel label = new JBLabel(MyMessageBundle.message("toolwindow.MyToolWindow.number.label", '0'));
            content.add(label);

            JButton button = new JButton(MyMessageBundle.message("toolwindow.MyToolWindow.shuffle.button"));
            button.addActionListener(e -> {
                String newText = String.format(
                        MyMessageBundle.message("toolwindow.MyToolWindow.number.label"),
                        new Random(System.currentTimeMillis()).nextInt(1000)
                );
                label.setText(newText);
            });
            content.add(button);
        }

        public JBPanel<JBPanel<?>> getContent() {
            return content;
        }
    }
}
