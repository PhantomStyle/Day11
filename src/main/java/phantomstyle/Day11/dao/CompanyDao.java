package phantomstyle.Day11.dao;

import phantomstyle.Day11.domain.Company;

import java.util.List;

public interface CompanyDao {
    Company getById(Long id);

    List<Company> getAll();

    Company insert(Company company);

    Company update(Company company);

}
