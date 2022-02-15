package com.TShell.controller;

import com.TShell.repository.HostRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;


/**
 * @author TheBlind
 * @date 2022/2/14
 */
@Controller("/host")
public class HostController {


    HostRepository hostRepository;

    public HostController(HostRepository hostRepository) {
        this.hostRepository = hostRepository;
    }

    @Get("/{categoryId}")
    public String get(String categoryId) {
        hostRepository.findAll();
        return "";
    }


}
