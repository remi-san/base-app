package net.remisan.app.controller.rest;

import net.remisan.app.model.test.Test;
import net.remisan.app.model.test.TestImpl;
import net.remisan.base.controller.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1/test")
public class TestRestController extends RestController<Test, TestImpl>{

}
