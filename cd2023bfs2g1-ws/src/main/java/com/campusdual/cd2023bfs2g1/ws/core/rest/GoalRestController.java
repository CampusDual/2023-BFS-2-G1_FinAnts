package com.campusdual.cd2023bfs2g1.ws.core.rest;

import com.campusdual.cd2023bfs2g1.api.core.service.IGoalService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goals")
public class GoalRestController extends ORestController<IGoalService> {
    @Autowired
    private IGoalService goalService;
    @Override
    public IGoalService getService() {
        return this.goalService;
    }
}
