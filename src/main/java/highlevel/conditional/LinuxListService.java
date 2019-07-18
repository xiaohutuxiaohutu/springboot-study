package highlevel.conditional;

import org.springframework.stereotype.Service;


public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
