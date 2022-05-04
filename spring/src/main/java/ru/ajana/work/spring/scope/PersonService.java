package ru.ajana.work.spring.scope;

import static org.springframework.web.context.WebApplicationContext.SCOPE_APPLICATION;
import static org.springframework.web.context.WebApplicationContext.SCOPE_REQUEST;
import static org.springframework.web.context.WebApplicationContext.SCOPE_SESSION;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
// @Scope(SCOPE_SINGLETON)
// @Scope(SCOPE_PROTOTYPE)
@Scope(SCOPE_REQUEST)
//@Scope(SCOPE_SESSION)
//@Scope(SCOPE_APPLICATION)
//@Scope(SCOPE_WEBSOCKET)
public class PersonService {}
