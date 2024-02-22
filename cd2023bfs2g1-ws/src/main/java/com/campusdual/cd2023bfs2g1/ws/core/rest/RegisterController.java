package com.campusdual.cd2023bfs2g1.ws.core.rest;

import com.campusdual.cd2023bfs2g1.api.core.service.IRegisterService;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/app/public")
public class RegisterController extends ORestController<IRegisterService> {
    @Autowired
    private IRegisterService registerServ;

    @Override
    public IRegisterService getService() {
        return this.registerServ;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerNewUser(@RequestBody Map<String, Object> registrationData) {
        try {
            Map<String, Object> data = (Map<String, Object>) registrationData.get("data");
            EntityResult result = registerServ.registerInsert(data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (OntimizeJEERuntimeException e) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body(e.getMessage());
        }
    }

}
