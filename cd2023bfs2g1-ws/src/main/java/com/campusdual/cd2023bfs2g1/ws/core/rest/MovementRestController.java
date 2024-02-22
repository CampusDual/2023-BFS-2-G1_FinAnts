package com.campusdual.cd2023bfs2g1.ws.core.rest;

import com.campusdual.cd2023bfs2g1.api.core.service.IMovementService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movements")

    public class MovementRestController extends ORestController<IMovementService> {
        @Autowired
        private IMovementService movementService;
        @Override
        public IMovementService getService() {
            return this.movementService;
        }
    }

