@RestController
@RequestMapping("/patients")

public class PatientsController {

    private patientsRepository patientsRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public PatientsController(patientsRepository patientsRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.patientsRepository = patientsRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }


    @RequestMapping(value = "/sing-up", method = RequestMethod.POST)
    public void signUp(@RequestBody Patiens patiens){
        patiens.setPassword(bCryptPasswordEncoder.encode(patiens.getPassword()));
        patientsRepository.save(patiens);
    }
}