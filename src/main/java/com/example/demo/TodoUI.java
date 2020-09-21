package com.example.demo;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;

@SpringUI
public class TodoUI extends UI {

    private VerticalLayout root;

    @Autowired
    TodoLayout todoLayout;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setupLayout();
        addHeader();
        addForm();
        addTodoList();
        addDeleteButton();
    }

    private void setupLayout() {
        root = new VerticalLayout();
        setContent(root);
    }

    private void addHeader() {
        root.addComponent(new Label("TODO's"));
    }

    private void addForm() {
        HorizontalLayout formLayout = new HorizontalLayout();

        TextField task = new TextField();
        Button add = new Button("Add");

        formLayout.addComponents(task, add);

        root.addComponent(formLayout);
    }

    private void addTodoList() {
        root.addComponent(todoLayout);
    }

    private void addDeleteButton() {
        root.addComponent(new Button("Delete completed"));
    }
}
