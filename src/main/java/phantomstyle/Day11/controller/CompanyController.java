package phantomstyle.Day11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import phantomstyle.Day11.CompanyRowMapper;
import phantomstyle.Day11.dao.CompanyDao;
import phantomstyle.Day11.domain.Company;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyDao companyDao;

    @GetMapping("/all")
    List<Company> findAll(){
        return companyDao.getAll();
    }

    @GetMapping("/{id}")
    Company findById(@PathVariable("id") Long id){
        return companyDao.getById(id);
    }

    @PostMapping("/insert")
    Company insert(@RequestBody Company company){
        companyDao.insert(company);
        return company;
    }

    @PostMapping("/update")
    Company update(@RequestBody Company company){
        companyDao.update(company);
        return company;
    }
}
