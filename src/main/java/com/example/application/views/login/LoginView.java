package com.example.application.views.login;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.component.Component;
import elemental.json.Json;
import com.vaadin.flow.data.renderer.TemplateRenderer;
import java.nio.charset.StandardCharsets;
import com.vaadin.flow.component.upload.Upload;
import org.springframework.web.util.UriUtils;
import com.vaadin.flow.component.html.Label;
import java.util.Base64;
import com.vaadin.flow.component.html.Image;
import java.io.ByteArrayOutputStream;
import com.vaadin.flow.component.textfield.TextField;

@PageTitle("Login")
@Route(value = "login")
public class LoginView extends LoginOverlay {
    public LoginView() {
        setAction("login");

        LoginI18n i18n = LoginI18n.createDefault();
        i18n.setHeader(new LoginI18n.Header());
        i18n.getHeader().setTitle("Dashboard");
        i18n.getHeader().setDescription("Login using user/user or admin/admin");
        i18n.setAdditionalInformation(null);
        setI18n(i18n);

        setForgotPasswordButtonVisible(false);
        setOpened(true);
    }

}
