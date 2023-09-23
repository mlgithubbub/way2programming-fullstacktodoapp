package com.way2p.todo.config;

import com.way2p.todo.entity.Todo;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelProcessor;

@Configuration
public class MyEntityProcessor implements RepresentationModelProcessor<EntityModel<Todo>> {

    @Override
    public EntityModel<Todo> process(EntityModel<Todo> model) {
        return EntityModel.of(model.getContent());
    }
}
