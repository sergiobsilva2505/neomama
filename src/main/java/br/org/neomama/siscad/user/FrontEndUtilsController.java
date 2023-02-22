package br.org.neomama.siscad.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class FrontEndUtilsController {

    private final UserRepository userRepository;

    public FrontEndUtilsController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/size")
    public ResponseEntity<ResponseUserCode> getSize() {
        long sizeUserCreated = userRepository.getSizeUserCreated(LocalDate.of(2023, 02, 13));
        ResponseUserCode responseUserCode = new ResponseUserCode();
        responseUserCode.setLastNumber(sizeUserCreated);
        return ResponseEntity.ok().body(responseUserCode);
    }
}
