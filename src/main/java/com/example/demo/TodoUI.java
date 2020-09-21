package com.example.demo;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
public class TodoUI extends UI {

    private VerticalLayout root;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setupLayout();
        addHeader();
        addForm();
        addTodoList();
        addDeleteButton();
    }

    private void setupLayout() {

    }

    private void addHeader() {

    }

    private void addForm() {

    }

    private void addTodoList() {

    }

    private void addDeleteButton() {

    }
}
