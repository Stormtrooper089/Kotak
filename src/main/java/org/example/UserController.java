package org.example;

import org.example.Command.Fire;
import org.example.Services.GameManagementService;

@RestController
public class UserController {

    @Autowired
    GameManagementService gameManagementService;

    public void fire(Fire request){
        gameManagementService.fire(request);
    }



}
