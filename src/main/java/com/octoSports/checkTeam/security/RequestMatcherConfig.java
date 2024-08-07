package com.octoSports.checkTeam.security;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

import java.util.List;
import java.util.Optional;

@EnableWebSecurity
@AllArgsConstructor
@Configuration
public class RequestMatcherConfig implements RequestMatcher {

    private final List<AntPathRequestMatcher> requestMatchers = List.of(
            new AntPathRequestMatcher("/teams/allTeams"),
            new AntPathRequestMatcher("/teams/team/getById/*"));

    @Override
    public boolean matches(HttpServletRequest request) {
        Optional<AntPathRequestMatcher> rmOpt = requestMatchers
                .parallelStream().filter(rm -> rm.matches(request)).findFirst();
        return !rmOpt.isPresent();
    }
}
